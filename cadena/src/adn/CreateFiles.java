package adn;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class CreateFiles {
	
	public static void main(String[]args)
	{
		CreateFiles cf = new CreateFiles();
	}
	public CreateFiles()
	{
		//Secuencias.umd
		//EnteroAleatorio, EnteroAleatorio(Mayor), CadenaCaracteresAleatoria(ACGT)1000 lineas	
		int start , length;
		String sequence;
		Random rd = new Random();
		try
		{
			BufferedWriter bw = new BufferedWriter( new FileWriter( "secuencias.umd" ));				
			for (int i = 0; i <= 1000; i++)
			{
				start  = Math.abs(rd.nextInt());
				length = 5 +  rd.nextInt(25);
				sequence = "";
				for (int j = 0; j < length; j++)
				{
					switch(rd.nextInt(4))
					{
						case 0:
							sequence += "A";break;
						case 1:
							sequence += "C";break;
						case 2:
							sequence += "G";break;
						case 3:
							sequence += "T";break;
					}	
				}			
				bw.write(start + "," + (start + length) + "," + sequence + "\n");
			}
			bw.flush();		
		}
		catch (IOException e)
		{
			e.printStackTrace();		
		}
	}
}