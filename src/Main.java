import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.print("Enter your Birth Month [1-12]: ");
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
            if(birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("You said your Birth Month is " + birthMonth);
            }
            else
            {
                System.out.println("You said your Birth Month is " + birthMonth + " which is invalid");
                System.out.println("Run the program again with correct input");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash + " which is not a valid number");
            System.out.println("Run the program again with correct input");
        }
    }
}