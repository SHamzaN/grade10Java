package ghar.javawork.virtual.unit1.part3;

public class Grades{
    public static void main(String [] args){
        double dailyAvg = 88;
        double quizAvg = 74;
        double testAvg = 95;
        double sixWeeksAvg = 0;
        double sixWeeksAvg2 = 0;
        int roundedAvg = 0;

        sixWeeksAvg = dailyAvg * 0.3 + quizAvg * 0.2 + testAvg * 0.5;

        sixWeeksAvg2 = sixWeeksAvg;
        sixWeeksAvg2  += 0.5;

        roundedAvg = (int) sixWeeksAvg2;

        System.out.println("Daily Average = " + dailyAvg + "");
        System.out.println("Quiz Average = " + quizAvg + "");
        System.out.println("Test Average = " + testAvg + "");

        System.out.println("--------------------------");
        System.out.println("Six Weeks Average = " + sixWeeksAvg + "");
        System.out.println("Rounded Average = " + roundedAvg + "");
    }
}