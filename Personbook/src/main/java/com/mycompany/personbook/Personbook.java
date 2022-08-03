/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.personbook;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author raisarafi
 */
public class Personbook {

    public static void main(String[] args) {
        String newPerson;        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("New person: ");
            newPerson = sc.nextLine();
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Field cannot be blank");
            
        } catch (NumberFormatException ne) {
            System.out.println("Error: Name cannot have number");
            
            //IllegalArgumentException ???
            
        } finally {
            System.out.println("New person has been entered");
        }

    }
}
