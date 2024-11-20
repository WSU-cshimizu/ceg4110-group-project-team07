/*
    script.js (javascript for GeoSyncra website)
    ceg411
    Anna Crafton
    last updated 10/24/2024
    
*/


  /*setTime()
    Function to display the time for clock in index.html */

 function setTime(){

    var date = new Date();
    var timeString = date.toLocaleTimeString()

    document.getElementById("clock").textContent=timeString;

 }

 /*Update the clock every second*/
 setInterval(setTime, 1000); 



 
