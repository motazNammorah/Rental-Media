package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AddGame extends Application implements EventHandler<ActionEvent>{

	Stage h;
	TextField textF1=new TextField();
	TextField textF2=new TextField();
	TextField textF3=new TextField();
	TextField textF4=new TextField("AB005");
	TextField textF5=new TextField();
	public void start(Stage primaryStage) {
		GridPane pane=new GridPane();
		h=primaryStage;
		pane.setVgap(30);
		pane.setHgap(30);
		pane.setPadding(new Insets(20));
		Label la1=new Label("Code : ");
		Label la2=new Label(" the Title");
		Label la3=new Label("number of copies");
		Label la4=new Label("wight");
		Label la5=new Label("isAdd");
		
		Button bt1=new Button("back");
		bt1.setPrefSize(100,20);
		bt1.setStyle("-fx-background-color:red ");
		bt1.setOnAction(this);
		Button bt2=new Button("add");
		bt2.setPrefSize(100,20);
		bt2.setStyle("-fx-background-color:blue ");
		bt2.setOnAction(e->{
			MediaRental j=new MediaRental();
			
			j.addGame(textF1.getText(), Integer.parseInt(textF2.getText()), Double.parseDouble(textF3.getText()),textF4.getText());
		textF5.setText("add is fine");
			
		});
		pane.addRow(0, la1,textF4);
		pane.addRow(1, la2, textF1);
		pane.addRow(3, la4,textF3);
		pane.addRow(2, la3,textF2);
		pane.addRow(4,bt1,bt2);
		pane.addRow(5, la5, textF5);
		Scene sc=new Scene(pane,500,500,Color.GREEN);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Add the Game");
		primaryStage.show();
		
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		AddMedia t=new AddMedia();
		h.close();
		t.start(new Stage());
		
	}


}