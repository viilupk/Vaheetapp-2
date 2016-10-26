import javafx.application.Application;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 * Created by Admin on 26.10.2016.
 */
public class main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene bronn = new Scene(vbox, 300, 300);
        primaryStage.setScene(bronn);
        primaryStage.show();

        Label start = new Label("Millisest rendipunktist soovite autot rentida");
        ChoiceBox ad = new ChoiceBox(FXCollections.observableArrayList("Alfa", "Bravo", "Charlie", "Delta")
        );
        Button submitButton = new Button("Edasi");

        vbox.getChildren().addAll(start, ad, submitButton);

        submitButton.setOnAction(event ->{
            System.out.println("Hetkel ei ole võimalik autosid rentida. Süsteem on välja töötamisel. Palun kannatust!");
            VBox vbox2 = new VBox();
            Scene edasi = new Scene(vbox2, 500, 100);
            primaryStage.setScene(edasi);
            primaryStage.show();

            Label edasitekst = new Label("Hetkel ei ole võimalik autosid rentida. Süsteem on välja töötamisel. Palun kannatust!");
            vbox2.getChildren().addAll(edasitekst);
            primaryStage.show();
        });


    }
}
