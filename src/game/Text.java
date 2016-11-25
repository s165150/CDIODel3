package game;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Text 
{
	private String path;
	
	public Text(String filePath)
	{
		path = filePath;
	}

	
	/**
	 * Opens a text file, reads it line by line and saves each line into a seperate position in an array.
	 * @return The array of lines in the txt.file
	 * @throws IOException
	 */
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
	
	/**
	 * Counts all the lines in a file and returns the number of lines in the file as an integer.
	 * @return The number of lines in the designated file (integer9
	 * @throws IOException
	 */
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
