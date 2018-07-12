/* Description:
 * In this problem you have to read an integer value and calculate 
 * the smallest possible number of banknotes in which the value 
 * may be decomposed. The possible banknotes are 100, 50, 20, 10, 
 * 5, 2 e 1. Print the read value and the list of banknotes.
 * 
 */

/* Input:
 * The input file contains an integer value N (0 < N < 1000000). 
 */


/* Output:
 * Print the read number and the minimum quantity of each necessary 
 * banknotes in Portuguese language, as the given example. 
 * Do not forget to print the end of line after each line, otherwise 
 * you will receive “Presentation Error”. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1018 {
    public int value;
    public static int cem = 100;
    public static int cinquenta = 50;
    public static int vinte = 20;
    public static int dez = 10;
    public static int cinco = 5;
    public static int dois = 2;
    public static int um = 1;
    public Scanner sc;
    
    public void calculateBankNotes() {
    	System.out.format("%d%n",value);
    	System.out.format("%d nota(s) de R$ 100,00%n",value/cem);
    	if(value>=cem) {
        	value = value%cem;
    	} 
    	System.out.format("%d nota(s) de R$ 50,00%n",value/cinquenta);
    	if(value>=cinquenta) {
        	value = value%cinquenta;
    	} 
    	System.out.format("%d nota(s) de R$ 20,00%n",value/vinte);
    	if(value>=vinte) {
        	value = value%vinte;
    	} 
    	System.out.format("%d nota(s) de R$ 10,00%n",value/dez);
    	if(value>=dez) {
        	value = value%dez;
    	} 
    	System.out.format("%d nota(s) de R$ 5,00%n",value/cinco);
    	if(value>=cinco) {
        	value = value%cinco;
    	}
    	System.out.format("%d nota(s) de R$ 2,00%n",value/dois);
    	if(value>=dois) {
        	value = value%dois;
    	}
    	System.out.format("%d nota(s) de R$ 1,00%n",value/um);
    	
    }
    
    public static void main(String[] args ) {
        Question1018 q = new Question1018();
        q.sc = new Scanner(System.in);
        q.value = q.sc.nextInt();

        q.calculateBankNotes();
    }

}
