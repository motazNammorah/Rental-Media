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

public class DeleatAlbum   extends Application implements EventHandler<ActionEvent>{
	TextField tf1=new TextField();
	TextField tf2=new TextField();
	TextField tf3=new TextField();
	TextField tf4=new TextField();
	TextField tf5=new TextField();
	TextField tf6=new TextField();
	Stage h;
	public void start(Stage primaryStage) {
		GridPane ll=new GridPane();
		h=primaryStage;
		ll.setVgap(30);
		ll.setHgap(30);
		ll.setPadding(new Insets(20));
		Label la=new Label("Code : ");
		Label la1=new Label(" the Title");
		Label la2=new Label("number of copies");
		Label la3=new Label("artist");
		Label la4=new Label("song");
		Label la5=new Label("ErrorMassge : ");
	
		Button oi=new Button("back");
		oi.setOnAction(this);
		Button button2=new Button("find");
		Button button3=new Button("Deleat");
		test(button2,button3);
		ll.addRow(0, la,tf5);
		ll.addRow(1, la1, tf2);
		ll.addRow(2, la2,tf3);
		ll.addRow(3, la3,tf4);
		ll.addRow(4, la4,tf6);
		ll.addRow(7, la5,tf1);
		ll.addRow(5,oi,button2,button3);
		Scene sc=new Scene(ll,500,500);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Deleat ALbum");
		primaryStage.show();
		
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		Deleat g=new Deleat();
		h.close();
		g.start(new Stage());
		
	}
	public void test(Button bt2,Button bt3) {
		bt2.setOnAction(e->{
			int h=-1;
			MediaRental r=new MediaRental();
		
			int i=0;
			while(i<r.media.size()) {
				if(r.media.get(i) instanceof Album) {
					if(((Album)r.media.get(i)).code.compareTo(tf5.getText())==0) {
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
				tf1.setText("its exit ");
				tf2.setText(((Album)r.media.get(h)).title);
				String n=((Album)r.media.get(h)).getCopiesAvailable()+"";
				tf3.setText(n);
				String c=((Album)r.media.get(h)).songs;
				tf4.setText(c);
				tf6.setText(((Album)r.media.get(h)).artist);
				bt3.setOnAction(e1->{
					tf2.setText(null);
					tf3.setText(null);
					tf4.setText(null);
					tf5.setText(null);
					tf6.setText(null);
				
				});
			}
			
				
			});
	}

}