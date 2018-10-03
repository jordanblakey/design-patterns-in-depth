# Design Patterns in Depth

## Polymorphism

- Classes that don't change, but extend

```sh
javac -d ../build ../**/*.java # Compile to build folder
java WorksWithAnimals # Class file to run
```

## Abstract Classes

If you want the power of polymorphism without the work

- abstract public class Creature
- public abstract void setName();
- There are no abstract fields
- All methods don't have to be abstract
- You can have static methods
- You cannot create instances from an abstract class. A subclass must inherit

## Interfaces

- A class with only abstract methods
- You can add as many interfaces to a class using implements as you want
- You can only use public and final fields
- interfaces provide the ultimate in flexibility
- Classes from different inheritance trees can use a common interface