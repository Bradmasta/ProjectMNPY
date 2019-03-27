package ProjectM.src;
import java.util.*;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PMBoard extends Application {
PMGameData data = new PMGameData();

PMRandom roll = new PMRandom();
	//private TextField startTF = new TextField();

	public void start(Stage primaryStage) {

		Pane pane = new Pane();

	    primaryStage.setHeight(1000);
	    primaryStage.setWidth(1000);

		// Store the children variable for easier access
		

		BorderPane thing = new BorderPane();
		
		thing.setCenter(pane);



		Scene scene = new Scene(thing, 1000, 1000);
		primaryStage.setTitle("Project M");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public void TheGame() {
		GameMechanics gm = new GameMechanics();
		int curPlayer = data.GetPlayer();
		int curSpace = data.GetPlayerPos();
		int possNPS = data.nonPropSpaces()[curSpace][0];
		int action = data.GetActions();
		int bank = data.GetPlayersBank();
		if (action == -1) {
		roll.NewRoll();
		}
		
		else if (action > -1) {
			switch (action) {
		
			case 0:
				System.out.println("Current Space: (Buyable Space will appear as -1): " + possNPS);
				
				
			if (curSpace != possNPS) {
			gm.BuyProperty();
			break;
			}
			else {
			System.out.println(data.SpaceName()[curSpace]);
			gm.EndTurn();
			break;
			}
			case 1:	
			System.out.println("Player " + curPlayer + " has a bank of: " + bank);
				
			gm.EndTurn();
			break;
			case 2:
			System.out.println("Good :)");
			break;
			default:
			System.out.println("You shouldn't see this!");
			break;
			}
		}
		
	}
	public static void main (String[] args) {
		launch(args);
	}
	
}
