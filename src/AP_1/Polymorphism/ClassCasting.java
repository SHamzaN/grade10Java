package AP_1.Polymorphism;


public class ClassCasting
{

    public static void main(String[] args)
    {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();
        System.out.println();

//Key Concept: Your reference data type determines what you can do, your object type determines how you do it you.

//Upcasting (safe)
        // Machine machine2 = new Camera();//Polymorphism
        Machine machine2 = camera1;//upcasting because camera1 (Camera) reference is being copied into a reference that is higher up in hierarchy machine2 (Machine)

        machine2.start();
        //machine2.snap();

        System.out.println();

        //Downcasting (unsafe)
        Machine machine3 = new Camera();
        //Camera camera2 = machine3();//downcasting because the data type of machine3 is going down the hierarchy when it gets assigned to camera2 (Camera)

        //Java needs confirmation that you know what you are doing

        Camera camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();

        //machine3.start();

        System.out.println();

        //Here's why downcsting is unsafe
        Machine machine4 = new Machine();

//    Camera camera3 = (Camera)   machine4;
        //  Camera = (Camera) machine4;  //runtime error -- a Machine object is not of type camera. Machine is not aware of the Camera class.
    }

}

class Machine
{
    public void start()
    {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine
{
    @Override
    public void start()
    {
        System.out.println("Camera started.");
    }


    public void snap()
    {
        System.out.println("Photo taken.");
    }
}
