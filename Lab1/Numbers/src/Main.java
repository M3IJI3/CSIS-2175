import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define three variables to store the number of different numbers input
        int pos_num = 0;
        int neg_num = 0;
        int zero_num = 0;

        Scanner sc = new Scanner(System.in);

        // use for loop to input five times
        for(int i = 1 ; i <= 5; i++ )
        {
            System.out.print("Please input a number("+ i +"/5): ");
            double temp = sc.nextDouble();

            // judge the numbers' type after every input
            if(temp > 0)
            {
                pos_num++;
            }
            else if(temp < 0)
            {
                neg_num++;
            }
            else
            {
                zero_num++;
            }
        }

        System.out.println("You have "+ pos_num +" positive number(s), " + neg_num +
                " negative number(s) and "+zero_num+" zero(s).");
    }
}