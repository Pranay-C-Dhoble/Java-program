package OopsConcept;

//Encapsulation is a process of wrapping code and data together into a single unit.
//It is a way to achieve data hiding in Java
//because other class will not be able to access the data through the private data members.
//types of modifiers: public, private, protected, default

//Inheritance is a mechanism in which one class acquires the property of another class.
//For example, a child inherits the traits of his/her parents.
//types of inheritance: single, multilevel, hierarchical, multiple, hybrid
//java not support multiple inheritance. but we can achieve it by using interface.

//Polymorphism is the ability of an object to take on many forms.
//in other words, one object has many forms or has one name with multiple functionalities.
//The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
//Any Java object that can pass more than one IS-A test is considered to be polymorphic.

//Static Binding and Dynamic Binding
//Compile time polymorphism: *** method overloading
//Runtime polymorphism: *** method overriding

//method overriding rules:
//1. method name must be same.
//2. method arguments must be same.
//3. method return type must be same.
//4. method access modifier must be same or higher.
//5. method must not be static.
//6. method must not be final.
//7. method must not be private.
//8. method must not be constructor.




//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message.
//You don't know the internal processing about the message delivery.
public class OopsInformation {
    static int count = 0;
    public static void main(String[] args) {
        count = 10;
    }
}
