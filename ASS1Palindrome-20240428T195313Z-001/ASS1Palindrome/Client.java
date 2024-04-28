import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String serverURL = "rmi://localhost/Server";
            Serverintf serverintf = (Serverintf) Naming.lookup(serverURL);
            System.out.print("Enter Your String ");
            String str = sc.nextLine();
            
            
            System.out.println(" ------------------- Results-------------------");
           
            if (serverintf.isPalindrome(str)) {
                System.out.println("Your String is Palindrome !!");
            }
            else
            {
                System.out.println("Your String is NOT Palindrome !!");
            }

        } catch (Exception e) {
            System.out.println("Exception Occurred at Client!" + e.getMessage());
        }
    }
}


//javac  *.java
//rmiregistry
//java Server
// java Client
