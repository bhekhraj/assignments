/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b
 */
public class Assignment2 {
     public static void main(String[] args) {
        // TODO code application logic here
        String cd[] = {"C","O","D","E","F","A","S","T"};
        int i=1;
        while(i<9)
        {
            for(int j=i;j<=i;j++)
            {
                System.out.println(""+cd[j]);
            }
            int k=(8-i);
            while(k<8|k>0)
            {
                System.out.println("*");
                k--;
            }
            System.out.println("\n");
        }
    }
    
}
    
}
