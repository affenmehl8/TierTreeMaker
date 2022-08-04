package application;
	
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();

			
			
			Button btn1 = new Button("tst");
			Button btn2 = new Button("sadiwjoiijawd"); 
			ToolBar toolBar = new ToolBar();
			toolBar.getItems().add(btn1);
			toolBar.getItems().add(btn2);
			
			root.getChildren().add(toolBar);
			
			
			TreeNode treeNode = new TreeNode();
			root.getChildren().add(treeNode.getNode());

			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
