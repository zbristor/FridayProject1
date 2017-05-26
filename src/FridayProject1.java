import java.util.Scanner;
public class FridayProject1 {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a customer number, first name, last name, sales amount, and the tax code: ");
	String custNum = keyboard.next();
	String firstName = keyboard.next();
	String lastName = keyboard.next();
	double sales = keyboard.nextDouble();
	String taxCode = keyboard.next();
	double taxRate = 0.0;
	double total = 0.0;
	if (taxCode.equals("NRM"))
			taxRate = .06;
	else if (taxCode.equals("BIZ"))
			taxRate = .045;
	total = (sales*taxRate)+sales;
	System.out.println("Customer ID: "+custNum+"\n"+"Customer Name: "+ firstName+" "+lastName
						+"\n"+"Sales Amount: "+sales+"\n"+"Tax Code: "+taxCode+"\n"+"Total Amount Due: "+total);
	System.out.println("Do you want to enter another record? (Y/N) ");
	String cont = keyboard.next();
	while (cont.equals("Y"))
	{
		System.out.println("Enter a customer number, first name, last name, sales amount, and the tax code: ");
		custNum = keyboard.next();
		firstName = keyboard.next();
		lastName = keyboard.next();
		sales = keyboard.nextDouble();
		taxCode = keyboard.next();
		taxRate = 0.0;
		total = 0.0;
		if (taxCode.equals("NRM"))
				taxRate = .06;
		else if (taxCode.equals("BIZ"))
				taxRate = .045;
		total = (sales*taxRate)+sales;
		System.out.println("Customer ID: "+custNum+"\n"+"Customer Name: "+firstName+" "+lastName
							+"Sales Amount: "+sales+"\n"+"Tax Code: "+taxCode+"\n"+"Total Amount Due: "+total);
		System.out.println("Do you want to enter another record? (Y/N) ");
		cont = keyboard.next();
		if (cont.equals("N"))
			break;
	}
}
}
