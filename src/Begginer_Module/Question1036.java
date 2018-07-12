/* Description:
 * Read 3 floating-point numbers. After, print the roots of bhaskara’s 
 * formula. If it's impossible to calculate the roots because a 
 * division by zero or a square root of a negative number, presents the 
 * message “Impossivel calcular”.
 * 
 */

/* Input:
 * Read 3 floating-point numbers A, B and C.  
 */


/* Output:
 * Print the result with 5 digits after the decimal point or the message 
 * if it is impossible to calculate.  
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1036 {
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
        Question1036 q = new Question1036();
        q.sc = new Scanner(System.in);
        q.a = q.sc.nextDouble();
        q.b = q.sc.nextDouble();
        q.c = q.sc.nextDouble();
        
        q.bhaskara();
    }

}
