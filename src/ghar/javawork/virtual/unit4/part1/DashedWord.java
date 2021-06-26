package ghar.javawork.virtual.unit4.part1;

public class DashedWord {

    String returnString;

    public void dashedV(String word){

        int status = 0;
        System.out.print("Dashed word: " );
        for(int i=0; i < word.length()-1; i++) {
            System.out.print(word.charAt(i) + "-");
            status = i;
        }
        System.out.println(word.charAt(status + 1));
    }


    StringBuilder modifiedWord = new StringBuilder();

    int status = 0;
    public String dashedR(String word){

        for(int i=0;i<word.length();i++){

            modifiedWord.append(word.charAt(i)).append("-");
        }

        returnString = modifiedWord.substring(0, modifiedWord.length() -1);
        return returnString;
    }

}
