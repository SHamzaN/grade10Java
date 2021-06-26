package ghar.javawork.virtual.unit6.part2;

public class Scheduler {
    public Scheduler() {
        Date app1 = new Appointment(12,22,2020, "Christmas Party - 7:00pm");
        System.out.println(app1);
        System.out.println();

        Date app2 = new Appointment(1,27,2021, "Dentist - 9:00am");
        System.out.println(app2);
        System.out.println();

        Date app3 = new Appointment(3,27,2021, "Job Interview - 8:30am");
        System.out.println(app3);
    }

    public static void main(String args[]) {
        Scheduler app = new Scheduler();
    }
}
