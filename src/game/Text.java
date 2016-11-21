package game;
import java.io.IOException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Text 
{
	private String path;
	
	public Text(String filePath)
	{
		path = filePath;
	}
	
	public String[] OpenFile() throws IOException
	{
		FileReader fileReader = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fileReader);
		
		int numberOfLines = readLines();
		
		String[] textList = new String[numberOfLines];
		
		for(int i = 0 ; i < numberOfLines ; i++)
		{
			textList[i] = textReader.readLine();
		}
		textReader.close();
		
		return textList;
	}
	
	public int readLines() throws IOException
	{
		FileReader file_to_read = new FileReader(path);
		BufferedReader bReader = new BufferedReader(file_to_read);
		
		int numberOfLines = 0;
		
		while((bReader.readLine()) != null)
		{
			numberOfLines++;
		}
		bReader.close();
		
		return numberOfLines;
	}
}
