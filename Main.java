import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter the check amount");
        double check = keyboard.nextDouble();
        if(check < 10)
        {
            System.out.println("you will be charged $1");
            check = check -1;
            System.out.println("your new balance is going to be: " + check);
            System.out.println(10/100*check);
        }
        else if((check > 10) &&(check < 100))
        {
            System.out.println("you will be charge 10% of total amount");

            System.out.println("your new amount is going to be: " + ((check) - ((10/100.0)*check)));
            System.out.println((10/100.0)*check);
        }
        else if((check >100) && (check <1000))
        {
            System.out.println("we will charge 5% and $5 of total amount");
            System.out.println("your new balance is going to be: " + ((check - 5) - (5/100.0)*(check)));
            System.out.println(" 5percent"+ (check- (5/100.0)*(check)));
        }
        else
        {
            System.out.println("we will charge $40 and 1% of tottal amount");
            System.out.println("your new balance is going to be: " + ((check - 40) - (1/100.0)*(check)));
        }
    }
}
