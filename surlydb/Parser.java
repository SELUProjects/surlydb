
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Parser
{

	Database db = new Database();
	String cmdString;

	public Parser ( String filename )
	{
		readFile( filename );
	}

	public void parse ( String cmdString )
	{

		String[] subString = cmdString.split(" ", 3);

		switch ( subString[0] )
		{
			case "RELATION":
				executeRelation( subString[1], subString[2] );
				break;
			case "INSERT":
				executeInsert( subString[1], subString[2] );
				break;
			case "PRINT":
				String[] printStr = cmdString.split(" ", 2);
				executePrint( printStr[1] );
				break;
			case "/*":
				break;
			default:
				System.out.println( "What you talkin' about Willis?" );
				break;

		}
	}

	public void readFile( String filename )
	{
		try 
		{
			BufferedReader br = new BufferedReader( new FileReader( filename ) );
			String cmdString;
			while ( ( cmdString = br.readLine() ) != null ) {
				parse( cmdString );
			}
			br.close();
		}
		catch ( IOException e ) 
		{
			System.out.println( e );
		}
	}

	public void executeRelation ( String relName, String relAttributes )
	{

		LinkedList<Attribute> attributes = new LinkedList<>();
		String[] attrArray = removeChar( relAttributes, "();" ).split( ", " );
		for ( String s : attrArray )
		{
			String[] attr = s.split( " " );

			String name	= attr[0];
			String dataType = attr[1];
			int length = Integer.parseInt( attr[2] );

			attributes.add( new Attribute( name, dataType, length ) );
		}

		db.addRelation( new Relation( relName, attributes ) );
		System.out.printf( "Relation '%s' added\n", relName.toUpperCase() );

	}

	public void executeInsert ( String relName, String tuple )
	{
		String[] values = tuple.split(" ");
		LinkedList<String> valList = new LinkedList<>();
		for ( String val : values )
		{
			valList.add( val );
		}

		Relation relation = db.getRelation( relName );
		relation.addValues( new Tuple( valList ) );
		// System.out.println("executeInsert");
		System.out.printf( "Inserted row into '%s'\n", relName.toUpperCase() );
	}

	public void executePrint ( String relToPrint )
	{
		relToPrint = removeChar( relToPrint, ";");
		String[] relList = relToPrint.split(", ");
		for ( String relName : relList )
		{
			System.out.printf( "Printing: %s\n", relName );
			db.printRelation( relName );
		}
		
	}

	private static String removeChar ( String s, String charStr )
	{
		char[] cArray = charStr.toCharArray();
		for ( char c : cArray )
		{
			s = s.replace( ""+c, "" );
		}
		return s;
	}
	
}
