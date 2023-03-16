import java.util.Scanner;

public class Main {
    public static final int DAYS = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input 10 days weather: ");

        double[] temperature = new double[DAYS];
        for(int i = 0; i < temperature.length ; i++)
        {
            temperature[i] = sc.nextDouble();
        }
        double avg = calcAvg(temperature);
        System.out.println("The average weather is: " + avg);
        
    }

    public static double calcAvg(double[] temp)
    {
        double sum = 0;
        for(int i = 0; i < temp.length; i++)
        {
            sum += temp[i];
        }
        return sum / temp.length;
    }

    public static boolean isAboveAvg(double avg, double temp)
    {
        return avg > temp;
    }
}