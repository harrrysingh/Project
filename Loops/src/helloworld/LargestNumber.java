package helloworld;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double n1 = -6.5, n2 = 8.9, n3 = 9.5;

	        if( n1 >= n2 && n1 >= n3)
	            System.out.println(n1 + " is the largest number.");

	        else if (n2 >= n1 && n2 >= n3)
	            System.out.println(n2 + " is the largest number.");

	        else
	            System.out.println(n3 + " is the largest number.");
	}

}
