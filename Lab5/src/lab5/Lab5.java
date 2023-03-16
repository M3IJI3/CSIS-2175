/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author major
 * @date 2023/02/14
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        int answer = rd.nextInt(1,1000);

        Play(answer);

    }

    public static void Play(int answer)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>Input your guess: ");
        int guess = sc.nextInt();
        if(guess != answer)
        {
            if(guess > answer)
            {
                System.out.println("Too high. Try again.");
            }
            else
            {
                System.out.println("Too low. Try again.");
            }

            Play(answer);
        }
        else
        {
            System.out.println("Congratulations! You guessed the number.");
            System.out.print("Try again(Y/N)? ");

            String input = sc.next();
            if(input.equalsIgnoreCase("Y"))
            {
                Random rd = new Random();
                answer = rd.nextInt(1,1000);
                //System.out.println(answer);
                Play(answer);
            }
        }
    }
        
}
