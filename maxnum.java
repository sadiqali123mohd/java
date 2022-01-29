import java.util.Scanner;
public class maxnum {
	public static void main(String[] args) {
		System.out.println("Please Enter 3 Numbers : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();   
       
        if(a>=b && a>=c)  
        System.out.println(a+" is the largest Number");  
      
        else if (b>=a && b>=c)  
        System.out.println(b+" is the largest Number");  
        else  
         
        System.out.println(c+" is the largest number");  
        }  

	}
 
