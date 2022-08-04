package application;

import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class TreeNode {

	private int width;
	private int height;
	private Rectangle rectangle;
	private Line line;
	private Pane pane;
	private CheckBox checkBox;
	
	public TreeNode() {
		width = 150;
		height = 75;
		
		init();
	}
	
	public TreeNode(int height, int width) {
		this.height = height;
		this.width = width;
		
		init();
	}
	
	private void init() {
		int topheight = height/5;
		
		pane = new Pane();
		
		rectangle = new Rectangle(width, height);
		rectangle.setStyle("-fx-fill: white; -fx-stroke: black; -fx-stroke-width: 1;");
		
		line = new Line(0, topheight, width, topheight);
		
		checkBox = new CheckBox();
		checkBox.setLayoutX(width - topheight); //TODO feste checkbox größe
		
		//TODO: dann selber in css nen custom design erstellen. mit below o.ä. dann die größe per params anpassen
//		checkBox.setStyle("-fx-scale-x: 2; -fx-scale-y: 2;");
		
		pane.getChildren().add(rectangle);
		pane.getChildren().add(line);
		pane.getChildren().add(checkBox);
		
	}
	
	public Pane getNode() {
		return pane;
	}
}
