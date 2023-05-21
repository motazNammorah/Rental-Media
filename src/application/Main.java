
package application;
import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent>{
	
	Stage stage1;
	public void start(Stage primaryStage) {
		    primaryStage.setMaximized(true);
		    
		    
			BorderPane root=new BorderPane();
			root.setPadding(new Insets(20));
			VBox vb=new VBox(70);
			Button button1=new Button("   CUSTOMER   ");
			button1.setOnAction(this);
			button1.setPrefSize(100,100);
			button1.setStyle("-fx-background-color:blue");
			button1.setAlignment(Pos.CENTER);
			
			Button button2=new Button("   MEDIA      ");
			button2.setAlignment(Pos.CENTER);
			button2.setPrefSize(100,100);
			Button button3=new Button("  RENT          ");
			button2.setStyle("-fx-background-color:blue");
		
			button3.setStyle("-fx-background-color:blue");
			StackPane st=new StackPane();
			button3.setAlignment(Pos.CENTER);
			button3.setPrefSize(100,100);
			
			Label lab=new Label("Rental Media System");
			st.getChildren().add(lab);
			
		    vb.getChildren().addAll(button1,button2,button3);
			
			ImageView image=new ImageView("chris_hoy_signed_team_gb_photo_4.png");
			image.setFitHeight(500);
			image.setFitWidth(500);
			
			Button la=new Button("add",image);
			
			root.setLeft(vb);
			root.setBottom(st);
			root.setRight(la);
			
			Scene scene = new Scene(root,500,300);			
			primaryStage.setScene(scene);
			primaryStage.setTitle("JAVA FX PROJECT");
			
			stage1=primaryStage;
			button3.setOnAction(e->{
				Rent v=new Rent();
				stage1.close();
				v.start(new Stage());
				
			});
			
			primaryStage.show();
			stage1=primaryStage;
			button2.setOnAction(e->{
				MMedia m=new MMedia();
				stage1.close();
				m.start(new Stage());
			});
			
			button1.setOnAction(e->{
				CastumerName ca=new CastumerName();
				stage1.close();
				try {
					ca.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent arg0) {
	
	}
}
