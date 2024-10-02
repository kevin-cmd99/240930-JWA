/*
    Because the classes used in the main method exist in the same package there is no need
    to import their data
 */
package pack;

public class InnerAccessModifiers {
    public static void main(String[] args) {
        Public publicObject = new Public("This is a public String", 100);
        System.out.println(publicObject.someString);
        System.out.println(publicObject.someInt);

        // because this class/main method are in the same package the protected resources can be accessed
        Protected protectedObject = new Protected("This is a protected String", 200);
        System.out.println(protectedObject.protectedString);
        System.out.println(protectedObject.protectedInt);

        Default defaultScopeObject = new Default("This is a default scope String", 300);
        System.out.println(defaultScopeObject.defaultScopeString);
        System.out.println(defaultScopeObject.defaultScopeInt);

        Private privateObject = new Private("This is a private String");
//        System.out.println(privateObject.privateString);
    }
}
