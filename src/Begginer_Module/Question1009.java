/* Description:
 * Make a program that reads a seller's name, his/her 
 * fixed salary and the sale's total made by himself/herself 
 * in the month (in money). Considering that this seller 
 * receives 15% over all products sold, write the final 
 * salary (total) of this seller at the end of the month , 
 * with two decimal places.
 * 
 * Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
 * Don’t forget the blank spaces.
 */

/* Input:
 * The input file contains a text (employee's first name), 
 * and two double precision values, that are the seller's 
 * salary and the total value sold by him/her.
 */


/* Output:
 * Print the seller's total salary, according to the given example. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1009 {
    public String sellerName;
    public double fixedSalary, totalSale;
    public Scanner sc;
    
    public double calculateFinalSalary() {
    	return fixedSalary+totalSale*0.15;
    }
    public static void main(String[] args ) {
        Question1009 q = new Question1009();
        q.sc = new Scanner(System.in);
        q.sellerName = q.sc.nextLine();
        q.fixedSalary = q.sc.nextInt();
        q.totalSale = q.sc.nextDouble();
        
        System.out.format("TOTAL = R$ %.2f%n",q.calculateFinalSalary());
    }

}
