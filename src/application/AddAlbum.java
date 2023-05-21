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

public class AddAlbum extends Application implements EventHandler<ActionEvent>{

	Stage h;
	TextField te1=new TextField();
	TextField te2=new TextField();
	TextField te3=new TextField();
	TextField te4=new TextField();
	TextField te5=new TextField("AB005");
	TextField te6=new TextField();
	public void start(Stage primaryStage) {
		GridPane root=new GridPane();
		h=primaryStage;
		root.setVgap(30);
		root.setHgap(30);
		
		root.setPadding(new Insets(20));
		Label la1=new Label(" the Title");
		Label la2=new Label("number of copies");
		Label la3=new Label("artist");
		Label la4=new Label("song");
		Label la5=new Label("Code M : ");
		Label la6=new Label("isAdd :");
		
		Button bt1=new Button("back");
		bt1.setPrefSize(100,20);
		bt1.setStyle("-fx-background-color:red ");
		
		bt1.setOnAction(this);
		Button bt2=new Button("add");
		bt2.setPrefSize(100,20);
		bt2.setStyle("-fx-background-color:blue ");
		test(bt2);
		
		root.addRow(0, la5,te5);
		root.addRow(1, la1, te1);
		root.addRow(2, la2,te2);
		root.addRow(3, la3,te3);
		root.addRow(4, la4,te4);
		root.addRow(5,bt1,bt2);
		root.addRow(6, la6, te6);
		Scene sc=new Scene(root,400,400);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Add Album");
		primaryStage.show();
		
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		AddMedia t=new AddMedia();
		h.close();
		t.start(new Stage());
		
	}
	public void test(Button bt2) {
		bt2.setOnAction(e->{
			MediaRental f=new MediaRental();
			
			te6.setText("add is fine ");
			f.addAlbum(te1.getText(), Integer.parseInt(te2.getText()), te3.getText(), te4.getText(),te5.getText());
			
			
		});
	}


}