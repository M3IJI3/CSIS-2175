package triangleprintprogram;

/**
 *
 * @author Jie Mei
 * @date Jan 19 2023
 */
public class TrianglePrintProgram {
    
    public static final int ROW = 10;
    
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****
        // ******
        // *******
        // ********
        // *********
        // **********
        for(int i = 0 ; i < ROW ; i++)
        {
            for(int k = 0 ; k <= i ; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("------------");
        
        // **********
        // *********
        // ********
        // *******
        // ******
        // *****
        // ****
        // ***
        // **
        // *
        
        for(int i = 0 ; i < ROW ; i++)
        {
            for(int k = ROW; k > i; k--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("------------");
        
        // **********
        //  *********
        //   ********
        //    *******
        //     ******
        //      *****
        //       ****
        //        ***
        //         **
        //          *
        
        for(int i = 0 ; i < ROW ; i++)
        {
            if(i > 0)
            {
                for(int j = 0; j < i; j++)
                {
                    System.out.print(" ");
                }
            }
            
            for(int k = ROW; k > i; k--)
            {
                System.out.print("*");
            }
            
            System.out.println("");
            
        }
        
        System.out.println("------------");
        
        //          *
        //         **
        //        ***
        //       ****
        //      *****
        //     ******
        //    *******
        //   ********
        //  *********
        // **********
        
        for(int i = 0 ; i < ROW ; i++)
        {
            for(int j = ROW - 1 ; j > i; j--)
            {
                System.out.print(" ");
            }
            
            for(int k = 0; k <= i; k++)
            {
                System.out.print("*");
            }
            
            System.out.println("");    
        }
    } 
}
