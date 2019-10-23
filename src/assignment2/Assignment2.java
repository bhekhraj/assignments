/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author b
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cd[] = {"C","O","D","E","F","A","S","T"};
      int i=1;

         while(i<9)
              {
            for(int j=0;j<i;j++)
            {
                System.out.print(cd[j]);
            }
            int k =(8-i);
            while(k<8&k>0)
            {
                System.out.print("*");
                k--;
            }
            System.out.println("\n");
            i++;
        }
    }
    
}
