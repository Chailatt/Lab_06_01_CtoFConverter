import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      double tempC = 0;
      double tempF = 0;
      String trash = ""; // for bad input which will read as a string

     Scanner scan = new Scanner(System.in);
    System.out.println("Type temperature in C to get conversion");

        if (scan.hasNextDouble())
        {
            tempF = scan.nextDouble();
           // scan.nextLine();
            tempC = (tempF * 9 / 5) + 32;
            System.out.println("Your degrees in fahrenheit is: " + tempC);

        }
        else
        {
            trash = scan.nextLine();
            System.out.println("You said the temperature was " + trash );
            System.out.println("Run the program again and enter a valid temperature! " + trash );
        }
    }
}