import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
public class Write {
	
	public void WriteFiler(SportCar a){
		String brand;
		FileWriter fw = null;
		//PrintWriter zapis = new PrintWriter("ala.txt");
		ArrayList <SportCar> Scar1 = new ArrayList();
		Scar1 = a.Scar;
		try {
			fw = new FileWriter("plik.txt"); 
		}catch(IOException e){
			e.printStackTrace();
		}
			
		 BufferedWriter bw = new BufferedWriter(fw);
		 try {
			 for(SportCar car:Scar1)
				{
					brand = car.GetBrand();
					bw.write(brand);
			         bw.newLine();
				}	
		     } catch (IOException e) {
		        e.printStackTrace();
		     }

		     try {
		        bw.close();
		        fw.close();
		     } catch (IOException e) {
		           e.printStackTrace();
		     }

	}
}
