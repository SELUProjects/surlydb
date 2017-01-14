
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

	public int findRelation(String name)
    {
        int index = -1;

        for(int i = 0 ; i < relations.size(); ++i)
        {
            if (name.equals(relations.get(i).name))
            {
                index = i;
            }
        }
        return index;
    }

	public void printRelation( String name )
	{
		int index = findRelation(name);
        if (index == -1)
        {
            System.out.println("Relation not found: " + name);
        }
        else
        {
            relations.get(index).printRelation();
        }
	}

}
