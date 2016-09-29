
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser
{

	// String[] command = {"RELATION", "INSERT", "PRINT", "INDEX", "CATALOG"};
	List<String> commands = Arrays.asList("RELATION", "INSERT", "PRINT", "INDEX", "CATALOG");
	String cmdString;

	public Parser ( String cmdString )
	{
		this.cmdString = cmdString;
	}

	public void parse ()
	{
		String[] subString = cmdString.split(" ");

		// System.out.printf( "\n%s \n", subString[0] );

		// for ( int i=0; i<subString.length; i++ )
		// {
		// 	System.out.printf( "%d %s ", i, subString[i] );
		// }

		switch ( subString[0] )
		{
			case "RELATION":
				System.out.println( "Relation" );
				break;
			case "INSERT":
				System.out.println( "Insert" );
				break;
			case "PRINT":
				System.out.println( "Print" );
				break;
			case "INDEX":
				System.out.println( "Index" );
				break;
			case "CATALOG":
				System.out.println( "Catalog" );
				break;
			default:
				System.out.println( "What you talkin' about Willis?" );
				break;
				
		}
	}

}