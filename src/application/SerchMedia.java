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

public class SerchMedia extends Application implements EventHandler<ActionEvent>{

	Stage stage11;
	public void start(Stage primr) {
		GridPane pane=new GridPane();
		stage11=primr;
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
			stage11.close();
			f.start(new Stage());
		});
	namoru.setOnAction(e->{
		if(namoru.getValue().equals("Game")) {
			SerchGame c=new SerchGame();
			stage11.close();
			try {
				c.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(namoru.getValue().equals("album")) {
			SearchAlbum b=new SearchAlbum();
			stage11.close();
			try {
				b.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(namoru.getValue().equals("movie")) {
			SerchMove c=new SerchMove();
			stage11.close();
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
		primr.setTitle("Serch ");
		primr.show();
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
