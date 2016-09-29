
import java.util.LinkedList;
import java.util.ListIterator;

public class Database
{

	LinkedList<Relation> relations = new LinkedList<>();

	// public Database () 
	// {

	// }

	public void addRelation ( Relation relation )
	{
		relations.add(relation);
	}

	public Relation getRelation ( String name )
	{

		for ( Relation relation : relations ){
			if ( relation.name.equals( name ) )	{
				return relation;
			}
		}

		return null;
	}

	// public void insert ()
	// {

	// }

	// public boolean delete ()
	// {
	// 	return false;
	// }

}
