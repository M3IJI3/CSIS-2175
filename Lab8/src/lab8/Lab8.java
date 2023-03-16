/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author Jie Mei
 */
public class Lab8 {
    
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    
    public static void main(String[] args) {
        
        // initialize turtle position
        int x = 0;
        int y = 0;
        
        // move forward distance
        int distance;
        
        int input = 0;
       
        int[][] shape = new int[WIDTH][HEIGHT];
        Scanner sc = new Scanner(System.in);
        
        Turtle turtle = new Turtle(x, y, Direction.EAST);
        
        while(input != 9)
        {
            System.out.print("Enter command (9 to end input): ");
            input = sc.nextInt();
            
            switch (input) {
                case 1 -> turtle.penUp(turtle);
                case 2 -> turtle.penDown(shape, turtle);
                case 3 -> turtle.turnRight();
                case 4 -> turtle.turnLeft();
                case 5 -> {
                    System.out.print("Enter forward spaces: ");
                    distance = sc.nextInt();
                    turtle.moveForward(shape, turtle, distance);
                }
                case 6 -> printShape(shape);
                case 9 -> { }
                default -> { }
            }
        }
    }
    
    // print shape
    public static void printShape(int [][] shape)
    {
        for(int w = 0 ; w < WIDTH ; w++)
        {
            for(int h = 0 ; h < HEIGHT ; h++)
            {
                if(shape[w][h] == 1)
                {
                    System.out.print("*");
                }
                else
                {
                    //System.out.print(shape[w][h]);
                    System.out.print(" ");
                }                 
            }
            System.out.println();
        }
    } 
   
}
