/* Description:
 * Write a program that reads an employee's number, 
 * his/her worked hours number in a month and the amount 
 * he received per hour. Print the employee's number and 
 * salary that he/she will receive at end of the month, 
 * with two decimal places.
 * 	Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
 * 	Don’t forget the space before and after the equal signal and after the U$.
 */

/* Input:
 * The input file contains 2 integer numbers and 1 value of floating point, 
 * representing the number, worked hours amount and the amount the employee receives per worked hour.
 */


/* Output:
 * Print the number and the employee's salary, according to the given example, 
 * with a blank space before and after the equal signal.
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1008 {
    public int employeeNumber, workedHours;
    public double amount;
    public Scanner sc;
    
    public double calculateSalary() {
    	return workedHours*amount;
    }
    public static void main(String[] args ) {
        Question1008 q = new Question1008();
        q.sc = new Scanner(System.in);
        q.employeeNumber = q.sc.nextInt();
        q.workedHours = q.sc.nextInt();
        q.amount = q.sc.nextDouble();
        
        System.out.println("NUMBER = "+q.employeeNumber);
        System.out.format("SALARY = U$ %.2f%n",q.calculateSalary());
    }

}
