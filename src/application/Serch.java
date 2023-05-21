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

public class Serch extends Application implements EventHandler<ActionEvent> {
	Stage stage6;
	TextField textf1=new TextField("19876");
	TextField textf2=new TextField();
	TextField textf3=new TextField();
	TextField textf4=new TextField();
	TextField textf5=new TextField();
	TextField textf6=new TextField();
	public void start(Stage prStage) {
		GridPane root=new GridPane();
		root.setVgap(20);
		root.setHgap(20);
		root.setPadding(new Insets(30));
		Label label1=new Label("Customer ID:");
		Label label2=new Label("Customer Name:");
		Label label3=new Label("Customer Address:");
		Label label4=new Label("Customer Mobile:");
		Label label5=new Label("pane:");
		
		Button b1=new Button("search");
		b1.setPrefSize(100,20);
		b1.setStyle("-fx-background-color:blue ");
		
		
		
		b1.setOnAction(e->{
			
			MediaRental p=new MediaRental();
			int g=findValue(p);
			if(g==-1) {
				textf6.setText("not Exit to  do the serch it");
			}
			else
			{
				
				textf2.setText(p.customer.get(g).name);
				textf3.setText(p.customer.get(g).addraes);
				textf4.setText(p.customer.get(g).plan);
				textf5.setText(p.customer.get(g).mopileNumbner);
				textf6.setText("the id is exit");
				b1.setOnAction(this);
				
				  
			}
			
		});
		Button b2=new Button("Back");
		b2.setPrefSize(100,20);
		b2.setStyle("-fx-background-color:red ");
		root.addRow(0, label1,textf1);
		root.addRow(1, label2,textf2);
		root.addRow(2, label3,textf3);
		root.addRow(4, label4,textf4);
		root.addRow(5, label5,textf5);
		root.addRow(6, b1,textf6);
		root.add(b2, 0, 7);
		
		Scene sc=new Scene(root,400,400);
		prStage.setScene(sc);
		prStage.setTitle("search customer");
		stage6=prStage;
		prStage.show();
		b2.setOnAction(this);
	}

	@Override
	public void handle(ActionEvent arg0) {
		CastumerName g=new CastumerName();
		stage6.close();
		try {
			g.start(new Stage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int findValue(MediaRental p ) {
		int g=-1;
		for(int i=0;i<p.customer.size();i++)
		{
			if(p.customer.get(i).id.equals(textf1.getText())) {
				g=i;
				break;
			}
		}
		return g;
	}
}
