// this class will be used to blueprint "Person" data in my application
public class Person {
    /*
        these are "fields" of the class: all objects made of the person class are
        going to have their own "name" and "age" attributes that are unique to them. The
        example below sets a default name "default" to the name variable but nothing for
        the age
     */
    String name = "default";
    int age;

    public static void main(String[] args) {
        // we use the new keyword to indicate we are making an object
        Person myPerson = new Person(); // this is a constructor method: it makes an object of the class
        System.out.println(myPerson.name);
        System.out.println(myPerson.age);
        // we can assign values to the fields of the object
        myPerson.name = "Timmy";
        myPerson.age = 205;
        System.out.println(myPerson.name);
        System.out.println(myPerson.age);
    }
}
