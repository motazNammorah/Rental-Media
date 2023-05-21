package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DeleatTheGame  extends Application implements EventHandler<ActionEvent>{
	TextField tf1=new TextField();
	TextField tf2=new TextField();
	TextField tf3=new TextField();
	TextField tf4=new TextField();
	TextField tf5=new TextField("AB005");
	Label lab1=new Label("Code : ");
	Label lab2=new Label(" the Title");
	Label lab3=new Label("number of copies");
	Label lab4=new Label("wight");
	Label lab5=new Label("ErrorMassge : ");
	
	Stage kk;
	public void start(Stage primaryStage) {
		GridPane root=new GridPane();
		kk=primaryStage;
		root.setVgap(30);
		root.setHgap(30);
		root.setPadding(new Insets(30));
		
		Button bt1=new Button("back");
		bt1.setOnAction(this);
		Button bt2=new Button("find");
		Button bt3=new Button("Deleat");

		text(bt2,bt3);
		
		root.addRow(0, lab1,tf5);
		root.addRow(1, lab2, tf2);
		root.addRow(2, lab3,tf3);
		root.addRow(3, lab4,tf4);
		root.addRow(4,bt1,bt2,bt3);
		root.addRow(5, lab5,tf1);
		Scene sc=new Scene(root,400,400);
		primaryStage.setScene(sc);
		primaryStage.setTitle(" Deleat the game");
		primaryStage.show();
		
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		Deleat y=new Deleat();
		kk.close();
		y.start(new Stage());
		
	}
	public void text(Button bt2,Button bt3) {
		bt2.setOnAction(e->{
			int h=-1;
			MediaRental r=new MediaRental();
			int i=0;
			
			while(i<r.media.size()) {
				if(r.media.get(i) instanceof Game) {
					System.out.println(((Game)r.media.get(i)).getTheCode());
					if(((Game)r.media.get(i)).getTheCode().compareTo(tf5.getText())==0) {
						h=i;
						break;
					}
				}
				i++;
			}
			
			if(h==-1) {
				tf1.setText("Error information does not exit");
			}
			else
			{
				tf1.setText("you can deltat it");
				tf2.setText(((Game)r.media.get(h)).title);
			
				tf3.setText(((Game)r.media.get(h)).getCopiesAvailable()+"");
				
				tf4.setText(((Game)r.media.get(h)).getWeight()+"");
				bt3.setOnAction(e1->{
					tf2.setText(null);
					tf3.setText(null);
					tf4.setText("");
					tf5.setText("");
				});
			}
			
				
			});
	}


}