public class StoringData {
    /*
        Anytime you need to store a collection of data Arrays are a built in Class that
        can be used for this purpose
     */

    public static void main(String[] args) {
        // To make an Array object you add [] to the Class type
        String[] names = new String[]{"Billy", "Sally", "Timmy", "Gus"};
        // alternate way to make an array
        String namesAlternate[] = {"Billy", "Sally", "Timmy", "Gus"};
        // another alternative
        String[] namesAlternativeTwo = {"Billy", "Sally", "Timmy", "Gus"};

        // to access data in your arrays you use the index position of the data: this starts at 0
        System.out.println(names[0]); // this will print "Billy", since Billy is the element located at index position 0
        // this will change the value referenced at index 0 to "Shawn"
        names[0] = "Shawn";
        // Shawn is now printed instead of "Billy"
        System.out.println(names[0]);

        // Arrays can only store data of the same type: names can't store numbers
        // names[1] = 15;

        // Arrays are immutable in their size: once made they don't change their size
        // names[4] = "Psych"; this will cause an ArrayIndexOutOfBoundsException

        // this will make an empty String array with 5 positions
        String[] emptyList = new String[5];

        System.out.println(emptyList[4]);

        emptyList[4] = "Jules";

        System.out.println(emptyList[4]);

        // if you want to know how many elements an array can contain you reference its "length" property
        System.out.println(emptyList.length);
    }
}
