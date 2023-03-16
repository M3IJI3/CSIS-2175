/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Jie Mei
 */

public class Turtle {
    
    // coordinates of the turtle 
    public int x;
    public int y;
    public boolean penStatus;
    
    // direction of the turtle
    public Direction dir;
    
    public Turtle(int x, int y, Direction dir)
    {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.penStatus = false;
    }
    
    public void penDown(int[][] shape, Turtle turtle)
    {
        turtle.penStatus = true;
        shape[turtle.x][turtle.y] = 1;
    }
    
    public void penUp(Turtle turtle)
    {
        turtle.penStatus = false;
    }
    
    public void turnLeft()
    {
        if(dir == Direction.EAST)
        {
            dir = Direction.NORTH;
        }
        else if(dir == Direction.NORTH)
        {
            dir = Direction.WEST;
        }
        else if(dir == Direction.WEST)
        {
            dir = Direction.SOUTH;
        }
        else 
        {
            dir = Direction.EAST;
        }
        
    }
    
    public void turnRight()
    {
        if(dir == Direction.EAST)
        {
            dir = Direction.SOUTH;
        }
        else if(dir == Direction.SOUTH)
        {
            dir = Direction.WEST;
        }
        else if(dir == Direction.WEST)
        {
            dir = Direction.NORTH;
        }
        else
        {
            dir = Direction.EAST;
        }
    }
    
    public void moveForward(int[][] shape, Turtle turtle, int distance)
    {  
        if(turtle.penStatus == true)
        { 
            while(distance > 0)
            {
                if(turtle.dir == Direction.EAST)
                {
                    shape[x][turtle.y] = 1;
                    if(turtle.y < 19)
                    {
                        turtle.y++;
                    }
                }
                else if(turtle.dir == Direction.WEST)
                {
                    shape[x][turtle.y] = 1;
                    if(turtle.y > 0)
                    {
                        turtle.y--;
                    }
                }
                else if(turtle.dir == Direction.SOUTH)
                {
                    shape[turtle.x][y] = 1;
                    if(turtle.x < 19)
                    {
                        turtle.x++;
                    }
                }
                else
                {
                    shape[turtle.x][y] = 1;
                    if(turtle.x > 0)
                    {
                        turtle.x--;
                    }
                }
                distance--;
            }
        }
        else
        {
            System.out.println("Please put pen down before drawing!");
        }        
    } 
    
//    public static void showPos(Turtle turtle)
//    {
//        System.out.println("( " + turtle.x + ", " + turtle.y + " )");
//    }
}
