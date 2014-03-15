package graphAlgorithms;

public class Edge {
	
	private Vertex source, sink;
	private int weight_capacity;

	public Edge() {
		source = new Vertex();
		sink = new Vertex();
		weight_capacity = 0;
	}

	public Edge(Vertex source, Vertex sink, int weight_capacity) {
		this.source = source;
		this.sink = sink;
		this.weight_capacity = weight_capacity;
	}

	public Edge(String sourceName, String sinkName, int weight_capacity) {
		this.source = new Vertex(sourceName);
		this.sink = new Vertex(sinkName);
		this.weight_capacity = weight_capacity;
	}

	public Vertex getSource() {
		return source;
	}

	public Vertex getSink() {
		return sink;
	}

	public int getCapacityWeight() {
		return weight_capacity;
	}

	@Override
	public String toString() {
		return("(" + source.toString() + ") ---- " + String.valueOf(weight_capacity) + " ----> (" + sink.toString() + ")\n");
	}
	
}