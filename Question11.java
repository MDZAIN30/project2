package assignment2;

import java.util.Scanner;

public class Question11 {

	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter three numbers: ");
	    int a = s.nextInt();
	    int b = s.nextInt();
	    int c = s.nextInt();

	    int smaller = a;

	    if (b < smaller)
	    {
	      smaller = b;
	    }

	    if (c > smaller)
	    {
	      smaller = c;
	    }

	    System.out.println("The smaller number is: " + smaller);
	  }
	}


