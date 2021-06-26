package ghar.javawork.virtual.unit5.part1notes;

public class Bank101Runner{
    public static void main(String[]args){
        Bank101 idk = new Bank101();
        Bank101 dominic = new Bank101("Dominating Dominic");
        Bank101 ryan = new Bank101("Ryan the Slayers", 50, 100);

        System.out.println("Name: " + idk.getName());
        System.out.println(idk.getName() + "checking account balance is: $" + idk.getChecking());
        System.out.println(idk.getName() + "savings account balance is: $" + idk.getSavings());
        System.out.println();

        System.out.println("Name: " + dominic.getName());
        System.out.println(dominic.getName() + " checking account balance is: $" + dominic.getChecking());
        System.out.println(dominic.getName() + " savings account balance is: $" + dominic.getSavings());
        System.out.println();

        System.out.println("Name: " + ryan.getName());
        System.out.println(ryan.getName() + " checking account balance is: $" + ryan.getChecking());
        System.out.println(ryan.getName() + " savings account balance is: $" + ryan.getSavings());
        System.out.println();

        idk.setName("Queen Giya");
        idk.depositChecking(2000);
        idk.depositSavings(5000);

        System.out.println("Name: " + idk.getName());
        System.out.println(idk.getName() + " checking account balance is: $" + idk.getChecking());
        System.out.println(idk.getName() + " savings account balance is: $" + idk.getSavings());
        System.out.println();

        dominic.depositChecking(25);
        dominic.depositSavings(300);

        System.out.println("Name: " + dominic.getName());
        System.out.println(dominic.getName() + " checking account balance is: $" + dominic.getChecking());
        System.out.println(dominic.getName() + " savings account balance is: $" + dominic.getSavings());
        System.out.println();

        ryan.withdrawChecking(15);
        System.out.println("Name: " + ryan.getName());
        System.out.println(ryan.getName() + " checking account balance is: $" + ryan.getChecking());
        System.out.println(ryan.getName() + " savings account balance is: $" + ryan.getSavings());
        System.out.println();

        idk.depositSavings(1000);
        System.out.println("Name: " + idk.getName());
        System.out.println(idk.getName() + " checking account balance is: $" + idk.getChecking());
        System.out.println(idk.getName() + " savings account balance is: $" + idk.getSavings());
        System.out.println();

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
        System.out.println("Name: " + dominic.getName());
        System.out.println(dominic.getName() + " checking account balance is: $" + dominic.getChecking());
        System.out.println(dominic.getName() + " savings account balance is: $" + dominic.getSavings());
        System.out.println();

    }

}
