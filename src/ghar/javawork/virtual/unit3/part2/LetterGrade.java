package ghar.javawork.virtual.unit3.part2;

import java.util.Scanner;

public class LetterGrade {

        public static void main(String[] args)
        {
            // Start here!
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a Numerical Grade--> ");
            int num = s.nextInt();
            if(num >= 97){
                System.out.println("Letter grade = A+");
            } else if(num >= 94){
                System.out.println("Letter grade = A");
            } else if(num >= 90){
                System.out.println("Letter grade = A-");
            } else if(num >= 87){
                System.out.println("Letter grade = B+");
            } else if(num >= 84){
                System.out.println("Letter grade = B");
            } else if(num >= 80){
                System.out.println("Letter grade = B-");
            } else if(num >= 77){
                System.out.println("Letter grade = C+");
            } else if(num >= 74){
                System.out.println("Letter grade = C");
            }else if(num >= 70){
                System.out.println("Letter grade = C-");
            } else if(num <= 70){
                System.out.println("Letter grade = F");
            }
        }

    }

