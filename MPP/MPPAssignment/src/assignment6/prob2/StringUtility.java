package assignment6.prob2;

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
import javafx.stage.Stage;

public class StringUtility extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("String Utility");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		//top, right, bottom, left
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		
		
		Button btn =new Button();
		btn.setText("Count Letters");
		HBox hbxBtn = new HBox(10);
		hbxBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbxBtn.getChildren().add(btn);
		grid.add(hbxBtn, 0, 0);
		
		
		Button btn1 =new Button();
		btn1.setText("Reverse Letters");
		HBox hbxBtn1 = new HBox(10);
		hbxBtn1.setAlignment(Pos.BOTTOM_RIGHT);
		hbxBtn1.getChildren().add(btn1);
		grid.add(hbxBtn1, 0, 1);
		
		
		Button btn2 =new Button();
		btn2.setText("Remove Duplicates");
		HBox hbxBtn2 = new HBox(10);
		hbxBtn2.setAlignment(Pos.BOTTOM_RIGHT);
		hbxBtn2.getChildren().add(btn2);
		grid.add(hbxBtn2, 0, 2);
		
		
		Label input = new Label("Input");
		grid.add(input, 1, 0);
		TextField inputTextField = new TextField();
		grid.add(inputTextField, 1, 1);
		
		Label output = new Label("Output");
		grid.add(output, 1, 2);
		TextField outputTextField = new TextField();
		grid.add(outputTextField, 1, 3);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String input=inputTextField.getText();
				
				int inputLength=input.length();
				
				String length=String.valueOf(inputLength);
				
				outputTextField.setText(length);
				
			}
			});
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				String input=inputTextField.getText();
				int inputLength=input.length();
				String temp="";
				
				
				for(int i=10;i>=0;i--) {
					temp+=input.charAt(i);
				}
				outputTextField.setText(temp);
			}
			});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String input=inputTextField.getText();
				int inputLength=input.length();
				 String result = "";
				    for (int i = 0; i < input.length(); i++) {
				        if(!result.contains(String.valueOf(input.charAt(i)))) {
				            result += String.valueOf(input.charAt(i));
				        }
				    }
				outputTextField.setText(result);
				
			}
			});
		
		primaryStage.setScene(new Scene(grid,300,270));
		primaryStage.show();
	}

}
