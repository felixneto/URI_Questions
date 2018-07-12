/* Description:
 * Two cars (X and Y) leave in the same direction. 
 * The car X leaves with a constant speed of 60 km/h 
 * and the car Y leaves with a constant speed of 90 km / h.
 * 
 * In one hour (60 minutes) the car Y can get a distance 
 * of 30 kilometers from the X car, in other words, 
 * it can get away one kilometer for each 2 minutes.
 * 
 * Read the distance (in km) and calculate how long 
 * it takes (in minutes) for the car Y to take this 
 * distance in relation to the other car.
 * 
 */

/* Input:
 * The input file contains 1 integer value. 
 */


/* Output:
 * Print the necessary time followed by the message "minutos" 
 * that means minutes in Portuguese. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1016 {
    public int km,t;
    public Scanner sc;
    
    public int calculateMinutes() {
    	double velocidade = 90 - 60;
    	t = (int)(60*km/velocidade);
    	
    	return t;
    }
    
    public static void main(String[] args ) {
        Question1016 q = new Question1016();
        q.sc = new Scanner(System.in);
        q.km = q.sc.nextInt();
                
        System.out.format("%d minutos%n",q.calculateMinutes());
    }

}
