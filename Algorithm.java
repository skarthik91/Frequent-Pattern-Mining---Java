import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Algorithm {
	public ArrayList<Dimensions> table = new ArrayList<Dimensions>();
	public void Read_file()
	{
		String fileName="input.txt";
		String line = null;
		try {
            FileReader fileReader = new FileReader(fileName);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            
            while((line = bufferedReader.readLine()) != null) {
               
               String[] tokens = line.split(",");
               
               Dimensions temp = new Dimensions(tokens.length);
               temp.setDimensions(tokens);
               table.add(temp);
               
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
	}
	
	public void print_table()
	{
		for(int i = 0;i<table.size();i++)
		{
			Dimensions temp = table.get(i);
			temp.print_dim();
		}
	}
	
}
