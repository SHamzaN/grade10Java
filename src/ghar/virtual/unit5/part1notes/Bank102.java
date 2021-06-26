package ghar.javawork.virtual.unit5.part1notes;

public class Bank102{

    private double checking;
    private double savings;
    private String name;
    private int atmPIN;
    //instance
    public Bank102(){
        checking = 0;
        savings = 0;
        name = "";
        generatePIN();
    }
    public Bank102(String n){
        checking = 0;
        savings = 0;
        name = n;
        generatePIN();
    }
    public Bank102(String n,double c, double s){
        checking = c;
        savings = s;
        name = n;
        generatePIN();
    }
    // Accessor methods - Getters
    public String getName(){
        return name;
    }
    public double getChecking(){
        return checking;
    }
    public double getSavings(){
        return savings;
    }
    // Mutators methods - Setters
    public void setName(String n){
        name = n;
    }
    public void depositChecking(double amount){
        checking += amount;
    }
    public void depositSavings(double amount){
        savings += amount;
    }
    public void withdrawChecking(double amount){
        checking -= amount;
    }
    public void withdrawSavings(double amount){
        savings -= amount;
    }
    public double getCombined(){
        return checking + savings;
    }
    public void transferToChecking(double amount){
        //savings -= amount;
        //checking +-
        withdrawSavings(amount);
        depositChecking(amount);
    }
    public void transferToSavings(double amount){
        withdrawChecking(amount);
        depositSavings(amount);
    }
    public void closeChecking(){
        checking = 0;
    }
    public void closeSavings(){
        savings = 0;
    }
    public void generatePIN(){
        atmPIN = (int)(Math.random() * 9000) + 1000;
    }

    // toString is a text repersentation of an object.
    /* @Overide
    public String toString(){
        return "Anything can go here...OwO";
    }*/
    public String toString(){
        String output = "";
        output += "Name: " + getName() + "\n" +
                getName() + " checking account balance is: $" + getChecking() + "\n"+
                name + " savings account balance is: $" + savings + "\n" +
                "ATM PIN: " +  atmPIN + "\n";

        return output;
    }

}