
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SurlyDB
{

	public static void main(String[] args) throws IOException {
		
		String filename = "../sample_test_file.txt";
		System.out.println("Hey");

		//FileReader fr = new FileReader("../sample_test_file.txt");
		BufferedReader br = new BufferedReader( new FileReader(filename) );
		while ( br.readLine() != null ) {
			System.out.println( br.readLine() );
			System.out.println( "\n" );
		}
	}
}