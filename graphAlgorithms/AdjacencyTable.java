package graphAlgorithms;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class AdjacencyTable {

	private Hashtable<Vertex, Vertex[]> table;

	public AdjacencyTable() {
		table = new Hashtable<Vertex, Vertex[]>();
	}

	public AdjacencyTable(int numVertices) {
		table = new Hashtable<Vertex, Vertex[]>(numVertices);
	}

	public void appendVerticesToVertex(Vertex vertex, Vertex... destinations) {
		table.put(vertex, destinations);
		
	}

	public Vertex[] getLabels() {
		return (Vertex[])table.keySet().toArray();
	}
	
	public int getSize() {
		return table.size();
	}

	public Vertex[] getAdjacencies(Vertex vertex) {
		return table.get(vertex);
	}

	public Enumeration<Vertex> getKeys() {
		return table.keys();
	}
	
	public boolean contains(Vertex vertex) {
		return table.contains(vertex);
	}

	@Override
	public String toString() {
		Iterator<Entry<Vertex, Vertex[]>> iterator = table.entrySet().iterator();
		Entry<Vertex, Vertex[]> tmp;
		Vertex[] v_array;
		String output = "\nAdjacencyTable:\nVertex\t\tAdjacent To\n";
		
		while(iterator.hasNext()) {
			tmp = iterator.next();
			output.concat(tmp.getKey().toString() + "\t\t");
			v_array = tmp.getValue();
			
			for(int index = 0; index < v_array.length; index++)
				output.concat(v_array[index].toString() + " ");
		}
	
		output.concat("\n");
		return output;
	}

}