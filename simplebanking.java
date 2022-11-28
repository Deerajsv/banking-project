package banking;

import java.util.Scanner;

public class simplebanking {
	 Scanner in=new Scanner(System.in);
	
	 float deposit,withdraw,Transaction,balance;
	 void deposit()
	 {

         System.out.println("Enter the Deposit Amount :");
         deposit=in.nextFloat();
         balance=balance+deposit;
         
	 }
	 
	 void withdraw()
	 {  
	
         System.out.println("Enter the Withdraw amount : ");
         withdraw=in.nextFloat();
         if(withdraw>balance)
	      {
		 System.out.println("Your Transaction Doesn't Exist");
		 System.out.println("Please Try Again Later");
		 
	      }
         else
         {
        	 balance=balance-withdraw;
            
         }
	      
	 }
	 void Transactionamount()
	 {  
	
         System.out.println("Enter the Transaction amount : ");
         Transaction=in.nextFloat();
         if(Transaction>balance)
	      {
		 System.out.println("Your Transaction Doesn't Exist");
		 System.out.println("Please Try Again Later");
		 
	      }
         else
         {
        	 balance=balance-Transaction;
            
         }
	      
	 }
	 void balance()
	 {
		 System.out.println("Your Available Balance= "+balance);
	 }
	
	   

	public static void main(String[] args) {
		
		 Scanner in=new Scanner(System.in);
          simplebanking b=new simplebanking();
          char c,i;
          System.out.println("ACCOUNT CREDIT/DEBIT/BALANCE DETAILS     ");
          System.out.println("ACCOUNT HOLDER NAME : Bruce Banner   ");
          System.out.println("BANK NAME : HDFC BANK ");
          System.out.println("Bank Branch : Mumbai ");
          System.out.println("MOBILE NUMBER : 123456789 ");
          System.out.println("ACCOUNT TYPE : BUISNESS ACCOUNT ");
          System.out.println("Enter choice(a-c): ");
          while(true)
          {
        	  System.out.println("a.Depositamount");
        	  System.out.println("b.Withdrawamount");
        	  System.out.println("c.Transactionamount");
        	  System.out.println("d.Balanceamount");
          i=in.next().charAt(0);
          if(i=='a')
          { 
          b.deposit();
          }
          
          else if(i=='b')
          {
          b.withdraw();
          }
          else if(i=='c')
          {
          b.Transactionamount();
          }
          else if(i=='d')
          {
          b.balance();
          }
          else
          {
            System.out.println("You Entered Command is Wrong");	 
            System.out.println("Please Enter the Correct Command");
            	}
      
          System.out.println("Press 'E' to exit or any other key to continue");
          c=in.next().charAt(0);
          if(c=='n')
        	  break;
          }
         
        
          
	}

}