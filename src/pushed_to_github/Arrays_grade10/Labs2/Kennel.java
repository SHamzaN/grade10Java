//package AP.Arrays.Labs2;
//
//import java.util.*;
//
//public class Kennel
//{
//    // instance variable
//    private Dog[] dogs;     // declare array variable
//
//    // constructor
//    public Kennel()
//    {
//        dogs = new Dog[5];  // instantiate array with length 5
//    }
//
//    /* This method allows a user input information about 5 dogs and
//     * stores this information in the array dogs.
//     */
//    public void addDogs()
//    {
//        System.out.println("************************\r\n" +
//                "*       addDogs        *\r\n" +
//                "************************");
//        String name,breed;
//        Scanner keyboard = new Scanner(System.in);
//        for(int i = 0; i <5;i++)
//        {
//
//            System.out.print("Enter dog name-->");
//            name = keyboard.nextLine();
//            System.out.print("Enter dog breed-->");
//            breed = keyboard.nextLine();
//            System.out.println();
//
//            dogs[i] = new Dog(name,breed);
//        }
//
//
//    }
//
//    /* This method displays the name and breed for each Dog in the array.
//     */
//    public void printDogs()
//    {
//
//        System.out.println("************************\r\n" +
//                "*      printDogs       *\r\n" +
//                "************************");
//        for(int i = 0; i<5; i++)
//        {
////     dogs[i].getName();
////     dogs[i].getBreed();
//            System.out.print("Dog name = " +dogs[i].getName());
//
//            System.out.println("\nDog breed = " +dogs[i].getBreed());
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args)
//    {
//        Kennel app = new Kennel();
//        app.addDogs();
//        app.printDogs();
//    }
//}
//
