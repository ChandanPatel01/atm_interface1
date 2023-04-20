import java.util.Scanner;
public class atm{
public static void main(String[]args){
 int balance = 100000,withdraw,deposit;
 Scanner sc=new Scanner(System.in);
while(true){
  System.out.println("Welcome To The SBI");
  System.out.println("Chose 1 for Withdraw ");
  System.out.println("Chose 2 for Deposit ");
  System.out.println("Chose 3 for balance enquiry");
  System.out.println("Chose 4 for Exit ");
  System.out.println("Chose 5 for which opreation perform ");
  int choice=sc.nextInt();
   switch(choice){
       case 1:
           System.out.print("Enter money to be withdrawn:");  
            withdraw = sc.nextInt();
            if(balance>=withdraw){
            balance=balance-withdraw;
            System.out.println("Please collect your monney");
            }
            else{
            System.out.println("Insufficient Balance");
            }
           System.out.println("");
            break;
            case 2:
                System.out.print("Enter money to be deposited:");
                  deposit = sc.nextInt();
                  balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
        case 3:
             System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
        case 4:
             System.exit(0);
                
            
}
}
}
}