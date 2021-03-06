
import java.util.LinkedList;

public class Command
{

	static Database db = new Database();

	public static void executeRelation ( String relName, String relAttributes )
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
		//db.addRelation( new Relation( relName, attributes ) );
		//System.out.println(db.getRelation("COURSE"));
		//return new Relation( relName, attributes );
		db.addRelation( new Relation( relName, attributes ) );

	}

	public static void executeInsert ( String relName, String tuple )
	{
		// System.out.println("executeInsert");
		// System.out.printf("%s\t%s\n", relName, tuple);
	}

	public static void executePrint ( String relName, String values )
	{
		// System.out.println("executePrint");
		// System.out.printf("%s\t%s\n", relName, values);
	}

	public static void executeIndex ( String relName, String values )
	{
		// System.out.println("executeIndex");
		// System.out.printf("%s\t%s\n", relName, values);
	}

	public static void executeCatalog ( String relName, String values )
	{
		// System.out.println("executeCatalog");
		// System.out.printf("%s\t%s\n", relName, values);
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
