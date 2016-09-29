
import java.util.LinkedList;
import java.util.ListIterator;

public class Database
{

	LinkedList<Relation> relations = new LinkedList<>();

	public void addRelation ( Relation relation )
	{
		relations.add(relation);
	}

	public Relation getRelation ( String relName )
	{

		for ( Relation relation : relations ){
			if ( relation.name.equals( relName ) )	{
				return relation;
			}
		}

		return null;
	}

}
