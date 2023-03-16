/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import java.util.Random;

/**
 *
 * @author Jie Mei
 * @Date 2023-03-15
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    
    public static final int END = 70;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();

        System.out.println("BANG !!!!! \n" +
                           "AND THEY'RE OFF !!!!!");

        int tortoiseDistance = 1;
        int hareDistance = 1;
        int time = 0;

        System.out.println("HT");

        while(true)
        {
            try {
                tortoiseDistance += tortoiseNextAction(random);
                hareDistance += hareNextAction(random);

                if( tortoiseDistance < 1 )  tortoiseDistance = 1;
                if( hareDistance < 1 ) hareDistance = 1;

                if( tortoiseDistance > hareDistance )
                {
                    System.out.println(moveDistance(hareDistance).concat("H").
                            concat(moveDistance(tortoiseDistance-hareDistance)).concat("T"));
                }
                else if( hareDistance > tortoiseDistance )
                {
                    System.out.println(moveDistance(tortoiseDistance).concat("T").
                            concat(moveDistance(hareDistance - tortoiseDistance)).concat("H"));
                }
                else
                {
                    System.out.println(moveDistance(tortoiseDistance).concat("TH"));
                }

                time++;
                Thread.sleep(0);

                if(hareDistance >= END && tortoiseDistance >= END)
                {
                    System.out.println("It's a tie.");
                    System.out.printf("TIME ELAPSED = %d seconds", time);
                    break;
                }
                else if(hareDistance >= END)
                {
                    System.out.println("Hare Wins. Yuch.");
                    System.out.printf("TIME ELAPSED = %d seconds", time);
                    break;
                }
                else if(tortoiseDistance >= END)
                {
                    System.out.println("TORTOISE WINS!!! YAY!!!");
                    System.out.printf("TIME ELAPSED = %d seconds\n", time);
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    // tortoise move rule
    public static int tortoiseNextAction(Random random)
    {
        int rd = random.nextInt(1, 11);

        if( rd >= 1 && rd <= 5 ) // Fast plod
        {
            return 3;
        }
        else if( rd >= 6 && rd <= 7 ) // Slip
        {
            return -6;
        }
        else // Slow plod
        {
            return 1;
        }
    }

    // hare move rule
    public static int hareNextAction(Random random)
    {
        int rd = random.nextInt(1, 11);

        if ( rd >= 1 && rd <= 2 ) // Sleep
        {
            return 0;
        }
        else if ( rd >= 3 && rd <= 4 ) // Big hop
        {
            return 9;
        }
        else if ( rd == 5 ) // Big slip
        {
            return -12;
        }
        else if ( rd >= 6 && rd <= 8 ) // Small hop
        {
            return 1;
        }
        else
        {
            return 2; // Small slip
        }
    }

    public static String moveDistance(int distance)
    {
        String s = "";

        for(int i = 0 ; i < distance ; i++)
        {
            s = s.concat(" ");
        }
        return s;
    }
    
}
