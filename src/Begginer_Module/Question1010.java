/* Description:
 * In this problem, the task is to read a code of a product 1, 
 * the number of units of product 1, the price for one unit 
 * of product 1, the code of a product 2, the number of units 
 * of product 2 and the price for one unit of product 2. 
 * After this, calculate and show the amount to be paid.
 */

/* Input:
 * The input file contains two lines of data. 
 * In each line there will be 3 values: two integers 
 * and a floating value with 2 digits after the decimal point.
 */


/* Output:
 * The output file must be a message like the following example 
 * where "Valor a pagar" means Value to Pay. Remember the space 
 * after ":" and after "R$" symbol. The value must be presented 
 * with 2 digits after the point. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1010 {
    public String line, line2;
    public double value1, value2;
    public int id1, id2, qtd1, qtd2;
    public Scanner sc;
    
    public double calculateTotal() {
    	return value1*qtd1+value2*qtd2;
    }
    public static void main(String[] args ) {
        Question1010 q = new Question1010();
        q.sc = new Scanner(System.in);
        q.id1 = q.sc.nextInt();
    	q.qtd1 = q.sc.nextInt();
    	q.value1 = q.sc.nextDouble();
    	
    	q.id2 = q.sc.nextInt();
    	q.qtd2 = q.sc.nextInt();
    	q.value2 = q.sc.nextDouble();
        
        System.out.format("VALOR A PAGAR = R$ %.2f%n",q.calculateTotal());
    }

}
