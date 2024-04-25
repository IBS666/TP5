/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5exercice2;

/**
 *
 * @author MSI
 */
public class MathOperations {
    public static void calculateFactorial(int nbr) throws IllegalArgumentException{
        if (nbr<0){
            throw new IllegalArgumentException("Number must be positive") ;
        }
        int f = 1;
    for(int i=1; i <= nbr; i++){ 
      f = f * i;  
    }  
    System.out.println("Factorielle de "+nbr+" est: "+f); 
    }
    
    public static void  calculateSquareRoot(double nbr)throws ArithmeticException {
        if (nbr<0){
            throw new ArithmeticException("Number must be positive");
        }
        
         System.out.println(Math.sqrt(nbr)); 
    }
}
