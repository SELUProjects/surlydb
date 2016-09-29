
import java.util.LinkedList;

public class Relation
{
	
	LinkedList<Attribute> attributes;
	LinkedList<Tuple> values;
	String name;

	public Relation ( String name, LinkedList<Attribute> attributes ) 
	{
		
		this.name = name;
		this.attributes = attributes;
		this.values = new LinkedList<>();
	}

	public void addValues ( Tuple tuple )
	{
		values.add(tuple);
	}

	public void printRelation () 
	{

	}
}
