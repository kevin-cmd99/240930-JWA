# Java Slim Study Guide

## Java Orientation

### Big Picture: Full Stack Architecture
**Full stack technology** encompasses the entire scope of a computer system application, with **full stack developers** proficient in both **front end** and **back end** development. The front end involves everything a client interacts with, typically built using **HTML**, **CSS**, and **JavaScript**, or through content management systems like WordPress. Conversely, the back end includes servers, databases, and internal architecture that support the application, which the end-user doesn't directly interact with. **Front end developers** optimize visible parts for web browsers and mobile devices, while **back end developers** refine the software code that communicates with servers and databases. **Full stack developers**, skilled in both areas, are versatile and can handle both front and back end tasks within a development team

### What is Java
Java is a **high-level** programming language that features **automatic memory management**, eliminating the need for developer pointers and handling garbage collection. It is a **compiled** language, meaning the source code is compiled together before execution. Java is **statically typed**, requiring variable types to be declared, and **strongly typed**, preventing data type coercion. As an **object-oriented programming (OOP)** language, it utilizes classes and objects. Java's **Write Once, Run Anywhere** capability allows any application to run on any system with a JRE and JVM. Additionally, Java benefits from a **rich open source community**, providing a vast array of libraries for developers to integrate into their programs.

### JVM, JRE, JDK
Most Java applications only require the **JRE** (Java Runtime Environment). But to write and compile code you need the **JDK** (Java Development Kit). While the JRE provides Java's standard libraries and exceptions as well as a **JVM** (Java Virtual Machine), the **JDK** provides all the above as well as **javac**, the compiler. Java source code is written in text files labeled with **.java** extension. It is then compiled into bytecode in **.class** files by the compiler. Then the bytecode is executed by the **JVM**, which translates the Java commands into low-level instructions to the operating system.

Since Java 6, all Java programs not run inside a container (such as a Servlet Web Container) start and end with the main method. The class containing the main method can have any name, but the method itself should always be named **main**

```java
class Example {
    public static void main(String[] args) {
        System.out.println("Num args:" + args.length);
    }
}
```

- *public* is a Java access modifier keyword that means the `main` method can be accessed from any method during the program's execution
- *static* is a Java keyword that means the method can be invoked without creating an instance of the class that contains it, making it a global method
- *void* is a Java return type keyword that means the method doesn't return any values of any data type
- *args* is a Java variable of type String array which means the method can take command line arguments as an array of Strings

To compile Java code into a **.class** file, use:
> `javac Example.java`

To run the resulting **Example.class** file, use:
> `java Example`

The **java** and **javac** commands require the full directory path or class path to any source code or binary file. For a package **com.demo** in the first line of Example, nest the Java file into a **com/demo/** directory and run:
> `javac com/demo/Example.java`  
> `java com.demo.Example`

You can add packages and imports to expand the application into a set of interacting objects. By default, the **javac** compiler implicitly imports several base packages from the standard library. The **-help** flag displays available options. For example, to compile using UTF-8 encoding while conforming to Java 1.8 features, use:
> `javac -encoding UTF-8 -source 8 -target 8 Example.java`

## Java Basics

### Classes & Objects
In Java, a **class** is a template used to instantiate **objects** and is also referred to as a **type** when used with a **reference variable**. A **class** determines the state and behavior of an **object** and what behaviors can be invoked through a **reference variable**. An **object** is an **instance** of a **class** in memory, and you interact with it through its reference, which is the memory address used by the JVM

|class|object|
|-----|------|
|declared using class keyword| declared using new keyword|
|declared once|declared as many times as needed|
|no memory allocated when created|memory allocated when created|
|blueprint for creating objects|instantiated class|

### Primitive Data Types
Java handles two kinds of data types: **primitives** and **references**. **Primitives** are variables that store simple values. There are eight in Java:
- Integer types: **byte**, **short**, **int**, and **long**
- Floating-point types: **float**, and **double** 
- Logical types: **boolean**
- Character type: **char**

### Reference Variables
A **reference variable** stores the reference to an object in memory. The type of a **reference variable** determines what types of objects it can store a reference to and what behaviors can be invoked. For example, in the line `String someVar = new String("Hello World");`, `String` is the class/type, `someVar` is the **reference variable**, and `new String("Hello World")` is the instantiation of a new object. The **reference variable** `someVar` does not contain the object itself but a reference to it in memory. The `String` type means `someVar` can only store a reference to a `String` object and can only invoke methods or access public variables present in the `String` class

### Arrays
An **array** in Java is a contiguous block of memory storing **elements** of the same type, declared with square brackets after the type. **Arrays** are fixed in size and cannot be resized after declaration. For example:
```java
int[] myInts = new int[]{1, 2, 3, 4};
String languages[] = {"Java", "JavaScript", "SQL"};
```
Each item in an array is called an **element**, and all **elements** must be of the same type. **Elements** are accessed via their **index**, starting at `0`. For instance:
```java
String myElement = languages[0];
```
Arrays have a `length` property useful for iteration:
```java
String[] myArr = {"first", "second", "third"};
for (int i = 0; i < myArr.length; i++) {
  System.out.println(myArr[i]);
}
```
Keep in mind **arrays** are objects, and you can refer to the entire **array** by its name without brackets

### Control Flow: Conditional Statements

#### If Statements
The `if` statement in Java relies on **Boolean expressions**, which return either **true** or **false**. If the expression is **true**, a statement or block of statements is executed. The `else` and `else if` statements provide alternate execution paths if the Boolean expression is **false**. Boolean expressions often involve comparing variables using **relational operators** like `==`, `!=`, `<`, `<=`, `>`, and `>=`. Here's the basic syntax:
```java
if (condition) {
  statement1;
} else if (condition2) {
  statement2;
} else {
  statement3;
}
```

#### Switch Statements
The `switch` statement offers a more concise solution than large chains of `else-if` statements for selecting actions based on a variable's value. It works with `byte`, `short`, `char`, `int` primitives, `enums`, and `Strings` (since Java 7). The basic syntax is:
```java
switch(variable) {
  case 'A': System.out.println("Case A matches!"); break; 
  case 'B': System.out.println("Case B matches!"); break;
  case 'C': System.out.println("Case C matches!"); break;
  default: System.out.println("This will run if other cases don't match"); break;
}
```
The `break` statement ensures that only the code for the matching case executes, though you can allow control flow to "fall through" to the next case

### Control Flow: Loops
**Loops** are essential for programs that repeatedly get input, process it, and then get more input. Like `if` statements, loops use **conditional expressions** to determine when to stop. Java provides several keywords for different looping scenarios: `for`, `while`, and `do-while`

**For-loops** are used for iteration, often with data structures, and include a declaration, condition, and increment/decrement statement
```java
for (int i = 0; i < myData.length; i++) {
  System.out.println(myData[i]);
}
```
**Enhanced for-loops** iterate over objects implementing the `Iterable` interface:
```java
List<String> myList = getListOfStrings();
for (String myStr : myList) {
  System.out.println(myStr);
}
```
**While statements** test a condition and loop as long as it remains `true`:
```java
while (true) {
  // infinite loop!
}
```

**Do-while loops** guarantee the block runs at least once, checking the condition after the block:
```java
do {
  // always runs at least once!
} while(condition);
```

Java’s `break` and `continue` statements control the flow of a program. `Break` exits the current control flow, while `continue` skips to the next iteration of a loop

### Operators
Java offers various operators, including the **assignment operator** (`=`) which assigns a reference variable to a primitive value or object

##### Increment and Decrement Operators
To increment or decrement integral values, use **postfix** operators: `x++` and `x--`, where `x` is a `byte`, `short`, `int`, or `long`. The **prefix** increment or decrement operators are `++x` and `--x`. The prefix operator changes the value before the rest of the expression is evaluated, while the postfix operator changes the value after the entire expression is evaluated
```java
int a = 5;
int b = a++; // assign b=5, then increment a to 6
int c = ++a; // increment a to 7, then assign c=7
System.out.println(a); // 7
System.out.println(b); // 5
System.out.println(c); // 7
```

#### Ternary Operator
The **ternary operator** uses the syntax: `x = condition ? expr1 : expr2`. If the condition is true, `x` is assigned the value of `expr1`; if false, `expr2` is assigned.

```java
boolean skyIsBlue = true;
boolean twoAndTwoIsFour = true;
boolean makesSense = (skyIsBlue && twoAndTwoIsFour) ? true : false;
```

### Comparison Operators
Boolean expressions can be complicated; however, frequently they involve the comparison of the value of one variable to another value, which could be another variable, a literal, or even an arithmetic expression. This comparison uses one of the **relational operators** listed below. All of these operators are **binary operators** which means they work on two operands, one to the left of the **relational operator** and one to the right of the **relational operator**
|Operator|Description|
|--------|-----------|
|==      |Returns **true** if the expression on the left evaluates to the same value as the one on the right|
|!=      |Returns **true** if the expression on the left does not evaluate to the same value as the one on the right|
|<       |Returns **true** if the expression on the left evaluates to a value that is less than the one on the right|
|<=      |Returns **true** if the expression on the left evaluates to a value that is less than or equal to the one on the right|
|>       |Returns **true** if the expression on the left evaluates to a value that is greater than the one on the right|
|>=      |Returns **true** if the expression on the left evaluates to a value that is greater than or equal to than the one on the right|

### Logical Operators
There are a few logical operators you should be aware of: **`&&`** is the logical **AND** operator. It compares two boolean values. If both are true, the expression becomes true. Otherwise, the expression becomes false. The logical **OR** operator **`||`** compares two boolean values: if **either** of the values are true, the expression evaluates to true. Otherwise, the expression is false. Finally, the logical **NOT** operator **`!`** reverses the state of the boolean - so true becomes false and false becomes true:
```java
boolean a = true;
boolean b = false;
if (!(a && b)) {
  System.out.println("a and b are NOT both true");
}
```
We use parenthesis to prioritize the expression **`a && b`**, which returns false. We use the **`!`** operator to reverse the **false** value to **true**. So the if statement's condition is true and the print statement is executed

### Commenting
In Java, **`//`** is used for single line comments, which are useful for quick notes. For multi-line comments, **`/* */`** is used, allowing comments to span multiple lines. Additionally, multi-line comments can be used to create Javadocs:
```java
/**
 * This method performs a specific operation.
 *
 * @param param1 This is the first parameter.
 * @param param2 This is the second parameter.
 * @return This returns a result based on the operation.
 * @throws IllegalArgumentException If the input parameters are invalid.
 * @exception NullPointerException If any of the parameters are null.
 * @see AnotherClass#anotherMethod()
 * @deprecated This method is deprecated and will be removed in future versions.
 * @since 1.0
 * @author Your Name
 * @version 1.2
 * {@link AnotherClass#anotherMethod()}
 * {@code int result = exampleMethod(param1, param2);}
 */
public int exampleMethod(int param1, int param2) {
    // Method implementation here
    return param1 + param2;
}
```
Once your comments are ready, you can use the `javadoc -d doc/path *.java` command to generate html documentation for your code located in your doc path. If you don't want to generate the documentation for all files you can specify the files you want documentation for

### Packages and Imports
A **package** is a collection of classes, interfaces, and enums organized in a hierarchical manner. **Packages** enable you to keep your classes separate from the classes in the Java API, allow you to reuse classes in other applications, and distribute your classes to others:
```java
package com.revature.mypackage;
```
This line declares the **package** in which the class will reside. This must always be the first (non-commented) line in a `.java` file. **Packages** follow a naming convention of lowercase characters separated by periods in the reverse way you would specify a web domain: `com.revature.mypackage` instead of `mypackage.revature.com`. Classes can be referenced anywhere in a program by their "fully qualified class name," which is the package declaration followed by the class, to uniquely identify the class. Typically, we do not want to write out a verbose package and class name together. Instead, we can use an `import` statement after our package declaration to pull in other classes. We can then just use the class name without the package. By default, everything in the \`java.lang\` package is imported. Other packages and classes must be imported by the programmer explicitly:
```java
package com.revature.mypackage;
import java.util.Scanner;
```

### Debugging
- **Compile/Run Your Code More Often**: This is the most important advice, especially for beginners who write large quantities of code before compiling. When you run your code frequently and test it, you get feedback and can check whether you are going in the right direction 
**Use Print Statements Effectively**: One of the simplest and favorite tools for every programmer, especially beginners, to debug code. Most debugging issues can be solved by inserting print statements in your code. Print out variables and check your console for correct values. Also, inspect values when possible
- **Research Your Error Online**: The simplest thing you can do is copy the error message and google it. There is a good chance you will find your answer on StackOverflow (the largest community for developers) or other forums or communities
- **Try Alternate Solutions**: Try different solutions when you don’t understand the cause and don’t know how to fix the problem. If it’s still not working, try another one. Possibilities are that you get the solution but encounter a new error. Don’t panic in this case and accept that every developer goes through this phase
- **Use Comments Effectively**: In any language, comments are not just to leave a note in the code or to explain the code. You can also use them to debug by temporarily commenting out a piece of code that you don’t need to run at that time and isolate other parts of the code to execute
- **Use Binary Search**: Finding a complex error in a buggy file is really difficult, especially when it has thousands of lines of code. In those cases, you need to check more and more places. To avoid this, the best thing you can do is apply binary search. Divide the code into two parts. Comment out one part and run the other part. Whatever part is responsible for the error, repeat the division process with that part and keep repeating it until you find the line(s) that produce the error
- **Use Debugging Tools**: Many development environments come with debugging tools like Visual Studio Code and Eclipse. These tools can pause execution and inspect data values line by line
- **Automated Tests**: Automated tests and other unit tests are performed to check if the actual output matches the expected output. This is done by writing test scripts where we execute the software with specific input
- **Ask for Help**: If you have tried everything to find the bug and resolve it but nothing is working, you need to ask someone for help. Asking for help often yields a solution you might not have considered before
