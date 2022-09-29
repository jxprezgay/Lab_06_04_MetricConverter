import java.util.Scanner;
public class metric
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meters = 0;
        double miles = 0;
        double feet;
        double inches;
        String trash;

        System.out.print("What is your measurement in meters: ");
        if(in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();

        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input.");
            System.exit(0);
        }

        miles = 0.0006213712 * meters;
        feet = 3.281 * meters;
        inches = 39.37 * meters;
        System.out.println("Your measurement in miles is: " + miles);
        System.out.println("Your measurement in feet is: " + feet);
        System.out.println("Your measurement in inches is: " + inches);



    }
}