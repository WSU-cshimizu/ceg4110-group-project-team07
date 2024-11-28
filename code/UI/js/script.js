/*
    script.js (javascript for GeoSyncra website)
    ceg411
    Anna Crafton
    last updated 11/28/2024
    
*/


  /*Function to display the time for clock in index.html */
 function setTime(){

    var date = new Date();
    var timeString = date.toLocaleTimeString()

    document.getElementById("clock").textContent=timeString;

 }

 /*Update the clock every second*/
 setInterval(setTime, 1000); 


 /*Function to increment Like Button*/
 function like() {

   var str = document.getElementById('numLikes').value;

   /*keep only the number portion of value and increment it*/
   var numLikes = str.split(' ')[0];
   numLikes++;

   document.getElementById('numLikes').value = `${numLikes} Likes`;


}

 
