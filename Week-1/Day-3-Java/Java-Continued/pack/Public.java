/*
    Because this class is defined in a sub-directory of the project (these directories are
    called packages) the first line of code needs to be a package declaration for the class. The
    JVM uses this information to know where to find data when executing your code
 */
package pack;

public class Public {
    public String someString;
    public int someInt;

    public Public(String someString, int someInt){
        this.someString = someString;
        this.someInt = someInt;
    }
}
