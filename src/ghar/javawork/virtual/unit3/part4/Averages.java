package ghar.javawork.virtual.unit3.part4;

public class Averages {
    public static void main(String[] args){
        int counter = 0;
        int i = 0;
        int positve = 0;
        int negative = 0;
        int sum = 0;
        int sum1 = 0;





        while(i < 100){
            int randomNum = (int) (Math.random() * 2001) -1000;
            System.out.print(randomNum + " ");
            i++;
            counter++;


            while (counter  == 10){
                System.out.println();
                counter++;

            }
            while(counter == 20){
                System.out.println();
                counter++;
            }
            while( counter == 30){
                System.out.println();
                counter++;
            }
            while( counter == 40){
                System.out.println();
                counter++;
            }
            while(counter == 50){
                System.out.println();
                counter++;
            }
            while(counter == 60){
                System.out.println();
                counter++;
            }
            while(counter == 70){
                System.out.println();
                counter++;
            }
            while(counter == 80){
                System.out.println();
                counter++;
            }
            while (counter == 90){
                System.out.println();
                counter++;
            }
            while ( counter == 100){
                System.out.println();
                counter++;
            }
            if (randomNum > 0){
                positve++;
                sum+=randomNum;
            }
            if(randomNum < 0){
                negative++;
                sum1+= randomNum;
            }
        }

        double avg = sum / positve;
        double avg1 = sum1 / negative;
        System.out.println("\n");
        System.out.println("Summary");
        System.out.println("Positive Number = " + positve);
        System.out.println("Sum of Positives = " + sum);
        System.out.println("Average of Positives = " + avg);
        System.out.println("\n");
        System.out.println("Negative Numbers = " + negative);
        System.out.println("Sum of Negatives = " + sum1);
        System.out.println("Average of Negatives = " + avg1);


    }
}
