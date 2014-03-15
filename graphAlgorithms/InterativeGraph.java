package graphAlgorithms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import javax.swing.JFrame;
import org.apache.commons.collections15.Transformer;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;

@SuppressWarnings("serial")
public class InterativeGraph extends JFrame{
	
	private DirectedSparseMultigraph<String, Edge> dsmg;
	
	public InterativeGraph(DirectedSparseMultigraph<String, Edge> dsmg, String title) {
		this.setTitle(title);
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.setSize(450, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.dsmg = dsmg;
		Layout<String, Edge> layout = new CircleLayout<String, Edge>(dsmg);
        layout.setSize(new Dimension(450,550));
        VisualizationViewer<String,Edge> vv = new VisualizationViewer<String,Edge>(layout);
        vv.setPreferredSize(new Dimension(450,550));
        
        Transformer<String,Paint> vertexPaint = new Transformer<String,Paint>() {
            public Paint transform(String v) {
                return Color.GREEN;
            }
        };  
       
        vv.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<String>());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<Edge>());
        vv.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR);    
        
        DefaultModalGraphMouse<String, Edge> gm = new DefaultModalGraphMouse<String, Edge>();
        gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);
        
        vv.setGraphMouse(gm); 
      
        this.getContentPane().add(vv);
        this.pack();
        this.setVisible(true);
	}	

}