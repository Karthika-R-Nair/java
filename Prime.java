/**Author:Karthika R Nair
 * Roll No:52
 * Date:19/07/25
 */
import java.util.Scanner;
public class Prime{
    public static void main(String arr[]){
        int num,i;
        boolean prime;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        prime=true;
        if(num<=1){
            prime=false;
        }
        else{
            for(i=2;i<=num/2;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println(num +" "+ "is a prime number");
        }
        else{
            System.out.println(num +" "+ "is not a prime number");
        }
            
        


    }
}