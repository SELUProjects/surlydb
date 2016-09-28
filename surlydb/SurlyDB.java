
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SurlyDB
{

	public static void main( String[] args )
	{
		
		String filename = "../sample_test_file.txt";
		
		System.out.println( "\n" );
		System.out.println( "Hey" );

		try 
		{
			BufferedReader br = new BufferedReader( new FileReader( filename ) );
			String line;
			while ( (line = br.readLine()) != null ) {
				System.out.println( line );
			}
			br.close();
		}
		catch ( IOException e ) 
		{
			System.out.println( e );
		}
	}
}