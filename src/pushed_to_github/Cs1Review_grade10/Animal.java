//package AP.Cs1Review;
//
///*This is a documentation comment.
//        * This program is a review of CS1
//        * topics and concepts.
//        * @author ns12015702
//        *
//        */
//
//// A class defines the attributes (fields) and capabilities (methods) of a real world object
//
//        import java.util.Scanner;
//public class Animal
//{
//
//    // final means that this value can't be changed
////public final double FAVNUMBER = 1.6180; bad
//    private final double FAVNUMBER = 1.6180; // good (instance variables or global variables)
//
//// Variables (Fields) start with a letter, underscore or $
//// Private fields can only be accessed by other methods in the class
//
//    // Strings are objects that hold a series of characters
//    private String name;// defaults to "null"
//
//    // An integer can hold values from -2 ^ 31 to (2 ^ 31) -1
//    private int weight = 19;
//
//    // Booleans have a value of true or false
//    private boolean hasOwner = false;
//
//    // Bytes can hold the values between -128 to 127
//    private byte age = 1;
//
//    // Longs can hold the values between -2 ^ 63 to (2 ^ 63) - 1
//    private long uniqueID;// defaults to 0
//
//    // Chars are unsigned ints that represent UTF-16 codes from 0 to 65,535
//    private char favoriteChar;// defaults to NUL(null)
//
//    // Doubles are 64 bit IEEE 754 floating points with decimal values
//    private double speed;// defaults to 0.0
//
//    // Floats are 32 bit IEEE 754 floating points with decimal values
//    private float height = 3.5f;//
//
//    private Scanner userInput = new Scanner(System.in);
//
//    // constructor initializes instance variables
//    public Animal()
//    {
//        System.out.println("Constructor called");
//
//        System.out.println("speed before : " + speed);
//        speed = 35;
//        System.out.println("speed after : " + speed);
//        adjustAge();
//
///*  Escape sequences
//\t Inserts a tab in the text at this point.
//\b Inserts a backspace in the text at this point.
//\n Inserts a newline in the text at this point.
//\r Inserts a carriage return in the text at this point.
//\' Inserts a single quote character in the text at this point.
//\" Inserts a double quote character in the text at this point.
//\\ Inserts a backslash character in the text at this point.
//*/
//
//
//
//        System.out.print("\nEnter the name \\ or other \"identifier\": ");
//        name = userInput.nextLine();
//
////System.out.println("Pet name: " + name);
//
//        setUniqueID(1999);//Do not need to use object identifier when the method being called out is not in main and is in the same class
//        System.out.println("Unique ID set to: " + getUniqueID());
//        setUniqueID();
//        System.out.println("Unique ID set to: " + getUniqueID());
//    }
//
//// It is best practice to use accessor (getter) methods and mutator (setter) methods so that you can protect your data
//
//    public String getName()
//    { // Accessor Method (getter)
//
//        return name;
//    }
//
//    public void setName(String n)
//    { // Mutator Method (setter)
//        name = n;
//
//    }
//
//    public int getWeight()
//    {
//        return weight;
//    }
//    //this refers to the current object (The instance variable of the objecgt)
//    public void setWeight(int weight)
//    {
//        this.weight = weight;
//    }
//    public boolean getHasOwner()
//    {
//        return hasOwner;
//    }
//    public void setHasOwner(boolean hasOwmer)
//    {
//        this.hasOwner = hasOwner;
//    }
//    public byte getAge()
//    {
//        return age;
//    }
//    public void setAge(byte age)
//    {
//        this.age = age;
//    }
//    public long getUniqueID()
//    {
//        return uniqueID;
//    }
//    public void setUniqueID(long id)
//    {
//        this.uniqueID = id;
//    }
//    public void setUniqueID()
//    {
//        uniqueID = (long)42.9;
//    }
//    public void adjustAge()
//    {
//        //Shorthand for age = age + 1;
//        //Unary operators: ++ increment / -- decrement
//
//        System.out.println("Age: " + age++); //Post-fix
//        System.out.println("Age: " + age);
//        System.out.println("Age: " + ++age); // Pre-fix
//        System.out.println("Age: " + age);
//
//        //Shorthand for age = age * 2;
//        age *= 2; // *= /= , +=, -=, %=
//        System.out.println("Age: " + age);
//
//    }
//    public void doMath()
//    {
//        System.out.println("\nDoing Math: ");
//        // local variable
//        int sumOfNumbers = 5 + 2;
//        System.out.println("5 + 2 = " + sumOfNumbers);
//
//
//        int diffOfNumbers = 5 - 2;
//        System.out.println("5 - 2 = " + diffOfNumbers);
//
//
//        int productOfNumbers = 5 * 2;
//        System.out.println("5 * 2 = " + productOfNumbers);
//
//        //int/int == truncated int -> 5/2 == 2
//        int quotOfNumbers = 5 / 2;
//        System.out.println("5 / 2 = " + quotOfNumbers);
//
//        //Truncated then converted to a double 5/2 -> 2 -> 2.0
//        double quotOfNumbersD = 5 / 2;
//        System.out.println("5 / 2 = " + quotOfNumbersD);
//
//
//        int modOfNumbers = 5 % 2; //Modular division(remainder division)
//        System.out.println("5 % 2 = " + modOfNumbers);
//
//
//    }
//    public void setFavoriteChar()
//    {
//        //Math.random() == [0,1)
//        //range == largest # - smallest # + 1
//        //int randomNumber= (int) (Math.random() * range) = smallestNumber
//        int randomNumber = (int) (Math.random() * 96) + 32; //[32...127]
//        favoriteChar = (char) randomNumber;
//
//        //  randomNumber = 32;
//        favoriteChar = 127;
//
//        System.out.println("Favorite character set to: " + favoriteChar);
//
//        // if then then else statement
//        //]\
//
//        /// < >, == >=
//
//        // Logical operators
//        // ! : Converts the boolean value to its right to its opposite form ie. true to false
//        // & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
//        // && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
//        // | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
//        // || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
//        // ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
//
//        if(randomNumber == 32)
//            System.out.println("Favorite character set to <space>");
//        else if(favoriteChar == 127)
//            System.out.println("Favorite character set to <DEL>");
//
//    }
//
//    @Override // shows that your overriding an existing method. Can only override methods that already exist.
//    public String toString( ) // text representation of an object
//    {
//
//        //   return "I am an Animal!";
//        String output = "";
//
//        output += "\nName: " +  name +
//                "\nWeight: " + getWeight() +
//                "\nHeight:  " + height +
//                "\nHas Owner: " + getHasOwner() +
//                "\nUnique ID: " + getUniqueID() + "\n";
//
//        return output;
//    }
//
//
//
//
//
//
//
//
//
//// public allows other classes to use this method
//// static means that only a class can call for this to execute
//// void means it doesn't return a value when it finishes executing
//// This method can except Strings that can be stored in the String array args when it is executed
//
//    public static void main(String[] args)
//    {
//        Animal pet = new Animal(); // object
//
//        //REturn Method calls are Included within another command
//        System.out.println("Pet name: " + pet.getName());// Must use object identifier when calling a method from main or another class
//        System.out.println("Changing name to: \"Leeroy\".");
//        pet.setName("Leeroy");//Void method calls stand alone. Cannot be apart of another command.
//        System.out.println("Pet name changed to: " + pet.getName());
//
//        pet.doMath();
//
//        System.out.println(pet);
//
//        pet.setFavoriteChar();
//
//
//
//    }
//
//}
