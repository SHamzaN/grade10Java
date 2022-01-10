package AP_1.Interfaces;

public interface Question
{
    String getQuestion();   // returns the question in the appropriate format
    String getAnswerChoice();     // returns the question's answer choice (e.g. "t","f","a","b","c","d")
    String returnAnswer();  //returns the full answer (e.g. "true", "false", "Austin", "Dallas")
}