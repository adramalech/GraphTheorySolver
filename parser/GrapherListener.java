// Generated from Grapher.g4 by ANTLR 4.0
package parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GrapherListener extends ParseTreeListener {
	void enterGraph_type(GrapherParser.Graph_typeContext ctx);
	void exitGraph_type(GrapherParser.Graph_typeContext ctx);

	void enterWeight(GrapherParser.WeightContext ctx);
	void exitWeight(GrapherParser.WeightContext ctx);

	void enterEdge(GrapherParser.EdgeContext ctx);
	void exitEdge(GrapherParser.EdgeContext ctx);

	void enterGraph(GrapherParser.GraphContext ctx);
	void exitGraph(GrapherParser.GraphContext ctx);

	void enterSource(GrapherParser.SourceContext ctx);
	void exitSource(GrapherParser.SourceContext ctx);

	void enterEdges(GrapherParser.EdgesContext ctx);
	void exitEdges(GrapherParser.EdgesContext ctx);

	void enterVertex(GrapherParser.VertexContext ctx);
	void exitVertex(GrapherParser.VertexContext ctx);

	void enterFile(GrapherParser.FileContext ctx);
	void exitFile(GrapherParser.FileContext ctx);

	void enterVertices(GrapherParser.VerticesContext ctx);
	void exitVertices(GrapherParser.VerticesContext ctx);

	void enterS_node(GrapherParser.S_nodeContext ctx);
	void exitS_node(GrapherParser.S_nodeContext ctx);

	void enterCapacity(GrapherParser.CapacityContext ctx);
	void exitCapacity(GrapherParser.CapacityContext ctx);

	void enterSink(GrapherParser.SinkContext ctx);
	void exitSink(GrapherParser.SinkContext ctx);

	void enterT_node(GrapherParser.T_nodeContext ctx);
	void exitT_node(GrapherParser.T_nodeContext ctx);
}