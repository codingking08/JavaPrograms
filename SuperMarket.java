package RealTimeProjects;		/////// DEVELOPER MOHAN RAJ

import java.util.Scanner;  								// Import the Scanner class

public class SuperMarket 
{
	
	  public static void main(String[] args)
	  {
		while(1==1)
		{
		System.out.println("WELCOME TO KINGS SUPERMARKET");
	    Scanner s1 = new Scanner(System.in);			// object creation
	    System.out.println("	");
	    System.out.println("S.No	Enter Product Id");
	    int a,b;
	    
	    a = s1.nextInt(); 								// s1 is object of scanner class
	    int total;
	    
	    switch(a)
	    {
	    case 1:
	    	 System.out.println("	Carrot");
	    	 System.out.println("	IN STOCK");
	    	 break;
	    case 2:
	    	 System.out.println("	Green Mango");
	    	 System.out.println("	IN STOCK");
	    	 break;
	    case 3:
	    	 System.out.println("	Garlic");
	    	 System.out.println("	IN STOCK");
	    	 break;
	    case 4:
	    	 System.out.println("	Ginger");
	    	 System.out.println("	OUT OF STOCK");
	    	 break;
	    case 5:
	    	 System.out.println("	Ground Nut");
	    	 System.out.println("	IN STOCK");
	    	 break;
	    case 6:
	    	 System.out.println("	KITKATE");
	    	 System.out.println("	IN STOCK");
	    	 break;
	    case 7:
	    	 System.out.println("	Bingo");
	    	 System.out.println("	IN STOCK");
	    	 break;
	    case 8:
	    	 System.out.println("	Good Day");
	    	 System.out.println("	OUT OF STOCK");
	    	 break;
	    case 9:
	    	 System.out.println("	Foge Perfume");
	    	 System.out.println("	IN STOCK");
	    	 break;
	    case 10:
	    	 System.out.println("	LifeBoy Soap");
	    	 System.out.println("	OUT OF STOCK");
	    	 break;
	    }
	   
	   
	    	System.out.println("	Enter Qty");
	 	    b = s1.nextInt(); 							// s1 is object of scanner class
	    
	 	    
	 	    if(a==1)
	 	    {
	 	    	total=20*b;				// doubling the grand total base on the quantity 'b'
	 	    	System.out.println("	Grand Total is = Rs"+total );
	 	    }
	 	   if(a==2)
	 	    {	total=30*b;
	 	    	System.out.println("	Grand Total is = Rs"+total);
	 	    }
	 	  if(a==3)
	 	    {	total=100*b;
	 	    	System.out.println("	Grand Total is = Rs"+total);
	 	    }
	 	 if(a==4)
	 	    {	total=150*b;
	 	    	System.out.println("	Grand Total is = Rs"+total);
	 	    }
	 	 if(a==5)
	 	    {	total=60*b;
	 	    	System.out.println("	Grand Total is = Rs"+total);
	 	    }
	 	 if(a==6)
	 	    {	total=10*b;
	 	    	System.out.println("	Grand Total is = Rs"+total);
	 	    }
	 	 if(a==7)
	 	    {	total=10*b;
	 	    	System.out.println("	Grand Total is = Rs"+total);
	 	    }
	 	 if(a==8)
	 	    {	total=20*b;
	 	    	System.out.println("	Grand Total is = Rs"+total);
	 	    }
	 	 if(a==9)
	 	    {	total=100*b;
	 	    	System.out.println("	Grand Total is = Rs"+total);
	 	    }
	 	 if(a==10)
	 	    {	total=40*b;
	 	    	System.out.println("	Grand Total is = Rs"+total);
	 	    }
	 	 	System.out.println("	");
	 	 	System.out.println("*********************************");
	 	 	System.out.println("	THANK YOU FOR VISITING");
	 		System.out.println("---------------------------------");
	 	
	 	 }
	    
	  }
}


//nextInt()	Integer
//nextFloat()	Float
//nextDouble()	Double
//nextLong()	Long
//nextShort()	Short
//next()	Single word
//nextLine()	Line of Strings
//nextBoolean()	Boolean
