import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.*; 
import javafx.event.*; 
import javafx.scene.Parent; 
import javafx.scene.control.*; 
import javafx.scene.paint.Color;
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.canvas.*;
import javafx.geometry.Point2D;
import javafx.scene.shape.*;
import javafx.fxml.FXMLLoader;

public class StockTracker extends Application {
      
      @Override
      public void start(Stage stage) throws Exception {
         //setting title
         stage.setTitle("StockTracker"); 
      
         //connecting root to the fxml file that I have in the folder 
         Parent root = FXMLLoader.load(getClass().getResource("StockTracker.fxml"));
        
         //making the scene and specifying the ratio of px
         Scene scene = new Scene(root, 700, 500);
        
         
         stage.setScene(scene); 
                  
         stage.show(); 
         }
         
      public static void main(String[] args){
         launch(args);
         }
   }