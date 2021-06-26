package ghar.javawork.virtual.unit5.part1notes;

public class Bank102Runner{
    public static void main(String[]args){
        Bank102 idk = new Bank102();
        Bank102 dominic = new Bank102("Dominating Dominic");
        Bank102 ryan = new Bank102("Ryan the Slayers", 50, 100);

        System.out.println(idk);

        System.out.println(dominic);

        System.out.println(ryan);


        idk.setName("Queen Giya");
        idk.depositChecking(2000);
        idk.depositSavings(5000);

        System.out.println(idk);


        dominic.depositChecking(25);
        dominic.depositSavings(300);

        System.out.println(dominic);


        ryan.withdrawChecking(15);
        System.out.println(ryan);


        idk.depositSavings(1000);
        System.out.println(idk);


        System.out.println(idk.getName() + " total account balance is: $" + idk.getCombined());
        System.out.println();

        idk.transferToChecking(2500);
        System.out.println("Name: " + idk.getName());
        System.out.println(idk.getName() + " checking account balance is: $" + idk.getChecking());
        System.out.println(idk.getName() + " savings account balance is: $" + idk.getSavings());
        System.out.println(idk.getName() + " total account balance is: $" + idk.getCombined());
        System.out.println();

        dominic.closeChecking();
        dominic.closeSavings();

        System.out.println(dominic);

    }

}