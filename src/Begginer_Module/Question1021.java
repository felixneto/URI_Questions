/* Description:
 * Read a value of floating point with two decimal places. 
 * This represents a monetary value. After this, calculate 
 * the smallest possible number of notes and coins on which 
 * the value can be decomposed. The considered notes are of 
 * 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 
 * 0.25, 0.10, 0.05 and 0.01. Print the message “NOTAS:” 
 * followed by the list of notes and the message “MOEDAS:” 
 * followed by the list of coins.
 * 
 */

/* Input:
 * The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00). 
 */


/* Output:
 * Print the minimum quantity of banknotes and coins necessary 
 * to change the initial value, as the given example. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1021 {
    public double value;
    public static int cem = 100;
    public static int cinquenta = 50;
    public static int vinte = 20;
    public static int dez = 10;
    public static int cinco = 5;
    public static int dois = 2;
    public static int um = 1;
    public static int vinteCinco = 25;
    public Scanner sc;
    
    public void calculateNotesAndCoins() {
    	System.out.format("NOTAS:%n");
    	System.out.format("%d nota(s) de R$ 100.00%n",(int)value/cem);
    	if(value>=cem) {
        	value = value%cem;
    	} 
    	System.out.format("%d nota(s) de R$ 50.00%n",(int)value/cinquenta);
    	if(value>=cinquenta) {
        	value = value%cinquenta;
    	} 
    	System.out.format("%d nota(s) de R$ 20.00%n",(int)value/vinte);
    	if(value>=vinte) {
        	value = value%vinte;
    	} 
    	System.out.format("%d nota(s) de R$ 10.00%n",(int)value/dez);
    	if(value>=dez) {
        	value = value%dez;
    	} 
    	System.out.format("%d nota(s) de R$ 5.00%n",(int)value/cinco);
    	if(value>=cinco) {
        	value = value%cinco;
    	}
    	System.out.format("%d nota(s) de R$ 2.00%n",(int)value/dois);
    	if(value>=dois) {
        	value = value%dois;
    	}
    	System.out.format("MOEDAS:%n");
    	System.out.format("%d moeda(s) de R$ 1.00%n",(int)value/um);
    	if(value>=um) {
        	value = value%um;
        	value *= cem;
    	}
    	System.out.format("%d moeda(s) de R$ 0.50%n",(int)value/cinquenta);
    	if(value>=cinquenta) {
        	value = value%cinquenta;
    	}
    	System.out.format("%d moeda(s) de R$ 0.25%n",(int)value/vinteCinco);
    	if(value>=vinteCinco) {
        	value = value%vinteCinco;
    	}
    	System.out.format("%d moeda(s) de R$ 0.10%n",(int)value/dez);
    	if(value>=dez) {
        	value = value%dez;
    	}
    	System.out.format("%d moeda(s) de R$ 0.05%n",(int)value/cinco);
    	if(value>=cinco) {
        	value = value%cinco;
    	}
    	System.out.format("%d moeda(s) de R$ 0.01%n",(int)value/um);
    }
    
    public static void main(String[] args ) {
        Question1021 q = new Question1021();
        q.sc = new Scanner(System.in);
        q.value = q.sc.nextDouble();

        q.calculateNotesAndCoins();
    }

}
