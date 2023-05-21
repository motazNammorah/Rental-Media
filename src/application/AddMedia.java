package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddMedia extends Application implements EventHandler<ActionEvent>{
	Stage stage8;
	
	public void start(Stage primstage) {
		
		 BorderPane pane=new BorderPane();
		 ComboBox<String> hh=new ComboBox<>();
		 stage8=primstage;
		 
		 hh.getItems().addAll("Game","Album","Movie");
		 
		 Button Back=new Button("back");
		 Back.setStyle("-fx-background-color:green");
		 Back.setPrefSize(200,10);
			
		 Back.setOnAction(e->{
			 MMedia v=new MMedia();
			 stage8.close();
			 v.start(new Stage());
		 });
		 
		 pane.setPadding(new Insets(30));
		 pane.setCenter(hh);
		 pane.setBottom(Back);
		 Back.setOnAction(this);
		 Scene sc=new Scene(pane,400,400);
		 primstage.setScene(sc);
		 primstage.setTitle("add to media");
		 primstage.show();
		
		 hh.setOnAction(e->{
			if(hh.getValue().compareTo("Album")==0) {
				AddAlbum n=new AddAlbum();
				stage8.close();
				n.start(new Stage());
			}
			else if(hh.getValue().compareTo("Game")==0) {
				
				AddGame v=new AddGame();
				stage8.close();
				v.start(new Stage());
			}
			else if(hh.getValue().compareTo("Movie")==0)
			{
				AddMovie r=new AddMovie();
				stage8.close();
				r.start(new Stage());
			}
		 });
		 
		 
		 
	}

	@Override
	public void handle(ActionEvent arg0) {
	MMedia b=new MMedia();
	stage8.close();
	b.start(new Stage());
		
	}

	
	

}