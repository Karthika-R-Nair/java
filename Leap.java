/**Author:Karthika R Nair
 * Roll no:52
 * date:19/07/25
 */
import java.util.Scanner;
public class Leap {

    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year:");
        year=sc.nextInt();
        if((year%4==0 && year % 100 !=0)||(year % 400==0)){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }

        

    }
}