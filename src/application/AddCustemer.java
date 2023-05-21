package application;

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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddCustemer extends Application implements EventHandler<ActionEvent>{
	Stage stage3;
	public void start(Stage stage) {
		GridPane pane=new GridPane();
		pane.setPadding(new Insets(30));
		pane.setVgap(20);
		pane.setHgap(20);
		
		Label label1=new Label("Customer id:");
		TextField tex=new TextField("19876");
		pane.addRow(0, label1,tex);
		
		Label label2=new Label("Customer name: ");
		TextField tex2=new TextField();
		pane.addRow(1, label2,tex2);
		
		Label label3=new Label("customer addres:");
		TextField tex3=new TextField();
		pane.addRow(2, label3,tex3);
		
		Label label4=new Label("Customer mobile: ");
		TextField tex4=new TextField();
		
		Label la=new Label("plann:");
		TextField tet=new TextField();
		pane.addRow(3,la,tet);
		
		Label la5=new Label("ADD??:");
		TextField tec=new TextField();
		pane.addRow(6, la5,tec);
		
		Button add=new Button("add");
		add.setPrefSize(100,20);
		add.setStyle("-fx-background-color:blue ");
		
		Button back=new Button("back");
		back.setPrefSize(100,20);
		back.setStyle("-fx-background-color:red ");
		
		tex3.setDisable(true);
		tex2.setOnKeyTyped(e->{
			tex3.setDisable(false);
		});
		tex4.setDisable(true);
		tex3.setOnKeyTyped(e->{
			tex4.setDisable(false);
		});
		tet.setDisable(true);
		tex4.setOnKeyTyped(e->{
			tet.setDisable(false);
		});
		
		add.setOnAction(e->{
	
			MediaRental x=new MediaRental();
			int o=-2;
			for(int i=0;i<x.customer.size();i++) {
				if(x.customer.get(i).getId().compareTo(tex.getText())==0) {
					o=i;
					
				}
			}
			if(o==-2) {
				
				String name=tex2.getText();
				String address=tex3.getText();
				String plan=tet.getText();
				String id=tex.getText();
				String mobileNumber=tex4.getText();
				x.addCustomer(name, address,plan,id,mobileNumber);
				tec.setText("id is not exit ..so i add it");
			}else {
				tec.setText("id is already exit");
			}
			
			
			
		});
		pane.addRow(4,label4,tex4);
		back.setOnAction(this);
		pane.add(add, 1, 5);
		pane.add(back, 0,5);
		Scene sc =new Scene(pane,400,500);
		stage.setScene(sc);
		stage.show();
		stage3=stage;
		
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		CastumerName f=new CastumerName();
		stage3.close();
		try {
			f.start(new Stage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
