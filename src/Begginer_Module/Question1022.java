/* Description:
 * You were invited to do a little job for your Mathematic 
 * teacher. The job is to read a Mathematic expression in 
 * format of two rational numbers (numerator / denominator) 
 * and present the result of the operation. Each operand 
 * or operator is separated by a blank space. The input sequence 
 * (each line) must respect the following format: number, (‘/’ char), 
 * number, operation char (‘/’, ‘*’, ‘+’, ‘-‘), number, (‘/’ char), 
 * number. The answer must be presented followed by ‘=’ operator and 
 * the simplified answer. If the answer can’t be simplified, it must 
 * be repeated after a ‘=’ operator.
 * 
 * Considering N1 and D1 as numerator and denominator of the 
 * first fraction, follow the orientation about how to do 
 * each one of these 4 operations:
 * 
 * Sum: (N1*D2 + N2*D1) / (D1*D2)
 * Subtraction: (N1*D2 - N2*D1) / (D1*D2)
 * Multiplication: (N1*N2) / (D1*D2)
 * Division: (N1/D1) / (N2/D2), that means (N1*D2)/(N2*D1)
 * 
 */

/* Input:
 * The input contains several cases of test. The first value 
 * is an integer N (1 ≤ N ≤ 1*104), indicating the amount of 
 * cases of test that must be read. Each case of test contains 
 * a rational value X (1 ≤ X ≤ 1000), an operation (-, +, * or /) 
 * and another rational value Y (1 ≤ Y ≤ 1000). 
 */


/* Output:
 * The output must be a rational number, followed by a “=“ sign 
 * and another rational number, that is the simplification of 
 * the first value. In case of the first value can’t be simplified, 
 * the same value must be repeated after the ‘=’ sign. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1022 {
	public String line;
	public int n1, n2, d1, d2;
    public Scanner sc;
    
    public void calculateFraction() {
    	String[] values = line.split(" ");
    	n1 = Integer.parseInt(values[0]);
    	d1 = Integer.parseInt(values[2]);
    	String operator = values[3];
    	n2 = Integer.parseInt(values[4]);
    	d2 = Integer.parseInt(values[6]);
    	switch (operator) {
    		case "+": sum(); break;
    		case "-": sub(); break;
    		case "*": mult(); break;
    		case "/": div(); break;
    	}
    }
    
    public void sum() {
    	int numerador = n1*d2+n2*d1;
    	int denominador = d1*d2;
    	long gdc = gcd(numerador, denominador);
    	System.out.format("%d/%d = %d/%d%n",numerador, denominador, numerador/gdc, denominador/gdc);
    	
    }
    
	public void sub() {
		int numerador = n1*d2-n2*d1;
    	int denominador = d1*d2;
    	long gdc = gcd(numerador, denominador);
    	System.out.format("%d/%d = %d/%d%n",numerador, denominador, numerador/gdc, denominador/gdc);
	}

	public void mult() {
		int numerador = n1*n2;
    	int denominador = d1*d2;
    	long gdc = gcd(numerador, denominador);
    	System.out.format("%d/%d = %d/%d%n",numerador, denominador, numerador/gdc, denominador/gdc);
	}

	public void div() {
		int numerador = n1*d2;
    	int denominador = n2*d1;
    	long gdc = gcd(numerador, denominador);
    	System.out.format("%d/%d = %d/%d%n",numerador, denominador, numerador/gdc, denominador/gdc);
	}
	
	//Euclid's algorithm
	//https://en.wikipedia.org/wiki/Greatest_common_divisor#Using_Euclid's_algorithm
	public long gcd(long numerador, long denominador) {
		return denominador == 0 ? numerador : gcd(denominador, numerador % denominador);
		
	}
    
    public static void main(String[] args ) {
        Question1022 q = new Question1022();
        q.sc = new Scanner(System.in);
        int loops = q.sc.nextInt();
        q.line = q.sc.nextLine();
        if (loops >=1 && loops < 1000) {
        	for (int i =0;i<loops;i++) {
            	q.line = q.sc.nextLine();
            	q.calculateFraction();
            }
        } else {
        	System.out.println("Valor incorreto");
        }
        
        
        
    }

}
