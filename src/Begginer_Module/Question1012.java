/* Description:
 * Make a program that reads three floating point values: A, B and C. Then, calculate and show:
 * a) the area of the rectangled triangle that has base A and height C.
 * b) the area of the radius's circle C. (pi = 3.14159)
 * c) the area of the trapezium which has A and B by base, and C by height.
 * d) the area of ​​the square that has side B.
 * e) the area of the rectangle that has sides A and B.
 */

/* Input:
 * The input file contains three double values with one digit after the decimal point.
 */


/* Output:
 * The output file must contain 5 lines of data. Each line 
 * corresponds to one of the areas described above, always 
 * with a corresponding message (in Portuguese) and one 
 * space between the two points and the value. The value 
 * calculated must be presented with 3 digits after the decimal point. 
 */
package Begginer_Module;
import java.util.Scanner;

public class Question1012 {
    public int raio;
    public double a, b, c;
    public Scanner sc;
    
    public double calculateTriangulo() {
    	return a*c/2;
    }
    
    public double calculateCirculo() {
    	return Math.PI*c*c;
    }
    
    public double calculateTrapezio() {
    	return (a+b)*c/2;
    }
    
    public double calculateQuadrado() {
    	return b*b;
    }
    
    public double calculateRetangulo() {
    	return a*b;
    }
    
    public static void main(String[] args ) {
        Question1012 q = new Question1012();
        q.sc = new Scanner(System.in);
        
        q.a = q.sc.nextDouble();
        q.b = q.sc.nextDouble();
        q.c = q.sc.nextDouble();
        
        System.out.format("TRIANGULO: %.3f%n",q.calculateTriangulo());
        System.out.format("CIRCULO: %.3f%n",q.calculateCirculo());
        System.out.format("TRAPEZIO: %.3f%n",q.calculateTrapezio());
        System.out.format("QUADRADO: %.3f%n",q.calculateQuadrado());
        System.out.format("RETANGULO: %.3f%n",q.calculateRetangulo());
    }

}
