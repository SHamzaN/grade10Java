//package ghar.javawork.virtual.unit4.part1notes;

//public class Calc101
//{
//    // Void Methods
//
//    public void addV(double num1, double num2)// Method heading, contains "formal parameters", no semicolons here.
//    {
//        double sum = num1 + num2;
//
//        System.out.println(num1 + " + " + num2 + " = " + sum);
//    }
//
//
//    /*
//     * Data types in formal parameters need to match the data types of the
//     * actual parameters in the method call, but the variable names can
//     * be different
//     */
//    public void subV(double operand1, double operand2)
//    {
//        double difference = operand1 - operand2;
//
//        System.out.println(operand1 + " - " + operand2 + " = " + difference);
//
//    }
//
//    // Create methods "mulV" and "divV"
//    public void mulV(double operand1, double operand2)
//    {
//        double product = operand1 * operand2;
//
//        System.out.println(operand1 + " * " + operand2 + " = " + product);
//    }
//    public void divV(double operand1, double operand2){
//        double dividend = operand1 / operand2;
//
//        System.out.println(operand1 + " / " + operand2 + " = " + dividend );
//    }
//
//    // Return Methods
//
//    /*
//     * The "double" before the method name is the data type
//     * of what is being returned.
//     */
//    public double addR(double num1, double num2)
//    {
//        double sum = num1 + num2;
//
//        return sum; // Return methods must have a return statement to send something back to the method call.
//    }
//
//    public double subR(double operand1, double operand2)
//    {
//        double difference = operand1 - operand2;
//
//        return difference;// "return" marks the end of the method operations
//
//        /*
//         * Anything after the return statement generates an "unreachable statement"
//         * compile error.
//         */
//
//        //System.out.println("Well, hello there!");
//    }
//
//    //Create methods "mulR" and "divR"
//    public double mulR(double operand1,double operand2){
//        double product = operand1 * operand2;
//        return product;
//    }
//    public double divR(double operand1,double operand2){
//        double quotient = operand1 / operand2;
//        return quotient;
//    }
//    public long mul3(int num1, int num2, int num3){
//        long product = num1 * num2 * num3;
//        return product;
//    }
//    public char iLikeL(){
//        return 'L';
//    }
//
//    public String firstLast(String word){
//        String Letters = "";
//        Letters  += word.substring(0,1);
//        Letters += "#";
//        Letters += word.substring(word.length()-1);
//        return Letters;
//    }
//}