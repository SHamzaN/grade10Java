package AP_1.Interfaces;

public class MultipleChoice implements Question
{
    private String prompt;
    private String ans;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;

    public String getQuestion()
    {
        return prompt + "\n" +
                "  a." + choiceA +
                "\n  b." + choiceB +
                "\n  c." + choiceC +
                "\n  d." + choiceD;
    }

    @Override
    public String getAnswerChoice()
    {

        if(ans.equals(choiceA))
        {
            return "A";
        }
        else if(ans.equals(choiceB))
        {
            return "B";
        }
        else if(ans.equals(choiceC))
        {
            return "C";
        }
        else if(ans.equals(choiceD))
        {
            return "D";
        }


        return "";
    }

    @Override
    public String returnAnswer()
    {
        return ans;
    }

    public String getAnswer()
    {
        return "a" + choiceA +
                "\nb" + choiceB +
                "\nc" + choiceC +
                "\nd" + choiceD;

    }

    public MultipleChoice(String pr, String a, String b, String c, String d, String answer )
    {
        prompt = pr;
        ans = answer;
        choiceA = a;
        choiceB = b;
        choiceC = c;
        choiceD = d;

    }
}
