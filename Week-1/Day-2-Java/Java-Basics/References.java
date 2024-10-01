public class References {
    /*
        References are variables that point to an object in memory
     */

    public static void main(String[] args) {
        // as long as the reference exists, the object will not be removed from memory
        String name = "Sally";
        if(true){
            // the nameTwo reference only exists in this inner block of code
            String nameTwo = "Billy";
            // notice we can reference the outer variable
            System.out.println(name);
            System.out.println(nameTwo);
        }
        System.out.println(name);
        // if we try to compile the line below the build will fail
        // System.out.println(nameTwo);


    }
}
