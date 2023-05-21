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

public class SearchAlbum extends Application implements EventHandler<ActionEvent>{
	TextField te1=new TextField();
	TextField te2=new TextField();
	TextField te3=new TextField();
	TextField te=new TextField();
	TextField te4=new TextField();
	TextField te5=new TextField();
	TextArea te6=new TextArea();
	
	Stage j;
	public void start(Stage primaryStage) {
		GridPane root=new GridPane();
		j=primaryStage;
		root.setVgap(20);
		root.setHgap(20);
		root.setPadding(new Insets(30));
		Label la=new Label("Code : ");
		Label la1=new Label(" the Title");
		Label la2=new Label("number of copies");
		Label la3=new Label("artist");
		Label la4=new Label("is search");
		Label la5=new Label("display :");
		Button bt1=new Button("back");
		Label la6=new Label("song");
		bt1.setOnAction(this);
		Button bt2=new Button("serch");
		test(bt2);
		root.addRow(0, la,te);
		root.addRow(1, la1, te1);
		root.addRow(2, la2,te2);
		root.addRow(3, la3,te3);
		root.addRow(4, la6,te5);
		root.addRow(5,bt1,bt2);
	    root.addRow(6, la4, te4);
		Scene sc=new Scene(root,400,400);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Search Album");
		primaryStage.show();
		
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		SerchMedia v=new SerchMedia();
		j.close();
		v.start(new Stage());
		
	}

	
	public void test(Button bt2) {
	
		bt2.setOnAction(e->{
			MediaRental r=new MediaRental();
			int i=0,h=-1;
			while(i<r.media.size()) {
				if(((Album)r.media.get(i)).getCode().equals(te.getText())) {
					h=i;
					break;
				}
				i++;
			}
			if(h==-1) {
				te4.setText("code is not exit");
			}
			else
			{
				te1.setText(((Album)r.media.get(h)).title);
				te2.setText(((Album)r.media.get(h)).copiesAvailable+"");
				te3.setText(((Album)r.media.get(h)).getArtist());
				te5.setText(((Album)r.media.get(h)).getSongs());
				te4.setText("code is exit and you can seen information");
			//	te6.setText(((Game)r.media.get(h)).toString());
				
			}
		});
	}


}