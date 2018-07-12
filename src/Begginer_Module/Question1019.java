/* Description:
 * Read an integer value, which is the duration in seconds 
 * of a certain event in a factory, and inform it expressed 
 * in hours:minutes:seconds.
 * 
 */

/* Input:
 * The input file contains an integer N. 
 */


/* Output:
 * Print the read time in the input file (seconds) converted 
 * in hours:minutes:seconds like the following example. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1019 {
    public int seconds, minutes =0, hours=0;
    public Scanner sc;
    
    public void calculateTime() {
    	if(seconds>=3600) {
    		hours = seconds/3600;
    		seconds = seconds%3600;
    	}
    	if(seconds>=60) {
    		minutes = seconds/60;
    		seconds = seconds%60;
    	}
    	System.out.format("%d:%d:%d", hours,minutes,seconds);
    }
    
    public static void main(String[] args ) {
        Question1019 q = new Question1019();
        q.sc = new Scanner(System.in);
        q.seconds = q.sc.nextInt();

        q.calculateTime();
    }

}
