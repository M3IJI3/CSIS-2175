/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Jie Mei
 * @date 2023-02-02
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filePath = "src/output.txt";
        ArrayList<String> arrayList = new ArrayList<>();
         
        // read file by line and save results into array list.
        try 
        {
            String encoding = "utf-8";
            File file = new File(filePath);
            
            if(file.isFile() && file.exists())
            {
                InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file), encoding);
                BufferedReader reader = new BufferedReader(read);
                String lineText;
                while((lineText = reader.readLine()) != null)
                {
                    arrayList.add(lineText);
                }
                read.close();
            }
            else
            {
                System.out.println("Unknown file!");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Read file error!");
        }
        
        arrayList.remove(0);
        
        
        int[] side1 = new int[arrayList.size()];
        int[] side2 = new int[arrayList.size()];
        int[] hypotenuse = new int[arrayList.size()];
        
        
        // convert String to int
        // save the value of side1, side2 and hypotenuse into three arrays 
        for(int i = 0 ; i < arrayList.size() ; i++)
        {
               String[] result = arrayList.get(i).split("\\s+");
        
               side1[i] = Integer.parseInt(result[0]);
               side2[i] = Integer.parseInt(result[1]);
               hypotenuse[i] = Integer.parseInt(result[2]);
        }
        
       
        
        // triple nested for-loop that tries all possibilities
        int times = 0;
        System.out.println("Side 1\tSide 2\tHypotenuse");
        for(int i = 0 ; i < side1.length ; i++)
        {
            for(int j = 0 ; j < side2.length ; j++)
            {
                for(int k = 0 ; k < hypotenuse.length ; k++)
                {
                    if(Math.pow(hypotenuse[k], 2) == Math.pow(side1[i], 2) + Math.pow(side2[j], 2))
                    {
                        times++;
                        System.out.printf("%d\t%d\t%d%n", side1[i],side2[j], hypotenuse[k]);
                    }
                }
            }
        }
        
        System.out.printf("%,d possibilities in %,d results.%n", times, 
                side1.length * side2.length * hypotenuse.length);
    }
    
}
