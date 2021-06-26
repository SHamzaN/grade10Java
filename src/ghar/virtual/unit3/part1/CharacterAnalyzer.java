package ghar.javawork.virtual.unit3.part1;

import java.util.*;

public class CharacterAnalyzer {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a letter :: \n");
        char let = s.nextLine().charAt(0);
        int value = let;

        if( let >= 'A' ){
           if(let <= 'Z')
            System.out.println(let + " is an uppercase character. ASCII == " + value);
        }

        if(let >='0'){

            if ('9' >= let )
            System.out.println(let + " is a number. ASCII == " + value);
        }

        if(let <= 'z'   ){
            if ( let >= 'a' )
            System.out.println(let + " is a lowercase character. ASCII == " + value);

        }

    }
    }