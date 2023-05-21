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
import javafx.stage.Stage;

public class AddMovie extends Application implements EventHandler<ActionEvent>{

	Stage p;
	TextField textf1=new TextField();
	TextField textf2=new TextField();
	TextField textf3=new TextField();
	TextField textf4=new TextField("AB005");
	TextField textf5=new TextField();
	public void start(Stage primaryStage) {
		GridPane ppp=new GridPane();
		p=primaryStage;
		ppp.setVgap(20);
		ppp.setHgap(20);
		ppp.setPadding(new Insets(20));
		Label lab=new Label("Code : ");
		Label labb=new Label(" the Title");
		Label lab1=new Label("isAdd:");
		
		Label la3=new Label("rating");
		Label la2=new Label("number of copies");
		
		Button bt1=new Button("back");
		bt1.setPrefSize(100,20);
		bt1.setStyle("-fx-background-color:red ");
		bt1.setOnAction(this);
		Button bt2=new Button("add");
		bt2.setPrefSize(100,20);
		bt2.setStyle("-fx-background-color:blue ");
		test(bt2);
		ppp.addRow(0, lab, textf4);
		ppp.addRow(1, labb, textf1);
		ppp.addRow(2, la2,textf2);
		ppp.addRow(3, la3,textf3);
		ppp.addRow(4,bt1,bt2);
		ppp.addRow(5, lab1,textf5);
		Scene sc=new Scene(ppp,500,500);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Add the move");
		primaryStage.show();
		
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		AddMedia t=new AddMedia();
		p.close();
		t.start(new Stage());
		
	}
	public void test(Button bt2) {
		bt2.setOnAction(e->{
			MediaRental f=new MediaRental();
			String s=textf4.getText();
			String s1=textf1.getText();
			int  s2=Integer.parseInt(textf2.getText()); 
			String s3=textf3.getText();
			System.out.println(s3);
			f.addMovie(s1, s2,textf3.getText(), s);
			textf5.setText("add is done");
			
		});
	}

}