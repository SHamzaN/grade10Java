//package AP.Cs1Review;
//
//public class Student
//{
//    private String name;
//    private double GPA;
//    private int gradeLevel;
//
//
//    public Student(String n, double g, int gl) {
//        name  = n;
//        GPA = g;
//        gradeLevel = gl;
//    }
//
//    public String getName()
//    {
//        return name;
//    }
//
//    public double getGPA()
//    {
//        return GPA;
//    }
//
//    public int getGradeLevel()
//    {
//        return gradeLevel;
//    }
//
//    public void setName(String n)
//    {
//        name = n;
//    }
//    public void setGPA(double g)
//    {
//        GPA = g;
//    }
//    public void setGradeLevel(int gl)
//    {
//        gradeLevel = gl;
//    }
//
//    @Override
//    public String toString()
//    {
//        return "Name: " + name +
//                "\nGPA: " + GPA +
//                "\nGrade: " + getGradeLevel();
//    }
//
//    @Override
//    public boolean equals(Object obj)
//    {
//        Student temp = (Student) obj;
//
//        return this.getName().equals(temp.getName()) && getGradeLevel() == temp.getGradeLevel() && GPA == temp.GPA;
//    }
//}
