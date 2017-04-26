import java.util.Scanner;

public abstract class Car {
	private String _brand;
	private String _owner;
	private int _year;
	private int _distance;
	
	Scanner read = new Scanner (System.in);
	
	protected Car(String brand,String owner,int year, int distance)
	{
		this._owner = owner;
		this._brand = brand;
		this._year = year;
		this._distance = distance;
	}
	protected Car()
	{
		
	}
	
	protected void SetYear(int year)
	{
		this._year = year;
	}
	protected int GetYear()
	{
		return _year;
	}
	
	protected void SetDist(int distance)
	{
		this._distance = distance;
	}
	protected int GetDist()
	{
		return _distance;
	}
	
	protected void SetOwner(String owner)
	{
		this._owner = owner;
	}
	protected String GetOwner()
	{
		return _owner;
	}

	protected void SetBrand(String brand)
	{
		this._brand = brand;
	}
	protected String GetBrand()
	{
		return _brand;
	}
	
	abstract void PrintDetails();
	
	protected void CreateCar()
	{
		this._brand = read.nextLine();
		this._owner = read.nextLine();
		this._year = read.nextInt();
		this._distance = read.nextInt();
		read.nextLine();
	}
	
	protected void PrintStats(){
	System.out.println("Marka:"+_brand+"\nW³aœciciel:"+_owner+"\nRok:"+_year+"\nPrzebieg:"+_distance+"\n");
	}
}
