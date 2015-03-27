$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/soapui/weatherService.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "\r\n      As weather web service user\r\n\r\n      I will be able to get the weather information by the predefined operations in the WSDL",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "Get the city weather information by zipcode",
  "description": "",
  "id": ";get-the-city-weather-information-by-zipcode",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@getWeatherByZipcode"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I have a list of zipcode",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I use the weather service to get the weather information",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the information should be found successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherTestByZipCode.i_have_a_list_of_zipcode()"
});
formatter.result({
  "duration": 6928979978,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element using css: com.gargoylesoftware.htmlunit.UnexpectedPage@4159e81b\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027IST-MJYGY0\u0027, ip: \u0027128.197.212.48\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: HtmlUnitDriver\r\n\tat org.openqa.selenium.htmlunit.HtmlUnitDriver.findElementsByCssSelector(HtmlUnitDriver.java:1008)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElements(By.java:436)\r\n\tat org.openqa.selenium.htmlunit.HtmlUnitDriver.findElements(HtmlUnitDriver.java:1657)\r\n\tat org.openqa.selenium.htmlunit.HtmlUnitDriver.findElements(HtmlUnitDriver.java:555)\r\n\tat feature.soapui.WeatherTestByZipCode.i_have_a_list_of_zipcode(WeatherTestByZipCode.java:51)\r\n\tat ✽.Given I have a list of zipcode(feature/soapui/weatherService.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WeatherTestByZipCode.i_use_the_weather_service_to_get_the_weather_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WeatherTestByZipCode.the_information_should_be_found_successfully()"
});
formatter.result({
  "status": "skipped"
});
});