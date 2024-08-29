import java.util.Random;
import java.util.Scanner;

class sbm_bank{
    public long acc_no;
    public long balance;
    Scanner sc=new Scanner(System.in);
    public sbm_bank(long racc, long rbal){
        acc_no = racc;
        System.out.print("acc.no: "+acc_no);
        System.out.println();
        System.out.flush();
        balance = rbal;
        System.out.print("balance: "+balance);
        System.out.flush(); 
    }
    public void withdraw(){
        System.out.print("please enter the account number: ");
        int acccheck=sc.nextInt();
        if(acccheck != acc_no){
            System.out.println("you have entered wrong account number");
        }
        else{
            System.out.print("please enter the amount to withdraw: ");
            int amt=sc.nextInt();
            if(amt>balance){
                System.out.println("you have insufficient balance");
                
            }
            else{
                balance -= amt;
                System.out.println("You have successfully withdrawn the money.");
                System.out.println("You have "+balance+"$ left in your account.");
                
            }
        }
    }
    public void deposit(){
        System.out.print("please enter the account number: ");
        int acccheck=sc.nextInt();
        if(acccheck != acc_no){
            System.out.println("you have entered wrong account number");
        }
        else{
            System.out.print("Please enter the deposit amount: ");
            int dep = sc.nextInt();
            balance+=dep;
            System.out.println("You have successfully deposited the money.");
            System.out.println("Your new balance is: "+balance+"$.");
        }
    }
    public void check_bal(){
        System.out.print("Please enter your account number to check balance: ");
        long accNoCheck = sc.nextLong();
        if(accNoCheck != acc_no) {
            System.out.println("You have entered the wrong account number.");
        }
        else{
            System.out.println("Your account balance is: "+balance+"$.");
        }
    }
}
class banking{
    public static void main(String[] args) {
        Random rn=new Random();
        long racc = 1000000L + (long)(rn.nextDouble() * 9000000L);
        long rbal = 100000L + (long)(rn.nextDouble() * 900000L);
        sbm_bank s1=new sbm_bank(racc ,rbal);
        Scanner sc=new Scanner(System.in);
        int choice = 0;
        while(choice!=4){
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                s1.withdraw();
                break;
                case 2:
                s1.deposit();
                break;
                case 3:
                s1.check_bal();
                break;
                case 4:
                break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}