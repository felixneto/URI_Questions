/* Description:
 * Make a program that reads 3 integer values and present 
 * the greatest one followed by the message "eh o maior". 
 * Use the following formula:
 * 
 * MaiorAB = (a+b+abs(a-b))/2;
 */

/* Input:
 * The input file contains 3 integer values.
 */


/* Output:
 * Print the greatest of these three values followed by 
 * a space and the message “eh o maior”. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1013 {
    public int a, b, c;
    public Scanner sc;
    
    public int calculateMaior() {
    	int maiorAb = (a+b+Math.abs(a-b))/2;
    	return maiorAb > c ?  maiorAb : c;
    }
    
    public static void main(String[] args ) {
        Question1013 q = new Question1013();
        q.sc = new Scanner(System.in);
        
        q.a = q.sc.nextInt();
        q.b = q.sc.nextInt();
        q.c = q.sc.nextInt();
        
        System.out.format("%d eh o maior%n",q.calculateMaior());
    }

}
