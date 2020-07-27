// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// A+B - 5
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    while(true){
	        int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a==0 && b ==0)
		        break;
	        System.out.println(a+b);
	    }
	    

	}
}
