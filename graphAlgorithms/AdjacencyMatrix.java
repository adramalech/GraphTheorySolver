package graphAlgorithms;

public class AdjacencyMatrix {
	
	private static Vertex[] vertices;
	private int[][] next_matrix;
	private Edge[] edges;
	private int[][] weight_matrix;

	public AdjacencyMatrix(Vertex[] vertices, Edge[] edges) {
		this.vertices = vertices;
		this.edges = edges;
		weight_matrix = initializeWeightMatrix(vertices.length+1);
		next_matrix = initializeNextMatrix(vertices.length+1);
	}

	public int[][] initializeWeightMatrix(int bound) {
		int [][] matrix = new int[bound][bound];

		for(int i = 1; i < bound; i++) {
			for(int z = 1; z < bound; i++)
				matrix[i][z] = (i == z)? Integer.MAX_VALUE : 0; //Integer.Max_Value = 2^31 - 1 == +INFINITY.
		}

		return matrix;
	}

	public int[][] initializeNextMatrix(int bound) {
		int[][] matrix = new int[bound][bound];

		int[][] weight_matrix = getWeightMatrix();

		for(int i = 1; i < bound; i++) {
			for(int z = 1; z < bound; i++)
				matrix[i][z] = ((i != z) && (weight_matrix[i][z] < Integer.MAX_VALUE))? i : 0; 
		}

		return matrix;	
	}

	public void updateWeightMatrix(Edge[] edges) {
		int size = edges.length;
		int source;
		int destination;

		for(int i = 0; i < size; i++) {
			source =  find(edges[i].getSource(), vertices);
			destination =  find(edges[i].getSink(), vertices);
			weight_matrix[source][destination] = edges[i].getCapacityWeight();
		}

	}
	
	private int find(Vertex vertex, Vertex[] vertices) {
		int position = 0;
		
		for(int index = 0; index < vertices.length; index++) {
			if(vertex.toString().equals(vertices[index].toString())) {
				position = index;
				break;
			}
		}
		
		return position;
	}

	public int[][] getWeightMatrix() {
		return weight_matrix;
	}

	public Vertex[] getVertices() {
		return vertices;
	}

	public int[][] getNextMatrix() {
		return next_matrix;
	}

	@Override
	public String toString() {
		String output = "Adjacency Matrix:\n";
		Vertex[] vertices = getVertices();
		int size = vertices.length+1;

		output.concat("Vertex ");

		for(int index = 1; index < size; index++) 
			output.concat(vertices[index].toString() + " ");

		output.concat("\n");

		for(int index = 1; index < size; index++) {
			output.concat(vertices[index].toString() + " ");

			for(int i = 1; i < size; i++) {
				for(int j = 1; j < size; j++) 
					output.concat(String.valueOf(weight_matrix[i][j]) + " ");
			}	
			output.concat("\n");
		}

		return output;
	}

}