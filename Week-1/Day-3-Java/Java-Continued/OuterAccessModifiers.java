/*
    Because the Classes below exist in the "pack" package I need to import them into this
    class in order to access them. If this class and the imported classes existed in the
    same package this would not be necessary
 */
//import pack.Default; since the class is in the default scope we can't use it here
import pack.Private;
import pack.Protected;
import pack.Public;

public class OuterAccessModifiers {

    /*
        Access modifiers are how you control where your resources can be accessed.
        - public: can be referenced anywhere in your code
        - protected: can be referenced anywhere in the same package or sub class
        - default: can be referenced anywhere in the same package, used if no access modifier is provided
        - private: can only be referenced in the same class
     */

    public static void main(String[] args) {
        Public publicObject = new Public("This is a public String", 100);
        System.out.println(publicObject.someString);
        System.out.println(publicObject.someInt);

        Protected protectedObject = new Protected("This is a protected String", 200);
//        System.out.println(protectedObject.protectedString);
//        System.out.println(protectedObject.protectedInt);

//        Default defaultScopeObject = new Default("something",0); Class is in default scope, can't use it here

        Private privateObject = new Private("This is a private String");
//        System.out.println(privateObject.privateString);
    }

}
