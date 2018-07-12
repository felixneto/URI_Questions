/* Description:
 * Read four integer values named A, B, C and D. 
 * Calculate and print the difference of product 
 * A and B by the product of C and D (A * B - C * D).
 */

/* Input:
 * The input file contains 4 integer values.
 */


/* Output:
 * Print DIFERENCA (DIFFERENCE in Portuguese) with 
 * all the capital letters, according to the following 
 * example, with a blank space before and after the equal signal.
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1007 {
    public int a, b, c, d;
    public Scanner sc;
    
    public int calculateDiferenca() {
    	return a*b-c*d;
    }
    public static void main(String[] args ) {
        Question1007 q = new Question1007();
        q.sc = new Scanner(System.in);
        q.a = q.sc.nextInt();
        q.b = q.sc.nextInt();
        q.c = q.sc.nextInt();
        q.d = q.sc.nextInt();
        
        System.out.format("DIFERENCA = %d%n",q.calculateDiferenca());
    }

}
