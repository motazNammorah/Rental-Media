package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class DeleatCas extends ActionEvent implements EventHandler<ActionEvent> {
	Stage stage4;
	TextField texx1=new TextField("19876");
	TextField texx2=new TextField();
	TextField texx3=new TextField();
	TextField texx4=new TextField();
	TextField texx5=new TextField();
	TextField texx6=new TextField();
	public void start(Stage primStage) {
		GridPane root=new GridPane();
		root.setPadding(new Insets(30));
		root.setVgap(20);
		root.setHgap(20);
		Label m1=new Label("Customer ID:");
		Label m2=new Label("Customer Name:");
		Label m3=new Label("Customer Address:");
		Label m4=new Label("Customer Mobile:");
		Label m5=new Label("plan:");
		Label m6=new Label("DoesExit:");
		
		Button buttonnn1=new Button("find");
		buttonnn1.setPrefSize(100,20);
		buttonnn1.setStyle("-fx-background-color:blue ");
		Button buttonnn2=new Button("delete");
		buttonnn2.setPrefSize(100,20);
		buttonnn2.setStyle("-fx-background-color:green ");
		Button Buttonn3=new Button("Back");
		Buttonn3.setPrefSize(100,20);
		Buttonn3.setStyle("-fx-background-color:red ");
		
		buttonnn1.setOnAction(e->{
			
			MediaRental t=new MediaRental();
		String id=texx1.getText();
		int c=-1;
		int i=0;
		while(i<t.customer.size()) {
			if(id.equals(t.customer.get(i).getId())) {
				c=i;
				break;
				
			}
			i++;
		}
		
		if(c==-1) {
			texx6.setText("not exit to deleat it");
		}
		else
		{
			

			texx2.setText(t.customer.get(c).name);
			texx3.setText(t.customer.get(c).addraes);
			texx5.setText(t.customer.get(c).plan);
			texx4.setText(t.customer.get(c).mopileNumbner);
			texx6.setText("have information");
			buttonnn2.setOnAction(this);
			
			
		}
		
		});
		
		root.addRow(0, m1,texx1);
		root.addRow(1, m2,texx2);
		root.addRow(2, m3,texx3);
		root.addRow(4, m4,texx4);
		root.addRow(5, m5,texx5);
		root.addRow(7, m6,texx6);
		root.add(buttonnn1, 0, 6);
		root.add(buttonnn2, 1, 6);
		root.add(Buttonn3, 2, 6);
		
		Scene sc=new Scene(root,400,500,Color.PALEGOLDENROD);
		primStage.setScene(sc);
		primStage.setTitle("Delete");
		primStage.show();
		
		stage4=primStage;
		Buttonn3.setOnAction(e->{
			CastumerName r=new CastumerName();
			stage4.close();
			try {
				r.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		
		texx3.setText(null);
		texx2.setText(null);
		texx1.setText(null);
		texx4.setText(null);
		texx5.setText(null);
	}

}