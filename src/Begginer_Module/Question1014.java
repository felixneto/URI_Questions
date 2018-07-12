/* Description:
 * Calculate a car's average consumption being 
 * provided the total distance traveled (in Km) 
 * and the spent fuel total (in liters).
 */

/* Input:
 * The input file contains two values: one integer 
 * value X representing the total distance (in Km) 
 * and the second one is a floating point number Y 
 * representing the spent fuel total, with a digit after the decimal point.
 */


/* Output:
 * Present a value that represents the average 
 * consumption of a car with 3 digits after the 
 * decimal point, followed by the message "km/l". 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1014 {
    public int x;
    public double y;
    public Scanner sc;
    
    public double calculateComsuption() {
    	
    	return x/y;
    }
    
    public static void main(String[] args ) {
        Question1014 q = new Question1014();
        q.sc = new Scanner(System.in);
        q.x = q.sc.nextInt();
        q.y = q.sc.nextDouble();
        
        System.out.format("%.3f km/l%n",q.calculateComsuption());
    }

}
