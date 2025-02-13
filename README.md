SUMMARY
a. Make a java application that creates vehicle objects using an inheritance class hierarchy and is able to start and stop them based on user requests.

b. This lab will involve the following new features: i. Inheritance.

DETAILS
a. Classes

i. MotorVehicle

Declare at least two instance variables in the MotorVehicle class that each child class (Motorcycle and Car) will inherit.
a. One instance variable must be a boolean that is called "running". b. The other instance variable is up to you... "color", "make", etc.

ii. Motorcycle and Car

Have them inherit from MotorVehicle.

Declare one instance variable in each of these classes that is unique to the type. a. For example, you could put a "doorCount" int variable in the Car class and a "windshield" boolean variable into the Motorcycle class.

In the Motorcycle and Car classes, make two methods in each: start and stop methods. a. The start and stop methods will first change the "running" variable. i. In the start method, set the running variable to true. ii. In the stop method, set the running variable to false. b. The start and stop methods will then print to the screen: i. The class's two inherited instance variable values. ii. The specific class's instance variable value (such as "doorCount" for the Car class). iii. What type of vehicle it is (Motorcycle or Car). iv. Whether it's been stopped or started.

iii. VehicleManager

Two instance variables that are arrays, one of Car array type and one of Motorcycle array type.

A "run" method that does the following:

a. Instantiates three objects of Car type and three of Motorcycle type. b. Sets the "running" variable on each to false. c. Fills the other instance variables on each object directly in code with any value you wish. i. So if you had "color" as a variable of String type in MotorVehicle, set one to "red", one to "green", etc. d. Put all the objects into the two arrays mentioned above. i. (car objects in cars array, motorcycle objects in motorcycles array)

e. Then displays a series of things to the user with the following flow:

i. First a menu for choosing which car to START:

Lists the cars with numbers and asks which one to start. a. Use 1 to 3 as menu item numbers instead of 0 to 2.
When item # chosen, then the start method for that object is called. a. The number they enter has to be adjusted for the correct array index obviously.
ii. Second is the menu for which motorcycle to START:

Same as above except now for the motorcycle array.
iii. Third is the menu for which car to STOP:

Same as the ones above except now the stop method is being called instead of start.
iv. Fourth is the menu for which motorcycle to STOP.

Same as above, but now for motorcycle.
v. Fifth, display all 6 vehicles status on whether they're running or not.

iv. Vehicle_Test

Put the main method here. a. In the method, simply instantiate an instance of VehicleManager and call its “run” method.
