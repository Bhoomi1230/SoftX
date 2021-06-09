import java.util.Scanner;
public class banking {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String name, type = null;
        int check_bal =0;
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter account no.");
        int accno;
        accno = sc.nextInt();
        BankB b = new BankB("Bhoomi", 1230, 2000, "Current");
        System.out.println("1) Create your  Account ");
        System.out.println("2) Deposit Money");
        System.out.println("3) Check the Balance " );
        System.out.println("4) Withdraw your Money ");
        System.out.println("5) Display Account Details ");
        System.out.println("6) Quit ");
        System.out.println("Enter choice ");
        int choice;
        choice = sc.nextInt();
        boolean quit = false;
        while(choice==0);
        {
            switch(choice)
            {
                case 1:
                    System.out.println("Enter user name ");
                    name = sc.next();
                    System.out.println("Enter account number ");
                    accno = sc.nextInt();
                    b.insert(type, check_bal, type);
                    System.out.println("Enter Your details ");
                    b.display();
                    break;

                case 2: // deposit money
                    System.out.println("Enter user name ");
                    name = sc.next();
                    System.out.println("Enter account number ");
                    int tmp;
                    tmp = sc.nextInt();
                    if(tmp==accno)
                    {
                        System.out.println("Enter money to deposit ");
                        int money;
                        money = sc.nextInt();
                        System.out.println("Money deposited Succesfully");
                        b.display();
                    }
                    else
                        System.out.println("Wrong Account Number");
                    break;

                case 3: // check balance
                    System.out.println("Enter account number ");
                    tmp = sc.nextInt();
                    if(tmp == accno)
                    {
                        System.out.println("Your balance is "+b.balance);
                    }
                    else
                        System.out.println("Wrong account Number ");
                    break;

                case 4: // withdraw money
                    System.out.println("Enter account number");
                    tmp = sc.nextInt();
                    if(tmp == accno)
                    {
                        if(b.balance==0)
                            System.out.println("You have no money ");
                        else
                            System.out.println("Enter money to withdraw ");
                        int money;
                        money = sc.nextInt();
                        if(money> b.balance)
                        {
                            System.out.println("You don't have sufficient money ");
                        }
                        else
                            check_bal = b.withdraw();
                        System.out.print(" Your current balance"+check_bal);
                    }
                    break;

                case 5: // display account details
                    System.out.println("Enter account number ");
                    tmp = sc.nextInt();
                    if(tmp== accno)
                    {
                        System.out.println("Your details are given ");
                        b.display();
                    }
                    else
                        System.out.println("Wrong account number ");
                    break;

                case 6 :
                    quit = true;
                    break;

                default:
                    System.out.println(" wrong choice ");
                    break;


            }

        }
    }
}
class BankA{
    String name;
    String type;
    int balance ;
    int account;

    BankA(String n, int acc,int bal,String t )
    {
        name = n;
        type= t;
        account = acc;
        balance = bal ;
    }
}
class BankB extends BankA{
    BankB(String n, int acc,int bal,String t)
    {
        super(t, bal, bal, t);
        name = n;
        type= t;
        account = acc;
        balance = bal ;
    }
    public int withdraw() {
        return 0;
    }
    void display(){
        System.out.println("Name"+name);
        System.out.println("Account No. "+account);
        System.out.println("Account Balance"+balance);
        System.out.println("Account type "+type);
    }
    void insert(String n, int acc, String t)
    {
        name = n;
        type= t;
        account = acc;

    }
    void deposit(int acc, int money)
    {
        balance = money;
    }
    int withdrawn(int wd)
    {
        balance = balance - wd;
        return balance;
    }
}

