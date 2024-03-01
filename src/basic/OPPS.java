package src.basic;


import src.bank.Bank;

class  Shape{  //base class/parent class
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape{ //derived class/child class
    public void area(int h,int b) {
        System.out.println((h*b)/2);
    }
    // this class overrides the area function of its parent class.
    // hence this is called function overriding [run time polymorphism].
}
// Triangle class inherit all(conditional) state and behaviour of its base class
// it is single level inheritance

class EquilateralTriangle extends Triangle {
    int side;
    // this class is derived from another derived class
    // hence multilevel inheritance
}
class Circle extends Shape{
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
    // Circle and Triangle both are derived class from same base class (shape)
    // hence this is called hierarchical inheritance
}

public class  OPPS {
    public static void main(String[] args) {
//        Student s1  = new Student();
//        s1.getInfo();
//        s1.setName("Himanshu Kushwah");
//        s1.setAge(16);
//        s1.getInfo();

        Bank bank = new Bank();
        // able to access Bank class outside its package because it is public;
        //Account account = new Account();
        // unable to access Account class outside its package because it is default;

        Triangle tri = new Triangle();
        Shape sp = new Shape();
        sp.area();
        tri.area(4,6);
    }
}
/*
Constructor : Constructor is a special method which is invoked automatically at the time of
object creation.It is used to initialize the data members of new objects generally.
 -> Constructors have the same name as class or structure.
 -> Constructors don’t have a return type. (Not even void)
 -> Constructors are only called once, at object creation.

 There can be three types of constructors in Java. [look into student class for example]

 -> Non-Parameterized constructor : A constructor which has no argument is known as non-parameterized
    constructor(or no-argument constructor). It is invoked at the time of creating an  object.
    If we don’t create one then it is created by default by Java.

 -> Parameterized constructor : Constructor which has parameters is called a parameterized
   constructor. It is used to provide different values to distinct objects.

 -> Copy Constructor : A Copy constructor is an overloaded constructor used to declare
    and initialize an object from another object. There is only a user defined copy constructor
    in Java(C++ has a default one too).

Packages: Package is a group of similar types of classes, interfaces and sub-packages. Packages
can be built-in or user defined.Built-in packages - java, util, io etc.
import java.util.Scanner;
import java.io.IOException;

   ------ Access Modifiers in Java ----- [look into Bank class in bank package and OPPS class]

Private: The access level of a private modifier is only within the class.
         It cannot be accessed from outside the class.

Default: The access level of a default modifier is only within the package.
         It cannot be accessed from outside the package. If you do not specify
         any access level, it will be the default.

Protected: The access level of a protected modifier is within the package and outside
           the package through child class. If you do not make the child class, it cannot
           be accessed from outside the package.

Public: The access level of a public modifier is everywhere. It can be accessed from within
        the class, outside the class, within the package and outside the package.



 ----- four major oops concept -----

1.polymorphism - (two type)
  -> compile time [Static] ( function Overloading) - (two type) [look Student class for example]
      -> by changing the parameter type
      -> by changing the number of parameter
  -> run time [Dynamic] (function overriding) [look triangle class]
      -> Function overriding means when the child class contains the method which is already present
         in the parent class. Hence, the child class overrides the method of the parent class.
         In case of function overriding, parent and child classes both contain the same function
         with a different definition. The call to the function is determined at runtime is known
         as runtime polymorphism.

2. Inheritance
   -> inherit all state and behaviours of its base class
   -> 4 type
        -> single level inheritance: When one class inherits another class, it is known as single
            level inheritance.
        -> multi level inheritance: Multilevel inheritance is a process of deriving a class from
           another derived class.
        -> hierarchical inheritance: Hierarchical inheritance is defined as the process of deriving
           more than one class from a base class.
        -> hybrid inheritance: Hybrid inheritance is a combination of simple, multiple inheritance
           and hierarchical inheritance.

3. Encapsulation
   -> Encapsulation is the process of combining data and functions into a single unit called class.
      In Encapsulation, the data is not accessed directly; it is accessed through the functions present
      inside the class. In simpler words, attributes of the class are kept private and public getter and
      setter methods are provided to manipulate these attributes. Thus, encapsulation makes the concept
      of data hiding possible.(Data hiding: a language feature to restrict access to members of an object,
      reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java).

4. Abstraction
   -> Abstraction is a process of hiding the implementation details and showing only functionality to the user.
      Another way, it shows only essential things to the user and hides the internal details, for example,
      sending SMS where you type the text and send the message. You don't know the internal processing
      about the message delivery.
   -> two ways to implement abstraction
      -> by using abstraction class (0 to 100%)
         -> An abstract class must be declared with an abstract keyword.
         -> It can have abstract and non-abstract methods.
         -> It cannot be instantiated.
         -> It can have constructors and static methods also.
         -> It can have final methods which will force the subclass not to change the body of the method.
       -> by using Interface (100%)
          -> All the fields in interfaces are public, static and final by default.
          -> All methods are public & abstract by default.
          -> A class that implements an interface must implement all the methods declared in the interface.
          -> Interfaces support the functionality of multiple inheritance.
* */