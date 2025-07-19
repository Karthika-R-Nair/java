/**Author:Karthika R Nair
 * Roll no:52
 * Date:19/07/25
 */
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        int num,i=1;
        long fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        while (i<=num) {
            fact=fact*i;
            i++;

            
        }
        System.out.println("Factorial is "+fact);
    }
}