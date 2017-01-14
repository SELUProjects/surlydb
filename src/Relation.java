
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

	public void printRelation()
    {
    	
        int columnWidths[] = new int[attributes.size()];
        int tableWidth = 0;
        for (int i = 0; i < attributes.size(); i++)
        {
            Attribute attr = attributes.get(i);
            int nameLength = attr.name.length();
            int attrLength = attr.length;
            columnWidths[i] = (nameLength > attrLength) ? nameLength : attrLength;
            tableWidth += columnWidths[i];
        }
        tableWidth += attributes.size() + 1;

        for (int i = 0; i < tableWidth; i++)
        {
            System.out.print("-");
        }
        System.out.println();

        System.out.printf("|%" + (tableWidth - 2) + "s|\n", name);

        for (int i = 0; i < tableWidth; i++)
        {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < attributes.size(); i++)
        {
            System.out.printf("|%" + columnWidths[i] + "s", attributes.get(i).name);
        }
        System.out.println("|");

        for (int i = 0; i < tableWidth; i++)
        {
            System.out.print("-");
        }
        System.out.println();

        if (values.isEmpty())
        {
            return;
        }

        for (Tuple value : values)
        {
            for (int i = 0; i < attributes.size(); i++)
            {
                System.out.printf("|%" + columnWidths[i] + "s", value.values.get(i));
            }
            System.out.println("|");
        }

        for (int i = 0; i < tableWidth; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
}
