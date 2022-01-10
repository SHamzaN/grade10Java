package AP_1.Polymorphism;


public class PolymorphicFood
{
    public static void main(String[] args)
    {
        Cake yum1 = new Cake();

        /*
         * yum1 is the reference variable to the object created by "new Cake()"
         * The "Cake" in front yum1 is the data type of the reference variable
         * The object is of the type cake
         */

        Food yum2 = new Cake();// The object "new Cake()" is also of the type Food

        /*
         * The object is of the Cake type, Food type, and Object type. (Polymorphism)
         * The variable yum2 can have a data type of t any of the cake object's super class types
         */

        Object yum3 = new Cake(); // An Object can't "eat()", eat() is not in the Object class

        //Potpie yum4 = new Cake();

//   yum1.eat();
//   yum2.eat();
//   yum3.eat();


        //Polymorphic array
        Food yum5[] = new Food[3];
        yum5[0] = new Potpie();
        yum5[1] = new Cake();
        yum5[2] = new Food();

        for(int x = 0; x<3; x++)
        {
            yum5[x].eat();
        }

    }
}

class Food
{
    void eat()
    {
        System.out.println("This food is delicious.");
    }
}

class Cake extends Food
{
    @Override
    void eat()
    {
        System.out.println("This cake is delicous!");
    }
}

class Potpie extends Food
{
    @Override
    void eat()
    {
        System.out.println("This potpie is delicous!");
    }
}

