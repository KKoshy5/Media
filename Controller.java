package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.fxml.Initializable;


public class Controller implements Initializable {
      @FXML
      private MediaView mediaView;
      private File file;
      private Media media;
      private MediaPlayer mediaPlayer;
      
      
    
     
		
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		file = new File("717902304.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		mediaPlayer.setAutoPlay(true);
	}
      

	
}
