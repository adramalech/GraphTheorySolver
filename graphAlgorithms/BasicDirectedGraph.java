package graphAlgorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections15.Factory;
import org.apache.commons.collections15.Transformer;
import edu.uci.ics.jung.algorithms.flows.EdmondsKarpMaxFlow;
import edu.uci.ics.jung.algorithms.shortestpath.DijkstraShortestPath;
import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;

public class BasicDirectedGraph {

	public DirectedSparseMultigraph<String, Edge> dsmg;
	private Vertex[] vertices;
	private Vertex s_node, t_node;
	private Edge[] edges;
	
	public BasicDirectedGraph(Vertex[] vertices, Edge[] edges, Vertex s_node, Vertex t_node) {
		this.vertices = vertices;
		this.edges = edges;
		this.s_node = s_node;
		this.t_node = t_node;
	}
	
	public void constructDirectedGraph() {
		dsmg = new DirectedSparseMultigraph<String,Edge>();
				
		for(int index = 0; index < vertices.length; index++)
			dsmg.addVertex(vertices[index].toString());
		
		for(int index = 0; index < edges.length; index++)
			dsmg.addEdge(edges[index], edges[index].getSource().toString(), edges[index].getSink().toString());
		
		System.out.println(dsmg.toString());
		
		new InterativeGraph(dsmg, "Initial Graph:");
	}
	
	public void unWeightedShortestPath() {
		DijkstraShortestPath<String, Edge> dijkstra_graph = new DijkstraShortestPath<String, Edge>(dsmg);
		List<Edge> shortest_path = dijkstra_graph.getPath(s_node.toString(), t_node.toString());//(s_node, t_node);
        System.out.println("The shortest unweighted path from s = " + s_node.toString() + " to t = " + t_node.toString() + " is:");
        System.out.println(shortest_path.toString());
	}
	
	public void weightedShortestPath() {
		Transformer<Edge, Integer> weightedTransformer = new Transformer<Edge, Integer>() {
            public Integer transform(Edge edge) {
                return edge.getCapacityWeight();
            }
        };
        
        DijkstraShortestPath<String, Edge> dijkstra_graph = new DijkstraShortestPath<String, Edge>(dsmg, weightedTransformer);
        List<Edge> shortest_path = dijkstra_graph.getPath(s_node.toString(), t_node.toString());
        Number distance = dijkstra_graph.getDistance(s_node.toString(), t_node.toString());
        System.out.println("The shortest weighted path from s = " + s_node.toString() + " to t = " + t_node.toString() + " is:");
        
      	System.out.println(shortest_path.toString());
        System.out.println("\nThe length of the path is: " + String.valueOf(distance));
        
        DirectedSparseMultigraph<String,Edge> dsmg = new DirectedSparseMultigraph<String, Edge>();
        
        for(int i = 0; i < shortest_path.size(); i++)
        	dsmg.addEdge(shortest_path.get(i), shortest_path.get(i).getSource().toString(), shortest_path.get(i).getSink().toString());
        
        InterativeGraph ig = new InterativeGraph(dsmg, "Dijkstra Shortest Path Result:" );
	}
	
	public void calcMaxFlow() {
		Transformer<Edge, Integer> capacityTransformer = new Transformer<Edge, Integer>(){
			public Integer transform(Edge edge)  {
				return edge.getCapacityWeight();
	    	}
	    };
	    
	    Map<Edge, Integer> edgeFlowMap = new HashMap<Edge, Integer>();
	    
	    
	    Factory<Edge> edgeFactory = new Factory<Edge>() {
	    	@Override
	        public Edge create() {
	            return new Edge(new Vertex(), new Vertex(), 1);
	        }
	    };
	    	    
	    EdmondsKarpMaxFlow<String, Edge> edmondsKarp_graph = new EdmondsKarpMaxFlow(dsmg, s_node.toString(), t_node.toString(), capacityTransformer, edgeFlowMap, edgeFactory);    
	    edmondsKarp_graph.evaluate(); 
	    System.out.println("The max flow is: " + edmondsKarp_graph.getMaxFlow());
	    DirectedSparseMultigraph<String, Edge> dsmg = (DirectedSparseMultigraph<String,Edge>) edmondsKarp_graph.getFlowGraph();	    
	    
	    System.out.println("The max flow graph is: " + dsmg.toString());
	    System.out.println("The min cut is: " + edmondsKarp_graph.getMinCutEdges().toString());
	    System.out.println("On the source partition: " + edmondsKarp_graph.getNodesInSourcePartition().toString());
	    System.out.println("On the sink partition: " + edmondsKarp_graph.getNodesInSinkPartition().toString());
	    new InterativeGraph(dsmg, "Max Flow Result:");
	}

}