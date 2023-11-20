function loadDoc() {
  var openweathermapapi = new XMLHttpRequest();
  openweathermapapi.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        var temperature = JSON.parse(this.responseText);
      document.getElementById("demo").innerHTML = this.responseText;
    }
  };

  openweathermapapi.open("GET", "http://api.openweathermap.org/data/2.5/weather?q=Best&APPID=9c0299218db10c8423221d49842d8488", true);

  openweathermapapi.send();
}
