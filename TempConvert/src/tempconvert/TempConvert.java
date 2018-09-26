/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;

import java.util.Scanner;

/**
 *
 * @author Coolavin
 */
public class TempConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                double tempCelsius, tempFahrenheit;
                
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter temperature in Celsius: ");
        tempCelsius = keyboard.nextInt();
        
        tempFahrenheit = (9.0/5.0) * tempCelsius + 32.0;
        
        System.out.println("The temperature in Fahrenheit is " + tempFahrenheit);
    }
    
}
