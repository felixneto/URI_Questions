
/* Description:
 * The formula to calculate the area of a circumference is defined as A = PI . R2.
 * Considering to this problem that PI = 3.14159:
 * Calculate the area using the formula given in the problem description.
 */


/* Input:
 * The input contains a value of floating point (double precision), that is the variable R.
 */


/* Output:
 * Present the message "A= " followed by the value of the variable, 
 * as in the example bellow, with four places after the decimal point. 
 * Use all double precision variables. Like all the problems, don't forget to print the end of line after the result, 
 * otherwise you will receive "Presentation Error".
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1002 {
    public double r, area;
    public Scanner sc;
    
    public void calculateArea() {
    	area = Math.PI * r * r;
    }
    public static void main(String[] args ) {
        Question1002 q = new Question1002();
        q.sc = new Scanner(System.in);
        System.out.println("Variable r:");
        q.r = q.sc.nextDouble();
        q.calculateArea();
        System.out.format("A= %.4f%n",q.area);
    }

}
