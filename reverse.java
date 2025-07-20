/**Author:Karthika R Nair
 * Roll no:52
 * Date:19/07/25
 */
import java.util.Scanner;
public class reverse{
    public static void main(String arr[]){
        
        Scanner sc= new Scanner(System.in);
        int number,reverse=0, i=0;
        System.out.println("Enter the number");
        number=sc.nextInt();
        for(i=0;number!=0;i++){
            reverse*=10;
            reverse=reverse+number%10;
            number=number/10;

        }
        System.out.println("Reverse of the given number is"+" "+reverse);
    }
}