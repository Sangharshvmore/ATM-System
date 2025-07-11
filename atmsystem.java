import java.util.Scanner;  
// ATM system with password encryption
public class atmsystem
{  
    public static boolean validateInputAmount(int amount) {
        return amount > 0;
    }

    public static boolean authenticate(String password) {
        
        String correctPassword = "1234";
        return password.equals(correctPassword);
    }

    public static void main(String args[] )  
    {  
       
        int balance = 100000 ;
        int withdraw ;
        int deposit ;  
         
        Scanner sc = new Scanner(System.in);  
        
        // Authentication process
        System.out.print("Enter your password: ");
        String inputPassword = sc.nextLine();

        if (!authenticate(inputPassword)) {
            System.out.println("Incorrect password. Exiting...");
            System.exit(0);
        }

        while (true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            // Get choice from user  
            int choice = sc.nextInt();  
            switch (choice)  
            {  
                case 1:  
                    System.out.print("Enter money to be withdrawn:");  
                    // Get the withdrawal amount from user  
                    withdraw = sc.nextInt(); 
                    if (!validateInputAmount(withdraw)) {
                        System.out.println("Enter amount greater than zero");
                        break;
                    }
                    
                    // Check whether the balance is greater than or equal to the withdrawal amount  
                    if (balance >= withdraw)  
                    {  
                        // Remove the withdrawal amount from the total balance  
                        balance = balance - withdraw;  
                        System.out.println("Please collect your money");  
                    }  
                    else  
                    {  
                        // Show custom error message   
                        System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break;  
   
                case 2:  
                    System.out.print("Enter money to be deposited:");  
                    // Get deposit amount from the user  
                    deposit = sc.nextInt();  
                    if (!validateInputAmount(deposit)) {
                        System.out.println("Enter amount greater than zero");
                        break;
                    }
                    
                    // Add the deposit amount to the total balance  
                    balance = balance + deposit;  
                    System.out.println("Your money has been successfully deposited");  
                    System.out.println("");  
                    break;  
   
                case 3:  
                    // Display the total balance of the user  
                    System.out.println("Balance : " + balance);  
                    System.out.println("");  
                    break;  
   
                case 4:  
                    // Exit from the menu  
                    System.exit(0);  
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
                    break;
            }  
        }  
    }  
}
