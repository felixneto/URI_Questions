/* Description:
 * Read two integer values, in this case,
 * the variables A and B. After this, calculate
 * the sum between them and assign it to the variable
 * SOMA. Write the value of this variable.
 */

/* Input:
 * The input file contains 2 integer numbers.
 */


/* Output:
 * Print the variable SOMA with all the capital letters, 
 * with a blank space before and after the equal signal 
 * followed by the corresponding value to the sum of A and B. 
 * Like all the problems, don't forget to print the end of line, 
 * otherwise you will receive "Presentation Error"
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1003 {
    public int a, b, soma;
    public Scanner sc;
    
    public void calculateSoma() {
    	soma = a + b;
    }
    public static void main(String[] args ) {
        Question1003 q = new Question1003();
        q.sc = new Scanner(System.in);
        System.out.println("Variable a:");
        q.a = q.sc.nextInt();
        System.out.println("Variable b:");
        q.b = q.sc.nextInt();
        q.calculateSoma();
        System.out.format("SOMA = %d%n",q.soma);
    }

}
