package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class CastumerName extends Application implements EventHandler<ActionEvent>{
	Stage stage2;
	
	public void start(Stage primrStage)throws Exception {
		GridPane root=new GridPane();
		root.setPadding(new Insets(20));
		root.setHgap(10);
		root.setVgap(30);
		Button buttom1=new Button("please choose an option of them");
		buttom1.setStyle("-fx-background-color:beige ");
		buttom1.setPrefSize(200,10);
		
		Button buttom2=new Button("add new customer");
		buttom2.setStyle("-fx-background-color:blue");
		buttom2.setPrefSize(200,10);
		
		Button buttom3=new Button("Delet to customer");
		buttom3.setStyle("-fx-background-color:blue");
		buttom3.setPrefSize(200,10);
		
		Button buttom5=new Button("Update");
		buttom5.setStyle("-fx-background-color:blue");
		buttom5.setPrefSize(200,10);
		
		Button buttom4=new Button("serch of customer");
		buttom4.setStyle("-fx-background-color:blue");
		buttom4.setPrefSize(200,10);
		
		Button retur=new Button("return");
		retur.setStyle("-fx-background-color:Red");
		retur.setPrefSize(200,10);
		
		retur.setOnAction(this);
		root.add(buttom1, 0, 0);
		root.add(buttom2, 0, 1);
		root.add(buttom3, 0, 2);
		root.add(buttom5, 0, 3);
		root.add(buttom4, 0, 4);
		root.add(retur, 0, 5);
		
		Scene sc=new Scene(root,400,400);
		primrStage.setScene(sc);
		primrStage.show();
		primrStage.setTitle("CUSTOMER");
		stage2=primrStage;
		
		buttom2.setOnAction(e->{
			AddCustemer b=new AddCustemer();
			stage2.close();
			b.start(new Stage());
		});
		
		buttom3.setOnAction(e->{
			
		 DeleatCas b=new DeleatCas();
			stage2.close();
			b.start(new Stage());
		});
		
		buttom5.setOnAction(e->{
			Updaet t=new Updaet();
			stage2.close();
			t.start(new Stage());
		});
		buttom4.setOnAction(e->{
			Serch a=new Serch();
			stage2.close();
			a.start(new Stage());
			
		});
	}
	@Override
	public void handle(ActionEvent arg) {
		Main na=new Main();
		stage2.close();
		try {
			
			na.start(new Stage());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
