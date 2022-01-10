package AP.Cs1Review;


public class IndexOf101
{
    public static void main(String[] args) {
        String word = "bobcat";
//index        012345

        String find0 = "b";
        char find1 = 'c';
        String find2 = "x";
        String find3 = "cat";
        String find4 = "car";
        String find5 = "Bob";
        String find6 = "Waldo";

        System.out.println("Word: " + word + "\n");

        System.out.println("The first instance of " + find0 + " is at index: " + word.indexOf(find0));
        System.out.println("The first instance of " + find1 + " is at index: " + word.indexOf(find1));
        System.out.println("The first instance of " + find2 + " is at index: " + word.indexOf(find2));
        System.out.println("The first instance of " + find3 + " is at index: " + word.indexOf(find3));
        System.out.println("The first instance of " + find4 + " is at index: " + word.indexOf(find4));
        System.out.println("The first instance of " + find5 + " is at index: " + word.indexOf(find5));
        System.out.println("The first instance of " + find6 + " is at index: " + word.indexOf(find6));

    }

}
