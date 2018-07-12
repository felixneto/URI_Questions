/* Description:
 * Make a program that calculates and shows the volume of 
 * a sphere being provided the value of its radius (R). 
 * The formula to calculate the volume is: (4/3) * pi * R3. 
 * Consider (assign) for pi the value 3.14159.
 * 
 * Tip: Use (4/3.0) or (4.0/3) in your formula, 
 * because some languages (including C++) assume 
 * that the division's result between two integers is another integer.
 */

/* Input:
 * The input contains a value of floating point (double precision).
 */


/* Output:
 * The output must be a message "VOLUME" like the following 
 * example with a space before and after the equal signal. 
 * The value must be presented with 3 digits after the decimal point. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1011 {
    public int raio;
    public double pi = 3.14159;
    public Scanner sc;
    
    public double calculateVolume() {
    	return Math.PI*Math.pow(raio, 3)*(4.0/3);
    }
    public static void main(String[] args ) {
        Question1011 q = new Question1011();
        q.sc = new Scanner(System.in);
        q.raio = q.sc.nextInt();
        
        System.out.format("VOLUME = R$ %.3f%n",q.calculateVolume());
    }

}
