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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class printMedia extends Application implements EventHandler<ActionEvent> {
	public void start(Stage primaryStage) {
		Stage stage12;
		primaryStage.setMaximized(true);
		GridPane pane=new GridPane();
		stage12=primaryStage;
		
	    pane.setVgap(20);
	    pane.setHgap(20);
		pane.setPadding(new Insets(30));
		TextField textF=new TextField();
		Label la=new Label("code is : ");
		Button button=new Button("print : ");
		TextArea textArea=new TextArea();
		Button ba=new Button("back");
		ba.setStyle("-fx-background-color:green");
		ba.setPrefSize(200,10);
		ba.setOnAction(e->{
			MMedia back=new MMedia();
			stage12.close();
			back.start(new Stage());
		});
		
		button.setOnAction(e->{
			MediaRental r=new MediaRental();
			for(int i=0;i<r.media.size();i++) {
				if(r.media.get(i) instanceof Game) {
					if(((Game)r.media.get(i)).getTheCode().compareTo(textF.getText())==0){
						textArea.setText(((Game)r.media.get(i)).toString());
					}
					
				}
				else if(r.media.get(i) instanceof Album) {
					if(((Album)r.media.get(i)).getCode().compareTo(textF.getText())==0){
						textArea.setText(((Album)r.media.get(i)).toString());
						}
					}
				else if(r.media.get(i) instanceof Movie) {
					if(((Movie)r.media.get(i)).getTheCode().compareTo(textF.getText())==0){
						textArea.setText(((Movie)r.media.get(i)).toString());
						}
					}
			}
		
		});
		pane.addRow(2,la,textF);
		pane.addRow(3, button,textArea);
		pane.addRow(4, ba);
		Scene r=new Scene(pane,500,500);
		primaryStage.setScene(r);
		primaryStage.setTitle("printAllMedia");
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
