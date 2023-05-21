package application;

import java.util.Date;

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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rent extends Application implements EventHandler<ActionEvent> {
	Stage x;
	TextField text1=new TextField("19876");
	TextArea tex2=new TextArea();
	TextField tex3=new TextField("AB005");
	TextArea tex4=new TextArea();
	TextField text5=new TextField();
	TextField tex6=new TextField();
	TextField tex7=new TextField();
	TextField tex8=new TextField();
	TextField tex9=new TextField();
	TextField tex10=new TextField();
	public void start(Stage primaryStage) {
		GridPane root=new GridPane();
		x=primaryStage;
		primaryStage.setMaximized(true);
		root.setVgap(20);
		root.setHgap(100);
		root.setPadding(new Insets(20));
		Label la1=new Label("Customer id :");
		Label la2=new Label("Media code :");
		Label la3=new Label("Rented Date : ");
		
		Button bt1=new Button("Add to cart ");
		Button  bt2=new Button("Process Cart");
		Button bt4=new Button ("printIntrested:");
		Button bt5=new Button("printRented");
		Button bt6=new Button("return media");
		
		AddToCart(bt1,bt2,bt4);
	bt5.setOnAction(e3->{
		int j=0,i=0;
		MediaRental r=new MediaRental();
	
		while(i<r.customer.size()) {
			if(r.customer.get(i).id.equals(text1.getText())) {
				j=i;
				break;
			}
			i++;
		}
		tex9.setText(r.customer.get(j).rented+"");
		tex7.setText(null);
		tex6.setText(null);
		tex8.setText(null);
		
	});
		Button bt3=new Button("return  Media");
		bt3.setOnAction(this);
		Button bt7=new Button("return rented");
		bt7.setOnAction(e->{
			tex10.setText("the returned media is done");
		});
		root.addRow(0, la1,text1);
		root.add(tex2, 1,2);
		root.addRow(3, la2,tex3);
		root.add(tex4, 1, 4);
		root.addRow(5, la3,text5);
		root.addRow(6, bt1,tex6);
		root.addRow(7, bt4,tex8);
		root.addRow(8, bt2,tex7);
		root.addRow(9, bt5,tex9);
		root.addRow(10, bt7, tex10);
		root.addRow(11, bt3);
		Scene sc=new Scene(root,600,400);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Renting");
		primaryStage.show();
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		Main y=new Main();
		x.close();
		y.start(new Stage());
		
	}
	public void AddToCart(Button bt1,Button bt2,Button bt4) {
		bt1.setOnAction(e->{
			MediaRental r=new MediaRental();
			int u=-1,m=-1,i=0,j=0;
			while(i<r.customer.size()) {
				if(r.customer.get(i).id.equals(text1.getText())) {
					u=i;
					break;
				}
			}
			String title=null;
			while(j<r.media.size()) {
				if(r.media.get(j) instanceof Game) {
					if(((Game)r.media.get(j)).getTheCode().compareTo(tex3.getText())==0){
						title=((Game)r.media.get(j)).getTitle();
						tex4.setText(((Game)r.media.get(j)).toString());
						m=j;
						break;
					}
				}
				
				
			
				else if(r.media.get(j) instanceof Album) {
					if(((Album)r.media.get(j)).getCode().compareTo(tex3.getText())==0) {
						m=j;
							title=((Album)r.media.get(j)).getTitle();
							tex4.setText(((Album)r.media.get(j)).toString());
							break;
						
						
					}
				}

				else if(((Movie)r.media.get(j)).getTheCode().compareTo(tex3.getText())==0) {
				if(((Movie)r.media.get(j)).equals(tex3.getText())) {
					m=j;
					title=((Movie)r.media.get(j)).getTitle();
					tex4.setText(((Movie)r.media.get(j)).toString());
					break;
				
					}
				}
				j++;
			}
			
			
			if(u==-1) {
				tex2.setText("no information to print it");
				tex4.setText("no information to print it");
				tex6.setText("no imformation to add to cart");
			}
			else
			{
				
				tex2.setText(r.customer.get(u).toString());
				text5.setText(new Date()+"");
				r.addToCart(r.customer.get(u).name, title);
				tex6.setText(r.customer.get(u).toString()) ;
				bt4.setOnAction(e2->{
					int l=0;
				
				int	o=0;
					while(i<r.customer.size()) {
						if(r.customer.get(o).id.equals(text1.getText())) {
							l=o;
						break;
						}
						o++;
					}
					tex8.setText(r.customer.get(l).interested+"");
					tex6.setText(null);
					tex9.setText(null);
					tex7.setText(null);
				});
				
				bt2.setOnAction(e1->{
					tex7.setText(r.processRequests());
					tex8.setText(null);
					tex6.setText(null);
					tex9.setText(null);
				});
			}
		});
	}
}