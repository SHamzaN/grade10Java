package AP_1.Interfaces;
public class TrueFalse implements Question
{
    private String prompt;
    private String ans;

    public String getQuestion()
    {
        return "T/F " + prompt;
    }

    @Override
    public String getAnswerChoice()
    {
        return ans;
    }

    @Override
    public String returnAnswer()
    {
        if(ans.equalsIgnoreCase("T"))
        {
            return "true";
        }
        else
            return "false";

    }

    public String getAnswer()
    {

        return "Answer: ";

    }

    public TrueFalse(String pr, String answer)
    {
        prompt = pr;
        ans = answer;
    }

}
