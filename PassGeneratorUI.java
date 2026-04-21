import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class PassGeneratorUI extends Application {


    @Override
    public void start (Stage palco){

        palco.setTitle("Password Generator");

        Label passSize = new Label("Tap the password size (suggested: 8)");
        TextField passSizeField = new TextField();
        passSizeField.setText(8);

        Label generatedPass = new Label("Your password is: ");
        TextField generatedPassField = new TextField();
        generatedPassField.setEditable(false);

        Button launchButton = new Button("Generate now!");
        launchButton.setOnAction(e -> {

            int tapNum = Integer.parseInt(passSizeField.getText());
            String passoword = PassGenerator.generatePass(tapNum);
            generatedPassField.setText(passoword);

        });

        VBox vbox = new VBox(passSize, passSizeField, launchButton, generatedPass, generatedPassField);
        Scene cena = new Scene(vbox, 200,200);
        palco.setScene(cena);
        palco.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
