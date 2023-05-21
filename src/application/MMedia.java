package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MMedia  extends Application implements EventHandler<ActionEvent>{
	Stage stage7;
	public void start(Stage primar) {
		GridPane root=new GridPane();
		stage7=primar;
		root.setPadding(new Insets(20));
		root.setHgap(20);
		root.setVgap(20);
		Button button=new Button("Add new media");
		button.setStyle("-fx-background-color:blue");
		button.setPrefSize(200,10);
		button.setOnAction(e->{
			AddMedia v=new AddMedia();
			stage7.close();
			v.start(new Stage());
		});
		Button button1=new Button("Deleat media");
		button1.setStyle("-fx-background-color:blue");
		button1.setPrefSize(200,10);
		Button button2=new Button("Update information");
		button2.setStyle("-fx-background-color:blue");
		button2.setPrefSize(200,10);
		Button button3=new Button("serch a media");
		button3.setStyle("-fx-background-color:blue");
		button3.setPrefSize(200,10);
		Button button5=new Button("print media information");
		button5.setStyle("-fx-background-color:blue");
		button5.setPrefSize(200,10);
		Button button4=new Button("return media");
		button4.setStyle("-fx-background-color:red");
		button4.setPrefSize(200,10);
		root.add(button,  0, 0);
		root.add(button1, 0, 1);
		root.add(button2, 0, 2);
		root.add(button3, 0, 3);
		root.add(button5, 0, 4);
		root.add(button4, 0, 5);
		Scene scene=new Scene(root,400,400);
		primar.setScene(scene);
		primar.setTitle("MEDIA");
		primar.show();
	
	
		button1.setOnAction(e->{
			Deleat g=new Deleat();
			stage7.close();
			g.start(new Stage());
			
		});
		button2.setOnAction(e->{
			Update f=new Update();
			stage7.close();
			f.start(new Stage());
		});
		button4.setOnAction(e->{
			Main t=new  Main();
			stage7.close();
			t.start(new Stage());
		});
		button3.setOnAction(e->{
			SerchMedia f=new SerchMedia();
			stage7.close();
			f.start(new Stage());
		});
		button5.setOnAction(e->{
			printMedia n=new printMedia();
			stage7.close();
			n.start(new Stage());
		});
		
	
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
