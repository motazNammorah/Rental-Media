
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
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Updaet extends Application implements EventHandler<ActionEvent> {
	Stage stage5;
	TextField texc1=new TextField();
	TextField m2=new TextField();
	TextField m3=new TextField();
	TextField m4=new TextField();
	TextField m6=new TextField();
	public void start(Stage prStage) {
		GridPane root=new GridPane();
        root.setPadding(new Insets(30));
		root.setHgap(20);
		root.setVgap(20);
		Label la1=new Label("Customer ID:");
		Label la2=new Label("Customer Name:");
		Label la3=new Label("Customer Addres:");
		Label la4=new Label("Customer Mobile:");
		TextField r1=new TextField("19876");
		Label la5=new Label("the plan:");
		Label la6=new Label("DoesExit : ");
		
		Button b1=new Button("update");
		b1.setPrefSize(100,20);
		b1.setStyle("-fx-background-color:blue ");
		Button find=new Button("find");
		find.setPrefSize(100,20);
		find.setStyle("-fx-background-color:green ");
		
		find.setOnAction(e->{
			MediaRental xx=new MediaRental();
			int  n=-1;
			
			int i=0;
			while(i<xx.customer.size()) {
				if(xx.customer.get(i).id.equals(r1.getText())) {
					n=i;
					break;
				}
				i++;
			}
			if(n==-1) {
				m6.setText("no informiton to update it");
			}
			else
			{
				System.out.println("Done its exit  ");
				
				m2.setText(xx.customer.get(n).addraes);
			
				texc1.setText(xx.customer.get(n).name);
		
				m4.setText(xx.customer.get(n).plan);
				
				m3.setText(xx.customer.get(n).mopileNumbner);
				m6.setText("this id have informtion you can Update it");
				b1.setOnAction(e1->{
				int	 m=-1;
					int j=0;
					while(j<xx.customer.size()) {
						if(xx.customer.get(j).id.equals(r1.getText())) {
							m=j;
							break;
						}
						j++;
					}
				
				
					xx.customer.get(m).setName(texc1.getText());
					xx.customer.get(m).setMopileNumbner(m3.getText());
					
					xx.customer.get(m).setAddraes(m2.getText());
					xx.customer.get(m).setPlan(m4.getText());
					
					//System.out.println(ro.array1.get(h).getName());
					
				});
			}
		});
		
		Button b2=new Button("Back");
		b2.setPrefSize(100,20);
		b2.setStyle("-fx-background-color:red ");
		
		root.addRow(0, la1,r1);
		root.addRow(1, la2,texc1);
		root.addRow(2, la3,m2);
		root.addRow(4, la4,m3);
		root.addRow(5, la5,m4);
		root.add(b1, 0, 6);
		root.add(b2, 1, 6);
		root.add(find, 2, 6);
		root.addRow(7, la6, m6);
		Scene sc=new Scene(root,400,400);
		prStage.setScene(sc);
		prStage.setTitle("Update Castomer");
		stage5=prStage;
		prStage.show();
		
		b2.setOnAction(this);
	}

	@Override
	public void handle(ActionEvent arg0) {
	CastumerName v=new CastumerName();
	stage5.close();
	try {
		v.start(new Stage());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}