package ghar.javawork.virtual.unit5.part1notes;

public class Bank101{

    private double checking;
    private double savings;
    private String name;
    //instance
    public Bank101(){
        checking = 0;
        savings = 0;
        name = "";
    }
    public Bank101(String n){
        checking = 0;
        savings = 0;
        name = n;
    }
    public Bank101(String n,double c, double s){
        checking = c;
        savings = s;
        name = n;
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
}
