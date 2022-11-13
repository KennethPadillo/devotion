
import java.util.Scanner;
public class Main {
/**
*Name: PADILLO
*Section: BSINTECH Devotion
*Year: 4th Year
*/ 	

	public static void main(String[] args) {
		Scanner myInput=new Scanner(System.in);
		int Grade=1;
		int total=0;
		int rep=0;
		
		while(Grade==1){
		    System.out.print("Please Enter all the Grades subject:");
		    int grade=myInput.nextInt();
		    
		    total+=grade;
		    rep+=Grade;
		    
		    System.out.println("Do you want to enter another grade?\n[1]YES   [2]NO:");
		    Grade=myInput.nextInt();
		    
		}
		total=total/rep;
		System.out.print("Total AVERAGE of your in this 2nd Semester:" + total);

		    
    }	
}