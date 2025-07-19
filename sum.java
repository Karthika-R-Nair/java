/**Author:Karthika R Nair
 * Roll No:52
 * Date:16/07/25
 */
import java.util.Scanner;
public class sum
{
    public static void main(String arr[]){
        int num1,num2,sum=0;
        System.out.println("Enter the first number: ");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("The sum is:"+sum);
    }
}