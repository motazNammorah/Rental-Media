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

public class DeleatMove   extends Application implements EventHandler<ActionEvent>{
	TextField tf1=new TextField();
	TextField tf2=new TextField();
	TextField tf3=new TextField();
	TextField tf4=new TextField();
	TextField tf5=new TextField();
	TextField tf6=new TextField();
	Stage h;
	public void start(Stage primaryStage) {
		GridPane pane=new GridPane();
		h=primaryStage;
		pane.setVgap(30);
		pane.setHgap(30);
		pane.setPadding(new Insets(20));
		Label la=new Label("Code : ");
		Label la1=new Label(" the Title");
		Label la2=new Label("number of copies");
		Label la3=new Label("rating : ");
		
		Label la5=new Label("ErrorMassge : ");
	
		Button oi=new Button("back");
		oi.setOnAction(this);
		Button button2=new Button("find");
		Button button3=new Button("Deleat");
		test(button2,button3);
		pane.addRow(0, la,tf5);
		pane.addRow(1, la1, tf2);
		pane.addRow(2, la2,tf3);
		pane.addRow(3, la3,tf4);
		
		pane.addRow(7, la5,tf1);
		pane.addRow(5,oi,button2,button3);
		Scene sc=new Scene(pane,400,400);
		primaryStage.setScene(sc);
		primaryStage.setTitle(" Deleat ALbum");
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
				if(r.media.get(i) instanceof Movie) {
					if(((Movie)r.media.get(i)).theCode.compareTo(tf5.getText())==0) {
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
				tf2.setText(((Movie)r.media.get(h)).title);
				String n=((Movie)r.media.get(h)).getCopiesAvailable()+"";
				tf3.setText(n);
				String c=((Movie)r.media.get(h)).rating;
				tf4.setText(c);
				
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
