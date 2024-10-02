package pack;

public class Protected {
    // since these fields are protected they can only be referenced in the package or an inheriting class
    protected String protectedString;
    protected int protectedInt;

    public Protected(String protectedString, int protectedInt){
        this.protectedString = protectedString;
        this.protectedInt = protectedInt;
    }
}
