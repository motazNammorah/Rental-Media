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

public class UpdaetAlbum extends Application implements EventHandler<ActionEvent>{
	TextField te1=new TextField();
	TextField te2=new TextField();
	TextField te3=new TextField();
	TextField te=new TextField();
	TextField te5=new TextField();
	TextField te4=new TextField();
	Stage h;
	public void start(Stage primaryStage) {
		GridPane root=new GridPane();
		h=primaryStage;
		
		root.setHgap(30);
		root.setVgap(30);
		root.setPadding(new Insets(30));
		Label la=new Label("Code : ");
		Label la1=new Label(" the Title");
		Label la2=new Label("number of copies");
		Label la3=new Label("artist");
		Label la4=new Label("song");
		Label la5=new Label("isUbdate");
		
		Button bt1=new Button("back");
		bt1.setOnAction(this);
		Button bt3=new Button("ubdate");
		Button bt2=new Button("find");
		test(bt2, bt3);
		root.addRow(0, la,te);
		root.addRow(1, la1, te1);
		root.addRow(2, la2,te2);
		root.addRow(3, la3,te3);
		root.addRow(4, la4,te4);
		root.addRow(5,bt1,bt3,bt2);
		root.addRow(6, la5,te5);
		Scene sc=new Scene(root,400,400);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Update  Game");
		primaryStage.show();
		
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		Update y=new Update();
		h.close();
		y.start(new Stage());
		
	}
 
	public void test(Button bt2,Button bt3) {
		bt2.setOnAction(e->{
			MediaRental r=new MediaRental();
			int o=-1;
		
			int i=0;
			while(i<r.media.size()) {
				if(((Album)r.media.get(i)).getCode().equals(te.getText())) {
					o=i;
					break;
				}
				i++;
			}
			if(o==-1) {
				te4.setText("no informaiton to update it");
			}
			else
			{
				
				String s1=((Album)r.media.get(o)).title;
				String s2=((Album)r.media.get(o)).getCopiesAvailable()+"";
				String s3=((Album)r.media.get(o)).getArtist();
				String s4=((Album)r.media.get(o)).getSongs();
				te1.setText(s1);
				te2.setText(s2);
				te3.setText(s3);
				te4.setText(s4);
				te4.setText("have informaiton you can update it");
				bt3.setOnAction(e1->{
					int v=-1;
					int j=0;
					while(j<r.media.size()) {
						if(((Album)r.media.get(j)).getCode().compareTo(te.getText())==0) {
							v=j;
							break;
						}
						j++;
					}
				String title=te1.getText();
				int h=Integer.parseInt(te2.getText());
				
				((Album)r.media.get(v)).setTitel(title);
				((Album)r.media.get(v)).setCopiesAvailable(h);
				((Album)r.media.get(v)).setArtist(te3.getText());
				((Album)r.media.get(v)).setSongs(te4.getText());
				
				});
			}
			
		});
	}

}
