package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			
			//Crendo elementos (nodos)
			Text texto = new Text("Cual montas?");
			Button boton = new Button();
			boton.setText("Encamar");
			
			//Poner cuadro de texto
			TextField txtFldNombre = new TextField("Ingrese nombre a Encamar");
			txtFldNombre.setFont(new Font("Papyrus", 80));
			
			Label lblNombre = new Label("Nombre: ");
			
			boton.setOnAction( evt -> System.out.println("Encame en Proceso!!!"));
			VBox boxVertical = new VBox();
			
			//Creando la GRILLA (Cuadricula/Malla)
			GridPane grilla = new GridPane();
			grilla.add(lblNombre, 0, 0);
			grilla.add(txtFldNombre, 1, 0);
			grilla.add(boton, 1, 1);
			
			//Visualizar la forma de la grilla
			grilla.setGridLinesVisible(false);
			
			//Grilla Poner GAP
			grilla.setHgap(20);
			
			boxVertical.getChildren().addAll(texto, grilla);
			
			root.getChildren().add(boxVertical);
					
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Pantalla de Encame");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
