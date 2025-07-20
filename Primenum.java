/**Author:Karthika R Nair
 * Roll No:52
 * Date:19/07/25
 */
public class Primenum{
    public static void main(String arr[]){
        int prime;
        System.out.println("Prime numbers between 1 and 100 are");
        for(int i=2;i<=100;i++){
            prime=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    prime=0;
                    break;
                }
            }
            if(prime==1){
                System.out.println(i);
            }
        }
    }
