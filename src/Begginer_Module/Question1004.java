/* Description:
 * Read two integer values. After this, 
 * calculate the product between them and store the result 
 * in a variable named PROD. Print the result like the example below.
 * Do not forget to print the end of line after the result, otherwise
 * you will receive �Presentation Error�.
 */

/* Input:
 * The input file contains 2 integer numbers.
 */


/* Output:
 * Print PROD according to the following example, with a blank space 
 * before and after the equal signal.
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1004 {
    public int a, b, prod;
    public Scanner sc;
    
    public void calculateProd() {
    	prod = a*b;
    }
    public static void main(String[] args ) {
        Question1004 q = new Question1004();
        q.sc = new Scanner(System.in);
        System.out.println("Variable a:");
        q.a = q.sc.nextInt();
        System.out.println("Variable b:");
        q.b = q.sc.nextInt();
        q.calculateProd();
        System.out.format("SOMA = %d%n",q.prod);
    }

}
