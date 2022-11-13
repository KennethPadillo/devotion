package JapanSariFood;
import java.util.Scanner;

public class Main{

  public static void main(String[]args) {
/**
*Name: PADILLO
*Section: BSINTECH Devotion
*Year: 4th Year
*/ 


  Scanner console = new Scanner(System.in);
  
  
  String orderCart = "Your orders are the following: \n";
  int respondToOrder, orderCategory;
  float totalPayment = 0, customerCash;
  
  System.out.println("|               WELCOME TO Japan SariFood        |");
  System.out.println("| DO YOU WANT TO ORDER? [1-YES, 2-NO]            |");
  System.out.println("| Enter the number for your choice below         |");
  System.out.println("==================================================");
  System.out.print  ("Choice:");
  respondToOrder = console.nextInt(); 
  
		 
  do {

  if (respondToOrder == 1) {
  
	  System.out.println("|               WELCOME TO Japan SariFood        |");
	  System.out.println("|WHAT TO ORDER? [1-FOOD, 2 - BEVERAGES , 3-SNACKS|");
	  System.out.println("| Enter the number for your choice below         |");
	  System.out.println("==================================================");
	  System.out.print  ("Choice:");
	  orderCategory = console.nextInt();
	  
	  if(orderCategory == 1) {
	    System.out.println("|               WELCOME TO Japan SariFood         |");
	    System.out.println("|                 ORDER YOUR FOOD                 |");
	    System.out.println("| [1] Curry with rice 	                :P150.00  |");
	    System.out.println("| [2] Ramen with Regular/Spicy flavor   :P175.00  |");
	    System.out.println("| [3] Takoyaki                          :P125.00  |");
	    System.out.println("| Enter the number for your choice below          |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    float curry = 150 , ramen = 175, takoyaki = 125;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Curry with rice : P150.00 added to cart");
		  totalPayment+=curry;
		  String order1 = "Curry with rice : P150.00 \n";
		  orderCart+=order1;
		  
		break;
		
		case 2: 
		  System.out.println("Ramen with Regular/Spicy flavor   : P175.00  added to cart");
		  totalPayment+=ramen;
		  String order2 = "Ramen with Regular/Spicy flavor         : P175.00  \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Takoyaki       : P125.00 added to cart");
		  totalPayment+=takoyaki;
		  String order3 = "Takoyaki      : P125.00 \n";
		  orderCart+=order3;
		  
		break;
		
		
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    

	  } else if(orderCategory == 2) {
	    System.out.println("|               WELCOME TO Japan SariFood         |");
	    System.out.println("|		ORDER BEVERAGE			  |");
	    System.out.println("| [1] Melon Soda 		     : P30.00     |");
	    System.out.println("| [2] Canned coffee		     : P45.00     |");
	    System.out.println("| [3] Strong Zero Alcohol 	     : P60.00     |");
	    System.out.println("| [4] San Miguel 	    	     : P75.00     |");
	    System.out.println("| Enter the number for your choice below          |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float melonSoda = 30 , cannedCoffee = 45, strongZero = 60, sanMiguel = 75;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("1-Melon Soda : P30.00 added to cart");
		  totalPayment+=melonSoda;
		  String order1 = "1-Melon Soda : P30.00 \n";
		  orderCart+=order1;
		  
		  
		  
		  
		break;
		
		case 2: 
		  System.out.println("1-Canned Coffee : P45.00 added to cart");
		  totalPayment+=cannedCoffee;
		  String order2 = "1-Canned Coffee : P45.00 \n";
		  orderCart+=order2;
		  
		  
		  
		break;
		
		case 3: 
		  System.out.println("Strong Zero Alcohol : P60.00  added to cart");
		  totalPayment+=strongZero;
		  String order3 = "Strong Zero Alcohol: P60.00 \n";
		  orderCart+=order3;
		  
		  
		break;
	      
	      

	       case 4: 
		  System.out.println("San Miguel : P75.00  added to cart");
		  totalPayment+=sanMiguel;
		  String order4 = "San Miguel : P75.00 \n";
		  orderCart+=order4;
		  
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
	       break;  
	      
	      
	      }
	    
	    
	    }
	    
	    else if(orderCategory == 3) {
	    
	    System.out.println("|               WELCOME TO Japan SariFood        |");
	    System.out.println("|		ORDER SNACKS			 |");
	    System.out.println("| [1] Himemaru Rice Cracker         : P15.00     |");
	    System.out.println("| [2] Wasabi Beef Chips             : P24.00     |");
	    System.out.println("| [3] Seaweed Salt Chips	    : P20.00     |");
	    System.out.println("| [4] Jagabe Potate Snack 	    : P35.00     |");
	    System.out.println("| Enter the number for your choice below         |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float himemaruRice = 15 , wasabiBeef = 24, seaweedSalt = 20, jagabePotato = 45;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Himemaru Rice Cracker       : P15.00 added to cart");
		  totalPayment+=himemaruRice;
		  String order1 = "Himemaru Rice Cracker       : P15.00 \n";
		  orderCart+=order1;
		break;
		
		case 2: 
		  System.out.println("Wasabi Beef Chips            : P24.00 added to cart");
		  totalPayment+=wasabiBeef;
		  String order2 = "Wasabi Beef Chips            : P24.00 \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Seaweed Salt Chips     : P20.00  added to cart");
		  totalPayment+=seaweedSalt;
		   String order3 = "Seaweed Salt Chips     : P20.00 \n";
		   orderCart+=order3;
		  
		  
		break;

		
		case 4: 
		  System.out.println("Jagabe Potato Snack     : P35.00  added to cart");
		  totalPayment+=jagabePotato;
		   String order4 = "Jagabe Potato Snack     : P35.00 \n";
		   orderCart+=order4;
		  
		
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    
	    }
   }
   
   else {
   
   System.out.println("Thank you for purchasing and have a nice day! ;)");
   System.exit(0);
   
   
   }
   
   
   
   
   System.out.println("Do you want Order again?");
   System.out.println("[1] - Yes");
   System.out.println("[2] - No");
   respondToOrder = console.nextInt();

   
    
  } while(respondToOrder == 1);
  
    System.out.println("Amount to pay: "+totalPayment);
    System.out.print("Enter cash payment: ");
    customerCash = console.nextFloat();
  
    System.out.println("==========T O T A L ========");
    System.out.println(orderCart);
     System.out.printf("TOTAL: %.2f\n",totalPayment);
    System.out.println("Change: " + (customerCash - totalPayment));
    System.out.println("================================");
     System.out.println("Thank you for purchasing and have a nice day! ");
  
  
  
  
  

  }


}
