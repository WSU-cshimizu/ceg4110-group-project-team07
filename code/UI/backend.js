/*Gokulnaath07 Backend Code
Last Updated 10/31/2024 */

// Function to search for locations
function searchLocation() {
    const location = document.getElementById('searchBar').value;
    if (location) {
        // Redirect to viewImage.html with the location as a query parameter
        window.location.href = `viewImage.html?location=${encodeURIComponent(location)}`;
    } else {
        alert("Please enter a location to search.");
    }
}

// Function to get query parameters from the URL
function getQueryParams(param) {
    const urlParams = new URLSearchParams(window.location.search);
    return urlParams.get(param);
}

let currentPage = 0;
const pageSize = 3; // Number of items per page

// Function to fetch image details with pagination
function fetchImageDetails() {
    const location = getQueryParams('location');
    if (location) {
        fetch(`http://localhost:5151/location/${location}?page=${currentPage}&size=${pageSize}`)
            .then(response => {
                if (!response.ok) {
                    throw new Error('Image not found');
                }
                return response.json();
            })
            .then(data => {
                const article = document.querySelector('article');
                article.innerHTML = ''; // Clear existing content

                // Loop through each image detail and create HTML elements
                data.forEach(image => {
                    const imageElement = document.createElement('div');
                    imageElement.className = 'image-details';

                    imageElement.innerHTML = `<div class="image-info">
                            <h4>${image.name}</h4>
                            <p><strong>Location:</strong> ${image.location}</p>
                            <p>${image.description}</p>
                        </div>
                        <button class="view-image-button">View Image</button>
                    `;
                    article.appendChild(imageElement);
                });

                // Update page controls
                updatePageControls();
            })
            .catch(error => {
                console.error('Error:', error);
                alert(error.message);
            });
    } else {
        console.log('No location provided!');
    }
}

// Function to update pagination controls
function updatePageControls() {
    const pageControls = document.getElementById('pageControls');
    pageControls.innerHTML = `
        <button onclick="changePage(-1)" ${currentPage === 0 ? 'disabled' : ''}>Previous</button>
        <span>Page ${currentPage + 1}</span>
        <button onclick="changePage(1)">Next</button>
    `;
}

// Function to change the page
function changePage(direction) {
    currentPage += direction;
    fetchImageDetails(); // Fetch the new page of images
}

// Automatically fetch the first page of image details when the page loads
window.onload = fetchImageDetails;


document.getElementById('uploadForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the default form submission

    // Create a new FormData object
    const formData = new FormData(this);

    // Display status message
    const uploadStatus = document.getElementById('uploadStatus');
    uploadStatus.textContent = 'Uploading...';

    // Use fetch API to send the form data to your server
    fetch('http://localhost:5151/uploadImages', { // Use the correct endpoint
        method: 'POST',
        body: formData,
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Upload failed');
            }
            return response.json(); // Assuming your server returns JSON
        })
        .then(data => {
            uploadStatus.textContent = 'Upload successful: ' + data.message; // Display success message
        })
        .catch(error => {
            uploadStatus.textContent = 'Error: ' + error.message; // Display error message
        });
});