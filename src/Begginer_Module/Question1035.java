/* Description:
 * Read 4 integer values A, B, C and D. Then if B is greater than C and D 
 * is greater than A and if the sum of C and D is greater than the sum of 
 * A and B and if C and D were positives values and if A is even, write 
 * the message “Valores aceitos” (Accepted values). Otherwise, write the 
 * message “Valores nao aceitos” (Values not accepted).
 * 
 */

/* Input:
 * Four integer numbers A, B, C and D.  
 */


/* Output:
 * Show the corresponding message after the validation of the values​​.  
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1035 {
	public int a, b, c, d;
	public String line;
    public Scanner sc;
    
    public void verifyNumbers() {
    	if(b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a%2==0) {
    		System.out.println("Valores nao aceitos");
    	} else {
    		System.out.println("Valores aceitos");
    	}
    }
    
    public static void main(String[] args ) {
        Question1035 q = new Question1035();
        q.sc = new Scanner(System.in);
        q.a = q.sc.nextInt();
        q.b = q.sc.nextInt();
        q.c = q.sc.nextInt();
        q.d = q.sc.nextInt();
        
        
    }

}
