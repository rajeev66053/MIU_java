package assignment6.prob1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AddressForm extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("Address Form");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		//top, right, bottom, left
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		
		Label name = new Label("Name");
		grid.add(name, 0, 0);
		TextField nameTextField = new TextField();
		grid.add(nameTextField, 0, 1);
		
		Label street = new Label("Street");
		grid.add(street, 1, 0);
		TextField streetTextField = new TextField();
		grid.add(streetTextField, 1, 1);
		
		Label city = new Label("City");
		grid.add(city, 2, 0);
		TextField cityTextField = new TextField();
		grid.add(cityTextField, 2, 1);
		
		
		Label state = new Label("State");
		grid.add(state, 0, 3);
		TextField stateTextField = new TextField();
		grid.add(stateTextField, 0, 4);
		
		Label zip = new Label("Zip");
		grid.add(zip, 1, 3);
		TextField zipTextField = new TextField();
		grid.add(zipTextField, 1, 4);

		
		Button btn =new Button();
		btn.setText("Submit");
		HBox hbxBtn = new HBox(10);
		hbxBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbxBtn.getChildren().add(btn);
		grid.add(hbxBtn, 2, 5);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String name=nameTextField.getText();
				String street=streetTextField.getText();
				String city=cityTextField.getText();
				String state=stateTextField.getText();
				String zip=zipTextField.getText();
				
				System.out.println(name+"\n"+street+"\n"+city+", "+state+" "+zip);
			}
			});
		
		primaryStage.setScene(new Scene(grid,300,270));
		primaryStage.show();
	}

}
