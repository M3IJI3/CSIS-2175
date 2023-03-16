/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author major
 */
public class Lab6 {
    
    public static final int SEATS = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[] firstClass = new boolean[SEATS];
        boolean[] economy = new boolean[SEATS];
        ChooseSeat(firstClass, economy);  
    }
    
    public static void ChooseSeat(boolean[] firstClass, boolean[] economy)
    {
        if(isFull(firstClass) && isFull(economy))
        {
            System.out.println("The plane is now full.");
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please type 1 for FirstClass\n"
                    + "Please type 2 for Economy" );
            System.out.print("choice: ");
            
            int choice = sc.nextInt();
            
            if(choice == 1)
            {
                if(!isFull(firstClass))
                {
                    int seatNO = assignSeat(firstClass);
                    System.out.printf("First Class, Seat #%d%n%n", seatNO);
                }
                else
                {
                    System.out.println("First Class is full.\n");
                    
                }
                ChooseSeat(firstClass, economy);
            }
            
            if(choice == 2)
            {
                if(!isFull(economy))
                {
                    int seatNO = assignSeat(economy);
                    System.out.printf("Economy Class, Seat #%d%n%n", seatNO);
                }
                else
                {
                    System.out.println("Economy Class is full, First Class?");
                    System.out.print("1. Yes, 2. No, Your choice: ");
                    choice = sc.nextInt();
                    
                    if(choice == 1)
                    {
                        int seatNO = assignSeat(firstClass);
                        System.out.printf("First Class, Seat #%d%n%n", seatNO);
                    }
                    else
                    {
                        System.out.println("Next flight leaves in 3 hours.\n");
                    }
                }
                ChooseSeat(firstClass, economy);
            }
        }
    }
    
    public static int assignSeat(boolean[] temp)
    {
        for(int i = 0 ; i< temp.length; i++)
        {
            if(!temp[i])
            {
                temp[i] = true;
                return i + 1;
            }
        }
        return -1;
    }
    
    public static boolean isFull(boolean[] temp)
    {
        for(int i = 0 ; i < SEATS ; i++)
        {
            if(!temp[i])
            {
                return false;
            }
        }
        return true;
    }
    
}
