/**Author:Karthika R Nair
 * Roll no:52
 * Date:19/07/25
 */
import java.util.Scanner;
public class Fibanocci{
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);
        int limit,n1=0,n2=1;
        System.out.println("Enter the limit");
        limit=sc.nextInt();
        int nextNum=n1+n2;
        System.out.println("Fibanocci series up to given limit:");
        while(n1<=limit){
            System.out.println(n1 +" ");
            nextNum=n1+n2;
            n1=n2;
            n2=nextNum;

        }
    }
}