package ghar.javawork.strings;



public class DoublePhrase {
    public static void main(String[] args){
        DoublePhrase obj = new DoublePhrase();
        System.out.println(obj.doublePhrase("Java, JavaScript "));
    }
    public String doublePhrase(String phrase)
    {
        String str = phrase;
//        String repeat = str.repeat(2);
//        return repeat;

        int count=2;
        return str.repeat(count);

    }
}
