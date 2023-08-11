package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Objects;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaDB");
			EntityManager em = emf.createEntityManager();
            Pane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/FXMLMain.fxml")));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaDB");
		//EntityManager em = emf.createEntityManager();
	}
}
