/* Description:
 * Read an integer value corresponding to a person's age 
 * (in days) and print it in years, months and days, 
 * followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.
 * 
 * Note: only to facilitate the calculation, consider the whole 
 * year with 365 days and 30 days every month. In the cases of 
 * test there will never a situation that allows 12 months and some days, 
 * like 360, 363 or 364. This is just an exercise for the purpose of 
 * testing simple mathematical reasoning.
 * 
 */

/* Input:
 * The input file contains 1 integer value. 
 */


/* Output:
 * Print the output, like the following example. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1020 {
    public int ano, mes, dias;
    public Scanner sc;
    
    public void calculateDate() {
    	if(dias >= 365) {
    		ano = dias/365;
    		dias = dias%365;
    	}
    	if(dias >= 30) {
    		mes = dias/30;
    		dias = dias%30;
    	}
    	System.out.format("%d ano(s)%n%d mes(es)%n%d dia(s)",ano,mes,dias);
    }
    
    public static void main(String[] args ) {
        Question1020 q = new Question1020();
        q.sc = new Scanner(System.in);
        q.dias = q.sc.nextInt();

        q.calculateDate();
    }

}
