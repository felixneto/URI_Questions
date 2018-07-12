/* Description:
 * Read 2 variables, named A and B and make the sum of these two variables, 
 * assigning its result to the variable X. Print X as shown below. 
 * Print endline after the result otherwise you will get �Presentation Error�.
 */

/* Input:
 * The input file will contain 2 integer numbers.
 */


/* Output:
 * Print the letter X (uppercase) with a blank space before and after the equal 
 * signal followed by the value of X, according to the following example.
 * Obs.: don't forget the endline after all.
 */

package Begginer_Module;
import java.util.Scanner;

public class Question1001 {
    public int a, b;
    public Scanner sc;
    
    public int soma() {
    	return a+b;
    }
    public static void main(String[] args ) {
        Question1001 q = new Question1001();
        q.sc = new Scanner(System.in);
        q.a = q.sc.nextInt();
        q.b = q.sc.nextInt();
        
        System.out.format("X = %d%n",q.soma());
    }

}
