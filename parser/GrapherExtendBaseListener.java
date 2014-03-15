package parser;

import java.util.ArrayList;

import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import graphAlgorithms.Edge;
import graphAlgorithms.Vertex;
import graphAlgorithms.BasicDirectedGraph;

public class GrapherExtendBaseListener extends GrapherBaseListener {
	
	private GrapherParser gparser;	
	public boolean edmonds_flag, dijsktra_flag;
	public String graph_type;
	public Vertex source, sink, s_node, t_node;
	public int weight, capacity;
	public ArrayList<Edge> edges;
	public ArrayList<Vertex> vertices;
	public Edge edge;
	
	public DirectedSparseMultigraph<Vertex, Edge> dsmg;
	
	public GrapherExtendBaseListener(GrapherParser gparser) {
		this.gparser = gparser;
	}

	@Override 
	public void enterGraph_type(GrapherParser.Graph_typeContext ctx) { 		
		graph_type = ctx.getText();
		
		if(graph_type.equals("edmonds_karp")) {
			edmonds_flag = true;
			dijsktra_flag = false;
		}
		else if(graph_type.equals("dijkstra")) {
			dijsktra_flag = true;
			edmonds_flag = false;
		}
		else {
			System.err.println("GRAPH ERROR:  Unrecognizable graph type!\n");
			System.exit(1);
		}
	}

	@Override 
	public void enterWeight(GrapherParser.WeightContext ctx) { 
		weight = Integer.valueOf(ctx.INT().getText());
		
		if(weight < 0) {
			System.err.println("WEIGHT ERROR:  Cannot have negative weights in a dijkstra graph!\n");
			System.exit(1);
		}
	}
	
	@Override 
	public void exitEdge(GrapherParser.EdgeContext ctx) {
		edge = (edmonds_flag)? new Edge(source, sink, capacity) : 
			   (dijsktra_flag)? new Edge(source, sink, weight)  : null;
		
		if(edge.equals(null)) {
			System.err.println("EDGE ERROR:  Unable to aquire correct graph type!");
			System.exit(1);
		}
		edges.add(edge);
	}
	
	@Override 
	public void enterSource(GrapherParser.SourceContext ctx) { 
		source = new Vertex(ctx.ID().toString());
	}

	@Override 
	public void enterEdges(GrapherParser.EdgesContext ctx) { 
		edges = new ArrayList<Edge>(1);
	}

	@Override 
	public void enterVertex(GrapherParser.VertexContext ctx) { 
		vertices.add(new Vertex(ctx.ID().getText()));  
	}

	@Override 
	public void enterVertices(GrapherParser.VerticesContext ctx) { 
		vertices = new ArrayList<Vertex>(1);
	}

	@Override 
	public void enterS_node(GrapherParser.S_nodeContext ctx) { 
		s_node = new Vertex(ctx.ID().getText());
	}

	@Override 
	public void enterCapacity(GrapherParser.CapacityContext ctx) { 
		capacity = Integer.valueOf(ctx.INT().getText());
	}
	
	@Override 
	public void enterSink(GrapherParser.SinkContext ctx) { 
		sink = new Vertex(ctx.ID().getText());
	}

	@Override 
	public void enterT_node(GrapherParser.T_nodeContext ctx) { 
		t_node = new Vertex(ctx.ID().getText());		
	}

	@Override public void exitGraph(GrapherParser.GraphContext ctx) { 
		 BasicDirectedGraph bdg = new BasicDirectedGraph(vertices.toArray(new Vertex[vertices.size()]), 
				 				  						 edges.toArray(new Edge[edges.size()]), s_node, t_node);
		 
		 bdg.constructDirectedGraph();
		 
		 if(edmonds_flag) 
			 bdg.calcMaxFlow();
		 
		 else {
			 bdg.unWeightedShortestPath();
			 bdg.weightedShortestPath();
		 }
	}
	
}