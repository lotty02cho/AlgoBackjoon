// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// A+B - 3
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int count = sc.nextInt();
	    for(int i = 0; i < count ; i++){
	        int a = sc.nextInt();
		    int b = sc.nextInt();
	        System.out.println(a+b);
	    }

	}
}
