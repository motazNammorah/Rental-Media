package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Update extends Application implements EventHandler<ActionEvent>{

		Stage stage10;
		public void start(Stage primr) {
			GridPane pane=new GridPane();
			stage10=primr;
			pane.setVgap(40);
			
			pane.setHgap(40);
			pane.setPadding(new Insets(30));
			ComboBox<String>namoru=new ComboBox<>();
			namoru.getItems().addAll("Game","album","movie");
			Button ba=new Button("back");
			 ba.setStyle("-fx-background-color:green");
			ba.setPrefSize(200,10);
			ba.setOnAction(e->{
				MMedia f=new MMedia();
				stage10.close();
				f.start(new Stage());
			});
		namoru.setOnAction(e->{
			if(namoru.getValue().equals("Game")) {
				UUpdateGame c=new UUpdateGame();
				stage10.close();
				try {
					c.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(namoru.getValue().equals("album")) {
				UpdaetAlbum b=new UpdaetAlbum();
				stage10.close();
				try {
					b.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(namoru.getValue().equals("movie")) {
				UpdateMove c=new UpdateMove();
				stage10.close();
				try {
					c.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
			
			pane.add(namoru, 1, 4);
			pane.add(ba, 1, 6);
			Scene scene=new Scene(pane,400,400);
			primr.setScene(scene);
			primr.setTitle("Update ");
			primr.show();
		}

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
