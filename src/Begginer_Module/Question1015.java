/* Description:
 * Read the four values corresponding to the x and y 
 * axes of two points in the plane, p1 (x1, y1) and 
 * p2 (x2, y2) and calculate the distance between them, 
 * showing four decimal places after the comma, 
 * according to the formula:
 * 
 * Distance = sqrt((x2-x1)²+(y2-y1)²)
 */

/* Input:
 * The input file contains two lines of data. The first 
 * one contains two double values: x1 y1 and the second 
 * one also contains two double values with one digit 
 * after the decimal point: x2 y2.
 */


/* Output:
 * Calculate and print the distance value using the 
 * provided formula, with 4 digits after the decimal point. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1015 {
    public double x1, y1, x2, y2;
    public double y;
    public Scanner sc;
    
    public double calculateDistance() {
    	
    	return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    
    public static void main(String[] args ) {
        Question1015 q = new Question1015();
        q.sc = new Scanner(System.in);
        q.x1 = q.sc.nextDouble();
        q.y1 = q.sc.nextDouble();
        q.x2 = q.sc.nextDouble();
        q.y2 = q.sc.nextDouble();
        
        System.out.format("%.4f%n",q.calculateDistance());
    }

}
