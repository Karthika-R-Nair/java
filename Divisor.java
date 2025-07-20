/**Author:Karthika R Nair
 * Roll no:52
 * Date:19/07/25
 */
import java.util.Scanner;
public class Divisor{
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);
        int num1,num2,temp;
        System.out.println("Enter the two numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        while(num2!=0)
        {
            temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.println("Greatest common divisor is"+" "+num1);

    }
}