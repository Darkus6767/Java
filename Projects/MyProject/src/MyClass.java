import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args){
		
	boolean CarChoice = false;
	boolean IsCorrect = false;
	String choice = "";
	Scanner read = new Scanner(System.in);
	SportCar Car = new SportCar();
	Write wr = new Write();
	System.out.println("Czy chcesz stworzy� samoch�d: T - tak / N - nie");
	
	while(!IsCorrect){
	choice = read.next().toUpperCase();
	if(choice.equals("T")||choice.equals("N")) IsCorrect = true;
	else
	System.out.println("B��d - Powt�rz - Czy chcesz stworzy� samoch�d: T - tak / N - nie");
	}
	
	if(choice.equals("T"))
	{
		while(!(choice.equals("N")))
	{
			System.out.println("Kolejno��: Marka, w�a�ciciel, rok, przebieg");
			Car.CreateCar();
			wr.WriteFiler(Car);
			CarChoice = true;
			
			System.out.println("Chcesz utworzy� kolejny pojazd ?");
			choice = read.next().toUpperCase();
		
		}
	}
	
	else
	{
		System.out.println("�egnam"); 
	}

	if(CarChoice)
		{
		Car.PrintDetails();
		}
	}
}