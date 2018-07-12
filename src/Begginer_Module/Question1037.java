/* Description:
 * You must make a program that read a float-point number and print 
 * a message saying in which of following intervals the number 
 * belongs: [0,25] (25,50], (50,75], (75,100]. If the read number 
 * is less than zero or greather than 100, the program must print 
 * the message “Fora de intervalo” that means "Out of Interval".
 * 
 * The symbol '(' represents greather than. For example:
 * [0,25] indicates numbers between 0 and 25.0000, including both.
 * (25,50] indicates numbers greather than 25 (25.00001) up to 50.0000000.
 * 
 */

/* Input:
 * The input file contains a floating-point number.
 */


/* Output:
 * The output must be a message like following example.
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1037 {
	public double a, b, c, d;
	public String line;
    public Scanner sc;
    
    public void bhaskara() {
    	d = (b*b) - (4*a*c);
    	if(a == 0 || d < 0) {
    		System.out.println("Impossivel calcular");
    	} else {
    		b*=-1;
    		double r1 = (b + Math.sqrt(d))/(2*a);
    		double r2 = (b - Math.sqrt(d))/(2*a);
    		System.out.format("R1 = %f%nR2 = %f%n",r1,r2);
    	}
    }
    
    public static void main(String[] args ) {
        Question1037 q = new Question1037();
        q.sc = new Scanner(System.in);
        q.a = q.sc.nextDouble();
        
        q.bhaskara();
    }

}
