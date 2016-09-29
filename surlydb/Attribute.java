
public class Attribute
{
	String name;
	String dataType;

	public Attribute( String name, String dataType )
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

	}
}
