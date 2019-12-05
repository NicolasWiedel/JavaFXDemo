package javafx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class UIContent extends BorderPane{
	
	private Label header;
	
	private TextField fldVorname;
	private TextField fldNachname;
	
	private Button btnKundenAnlegen;
	
	private ProgressBar progress;
	
	private ListView<String> kundenListe;
	
	public UIContent(){
		header = new Label("JavaFX Demo!");
		header.setStyle("-fx-font-size: 20px;");
		header.setAlignment(Pos.CENTER);
		header.setMaxWidth(Double.MAX_VALUE);
		header.setBackground(new Background(new BackgroundFill(Color.AQUA, null, null)));
		setTop(header);
		
		fldVorname = new TextField();
		fldNachname = new TextField();
		
		btnKundenAnlegen = new Button("Kunden anlegen");
		btnKundenAnlegen.setMaxWidth(Double.MAX_VALUE);
		
		GridPane kundenErstellung = new GridPane();
		kundenErstellung.add(new Label("Vorname"), 0, 0);
		kundenErstellung.add(fldVorname, 1, 0);
		kundenErstellung.add(new Label("Nachname"), 0, 1);
		kundenErstellung.add(fldNachname, 1, 1);
		kundenErstellung.add(btnKundenAnlegen, 0, 2, 2, 1);
		
		Insets abstand = new Insets(5, 0, 0, 0);
		GridPane.setMargin(fldVorname, abstand);
		GridPane.setMargin(fldNachname, abstand);
		GridPane.setMargin(btnKundenAnlegen, abstand);
		
		kundenErstellung.setBorder(
				new Border(new BorderStroke(null, BorderStrokeStyle.NONE, null, new BorderWidths(10))));
		
		setLeft(kundenErstellung);
		
		progress = new ProgressBar();
		progress.setMaxWidth(Double.MAX_VALUE);
		setBottom(progress);
		
		kundenListe = new ListView<>();
		
	}

}
