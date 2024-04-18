package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Home2Controller implements Initializable{

    @FXML
    private VBox edit_form;

    @FXML
    private VBox home_form;

    @FXML
    private Button menu_edit;

    @FXML
    private Button menu_home;

    @FXML
    private Button menu_logout;

    @FXML
    private Button menu_setting;

    @FXML
    private Button menu_work;

    @FXML
    private VBox setting_form;
    
    public void button_Home() {
    	home_form.setVisible(true);
    	setting_form.setVisible(false);
    	edit_form.setVisible(false);
    }
    public void button_Setting() {
    	home_form.setVisible(false);
    	setting_form.setVisible(true);
    	edit_form.setVisible(false);
    }
    public void button_Edit() {
    	home_form.setVisible(false);
    	setting_form.setVisible(false);
    	edit_form.setVisible(true);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
