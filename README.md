# - Assignment 3 -

## About the project:
- This project aims to display the weather data of today .
- The system has an addition observer to the subject(weatherdata) and the observer CurrentConditionsDisplay display it ex. (Temperature => 30.0  Humidity => 30.0) and I have another observer StatisticsDisplay to display average the Temperature & Humidity for each subject and I have 3 extra class called TemperatureUnitsDecorator to check temperature if FAHRENHEIT or CELSIUS , WindSpeedDecorator to display windspeed for today and PrecipitationDecorator display precipitation for today ex. "Snow","Rain" etc.
- This code satisfy the some SOLID principles, and design patterns by creating the classes are created and works depend on the princples.

## Information about the added packages and their content:
### There are five packages located inside the package called (Assignment3) :
![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/0ccbb1f5-4f7c-4fe9-8541-726aa5f11d6c)

### - Observer Design Pattern


- I have a WeatherDataSubject that manages temperature and humidity, notifying its observers whenever there's a change, and providing them the option to register or unregister. Observers, like CurrentConditionsDisplay and StatisticsDisplay, receive these updates, showcasing or analyzing pertinent information derived from the weather data. This approach really boosts adaptability and compartmentalization, enabling effortless addition or removal of observers without altering the subject.
  
![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/55cd9b32-e060-41da-b5b7-56057fe0e6c5)

### - Decorator Design Pattern 


The system is monitoring the weather by adding decorators for temperature units, wind speed, and precipitation. Decorators, like TemperatureUnitsDecorator, modify the behavior of the base WeatherData component. The FactoryTemp class handles temperature unit conversions based on a specified type. It's a smart way to enhance and customize your weather data display!

![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/961a2979-0b92-4ca5-bb4c-151f9a45ce5f)


# - The class Digram 
![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/212b87d8-cf59-4356-bbd7-156335908d3a)

# - I have another solution to do make the IWeatherDataSubject extends the Weather Data and give the type subject in Temperature Units Decorator to Weather Data i will show u picture from uml class

![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/636704ef-e937-4d4b-9cdb-1ad3fbd70e05)


