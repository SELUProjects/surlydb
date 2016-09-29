
public class Attribute
{
	String name;
	String dataType;
	int length;

	public Attribute( String name, String dataType, int length )
	{
		this.name = name;
		String inputType = dataType.toLowerCase();

		if ( inputType.equals("int") ) {
			this.dataType = "int";
		}

		if ( inputType.equals("num") ) {
			this.dataType = "num";
		}

		if ( inputType.equals("float") ) {
			this.dataType = "float";
		}

		if ( inputType.equals("char") ) {
			this.dataType = "char";
		}

		if ( inputType.equals("string") ) {
			this.dataType = "string";
		}

		this.length = length;

	}
}
