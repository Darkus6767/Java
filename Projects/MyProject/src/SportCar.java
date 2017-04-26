import java.util.ArrayList;


public class SportCar extends Car {

	public ArrayList <SportCar> Scar = new ArrayList();
	public SportCar(String brand,String owner,int year, int distance)
	{
		super(brand,owner,year,distance);
		
	}
	public SportCar(){
	
	}
	public void CreateCar()
	{
		super.CreateCar();
		this.Scar.add(new SportCar(GetBrand(),GetOwner(),GetYear(),GetDist()));
	}
	private void GetStats()
	{
		super.PrintStats();
	}
	public void PrintDetails()
	{
		for(SportCar car:Scar)
		{
			car.GetStats();
		}
	}
		
}
	
