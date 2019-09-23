package structural.adapter.mediaplayer;

/**
 * Created by HauKute on 9/23/2019.
 */
public class MP3 implements MediaPlayer {
	public void play(String fileName) {
		System.out.println("Playing MP3 file " + fileName);
	}
}
