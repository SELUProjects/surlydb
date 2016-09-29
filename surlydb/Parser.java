
public class Parser
{

	Database db = new Database();
	String cmdString;

	public Parser ( String cmdString )
	{
		this.cmdString = cmdString;
	}

	public void parse ()
	{

		String[] subString = cmdString.split(" ", 3);

		switch ( subString[0] )
		{
			case "RELATION":
				db.addRelation( Command.executeRelation( subString[1], subString[2] ) );
				break;
			case "INSERT":
				Command.executeInsert( subString[1], subString[2] );
				break;
			case "PRINT":
				Command.executePrint( subString[1], subString[2] );
				break;
			case "INDEX":
				Command.executeIndex( subString[1], subString[2] );
				break;
			case "CATALOG":
				Command.executeCatalog( subString[1], subString[2] );
				break;
			case "/*":
				System.out.println( "just a comment" );
				break;
			default:
				System.out.println( "What you talkin' about Willis?" );
				break;

		}
	}
	
}
