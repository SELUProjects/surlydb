
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SurlyDB
{

	public static void main( String[] args )
	{
		
		String filename = "../sample_test_file.txt";

		try 
		{
			BufferedReader br = new BufferedReader( new FileReader( filename ) );
			String line;
			while ( (line = br.readLine()) != null ) {
				Parser parser = new Parser(line);
				parser.parse();
			}
			br.close();
		}
		catch ( IOException e ) 
		{
			System.out.println( e );
		}

		Database myDb = new Database();
		System.out.println( myDb.getRelation( "COURSE" ) );
	}
}
