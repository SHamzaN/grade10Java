package ghar.javawork.virtual.unit5.part1;

public class Assignment{

    // instance variables
   private String name;
   private String type;
   private int score;

    // constructors
     public Assignment(){
         name = "";
         type = "";
         score = 0;
     }
     public Assignment(String names, String types, int scores){
         name = names;
         type = types;
         score = scores;
     }

    // accessor methods

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getScore() {
        return score;
    }
    // mutator methods

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setScore(int score) {
        this.score = score;
    }
    // other methods
     public String getLetterGrade(){
         String result = "F";
         if (score >= 60) { result = "D"; }
         if (score >= 70) { result = "C"; }
         if (score >= 80) { result = "B"; }
         if (score >= 90) { result = "A"; }
         return result;
     }

}