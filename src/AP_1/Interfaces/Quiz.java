package AP_1.Interfaces;
import java.util.*;

public class Quiz
{
    private List<Question> questions;

    public Quiz()
    {
        questions = new ArrayList<Question>();

        questions.add(new TrueFalse("Houston is the capital of Texas.","F"));
        questions.add(new MultipleChoice("The capital of Texas is",
                "Houston",
                "San Antonio",
                "Austin",
                "Dallas",
                "Austin"));
        questions.add(new MultipleChoice("The largest city in Texas is",
                "Houston",
                "San Antonio",
                "Austin",
                "Dallas",
                "Houston"));
        questions.add(new TrueFalse("The tallest mountain in Texas is Guadalupe Peak.", "T"));


    }

    // prints the entire quiz numbering the questions from 1 to question.size(), takes in user input and checks their answers.
    public void takeTest()
    {
        Scanner scan = new Scanner(System.in);
        List<String> answers = new ArrayList<String>();

        for (int i = 0; i < questions.size(); i++)
        {
            System.out.println((i + 1) + "." + questions.get(i).getQuestion() +"\n");
            System.out.print("Answer: ");
            answers.add(scan.nextLine());
            System.out.println("");

        }

        checkAnswers(answers);
    }

    public void checkAnswers(List<String> answers)
    {
        System.out.println("============== \r\n" +
                " Quiz Results \r\n" +
                "============== ");
        for (int i = 0; i < questions.size(); i++)
        {
            System.out.print((i+1) + ". ");
            if(answers.get(i).equalsIgnoreCase(questions.get(i).getAnswerChoice()))
            {
                System.out.println("Correct!");
            }
            else
            {
                System.out.println("Incorrect, the answer was " + questions.get(i).returnAnswer() + ".");
            }

        }

    }

    public static void main(String[] args)
    {
        Quiz quiz = new Quiz();
        quiz.takeTest();
    }
}

