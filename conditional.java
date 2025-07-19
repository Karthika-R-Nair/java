/**Author: Karthika R Nair
 * Roll no:52
 * date:18/07/25
 */
import java.util.Scanner;
public class conditional{
    public static void main(String arr[]){
        int num1, num2,bignumber;
        System.out.println("Enter the first number:");
        Scanner sc=new Scanner(System.in);
        num1= sc.nextInt();
        System.out.println("Enter the second number:");
        num2= sc.nextInt();
        bignumber=num1>num2?num1:num2;
        System.out.println("Bigger number:"+bignumber);
    }
}