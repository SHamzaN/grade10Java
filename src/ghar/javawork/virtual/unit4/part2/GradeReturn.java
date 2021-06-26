package ghar.javawork.virtual.unit4.part2;

public class GradeReturn
{
    public String getGrade(int num){
        if(num >= 90){
            //  System.out.println("A");
            return "A";
        }
        if(num >= 80){
            // System.out.println("B");
            return "B";
        }
        if(num >= 75){
            //   System.out.println("C");
            return "C";
        }
        if(num >= 70){
            //  System.out.println("D");
            return "D";
        }
//   //     if(num < 70){

//         return "F";

//         }
        return "F";
    }
}