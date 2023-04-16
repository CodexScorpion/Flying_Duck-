# Flying_Duck
The Duck Behaviour is a Java program that uses inheritance and polymorphism to create a simulation of various types of ducks with different behaviours. It uses abstract classes and interfaces to define common behaviour.


## Duck Behaviour Code
This code implements the Duck Behaviour problem using Java programming language. The problem statement is to create a simulation of different types of ducks and their flying ,quacking & swimming behaviours.

## How to Run
To run the program, you can use any Java IDE like Eclipse, NetBeans, or IntelliJ IDEA. Simply open the project in your preferred IDE and run the Main.java file.


Alternatively, you can compile and run the program from the command line using the following commands:


javac Main.java

java Main

## Implementation Details
The code follows the object-oriented programming principles, particularly the concepts of inheritance and polymorphism.

The Duck class serves as the parent class for all types of ducks. It defines two abstract methods, fly(),quack(),swims(), which must be implemented by its child classes.

The MallardDuck, RedheadDuck,RubberDuck and DecoyDuck classes extend the Duck class and implement the fly(), quack() and swims(), methods based on their respective behaviours.

The Main class creates instances of different types of ducks and calls their fly() and quack() methods to simulate their behaviours.


## Acknowledgements
This code is inspired by the examples and exercises provided in the Head First Java book by Kathy Sierra and Bert Bates.



