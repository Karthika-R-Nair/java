/**Author:Karthika R Nair
 * Roll No:52
 * Date:17/7/25
 */
import java.util.Scanner;
public class password{
    public static void main(String arr[]){
     String password,username;
     System.out.println("Enter the username:");
     Scanner sc=new Scanner(System.in);
     username=sc.nextLine();
     System.out.println("Enter the password:");
     password=sc.nextLine();
     
     
     if(username=="Karthika" && password=="krn123"){
        System.out.println("Login Successfull");

     }
     else if(username=="Karthika" && password!="krn123"){
        System.out.println("Incorrect password");
     }
     else if(username!="Karthika" && password=="krn123"){
        System.out.println("User not registered");
     }
     else{
        System.out.println("Incorrect username and password");
     }

     
     
     
    }
}