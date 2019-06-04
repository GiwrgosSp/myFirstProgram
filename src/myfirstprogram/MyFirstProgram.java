/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstprogram;

/**
 *
 * @author George
 */
public class MyFirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* DATA TYPES EXAMPLES */
        boolean isTrue = true;
        char letter = 'a';
        byte x1 = 8;
        short x2 = 16;
        int x3 = 32;
        long x4 = 64;
        float y1 = 32.0f;
        double y2 = 64;
        
       //SUM CALCULATION EXAMPLE
        int a = 2;
        int b = a;
        int sum = a+b;
        System.out.println("Sum is: "+sum);
      
       // CASTING EXAMPLE
        float i = 2.5f;
        int y =(int) i;
        int sum2 = y;
        System.out.println("Sum is: "+sum2);
        float i2 = y;
        System.out.println("Float i2 is: "+i2);
        
       //MOD,DIVISON EXAMPLE
        int newNumber = 10%3;
        float division = 14/3.0f;
        System.out.println("newNumber is: "+newNumber);
        System.out.println("division is: "+division);
        
       //MATH LIB EXAMPLE
        int number = -10;
        int result = Math.abs(number);
        System.out.println(result);
        
        int minimum= Math.min(15, 20);
        System.out.println(minimum);
        
        double fl = Math.floor(3.8);
        System.out.println(fl);
        
        
        
        
        
    }
    
}


