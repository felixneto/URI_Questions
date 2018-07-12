/* Description:
 * Read three values (variables A, B and C), which are the three 
 * student's grades. Then, calculate the average, considering 
 * that grade A has weight 2, grade B has weight 3 and the grade C 
 * has weight 5. Consider that each grade can go from 0 to 10.0, 
 * always with one decimal place.
 */

/* Input:
 * The input file contains 3 values of floating points with 
 * one digit after the decimal point.
 */


/* Output:
 * Print MEDIA(average in Portuguese) according to the following example, 
 * with a blank space before and after the equal signal.
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1006 {
    public double a, b, c, media;
    public Scanner sc;
    
    public void calculateMedia() {
    	media = (a*2+b*3+c*5)/10;
    }
    public static void main(String[] args ) {
        Question1006 q = new Question1006();
        q.sc = new Scanner(System.in);
        q.a = q.sc.nextDouble();
        q.b = q.sc.nextDouble();
        q.c = q.sc.nextDouble();
        q.calculateMedia();
        System.out.format("MEDIA = %.1f%n",q.media);
    }

}
