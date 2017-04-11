/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteshortint;

/**
 *
 * @author ajaso
 */
public class ByteShortInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Int Min and Max (Width of 32)
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);
        
        //Smallest = -128, Largetst = 127 (Width of 8)
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);   //Treat as byte (casting)
        System.out.println("myNewByteValue = " + myNewByteValue);
        
        //Smallest = -32,768, Largest = 32,767 (Width of 16)
        short myShortValue = 32_767;
        short myNewShortValue = (short) (myShortValue/2);
       
        //Smallest = -2^63, Largest = 2^63 (Width of 64)
        //Append 'L' after value
        long myLongValue = 100L;
        
        
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 50;
        long longVar = 50_000L + (10L * (byteVar + shortVar + intVar));
        long shortTotal = (short) 1_000 + (10 * (byteVar + shortVar + intVar));
        System.out.println("longVar = " + longVar);
        System.out.println("shortTotal = " + shortTotal);
    }
    
}
