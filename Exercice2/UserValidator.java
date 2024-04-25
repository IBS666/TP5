/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5exercice2;

/**
 *
 * @author MSI
 */
public class UserValidator {
   public static class UserAgeException extends Exception {
        public UserAgeException(String msg) {
            super(msg);
        }
    }
   public void validateAge(int age) throws UserAgeException {
        if (age < 18) {
            throw new UserAgeException("non validated age");
        }
        else
            System.out.println("validated age");
    }

    
}
