package structural.adapter;

import structural.adapter.adapter.FormatAdapter;
import structural.adapter.mediapackage.MP4;
import structural.adapter.mediapackage.MediaPackage;
import structural.adapter.mediapackage.VLC;
import structural.adapter.mediaplayer.MP3;
import structural.adapter.mediaplayer.MediaPlayer;

/**
 * Created by HauKute on 9/23/2019.
 */
public class Main {
	public static void main(String[] args){

		MediaPlayer playerMP3 = new MP3();
		playerMP3.play("file.mp3");

		MediaPackage mp4 = new MP4();
		mp4.playFile("file.mp4");
		MediaPlayer playerMP4 = new FormatAdapter(mp4);
		playerMP4.play("file.mp4");

		MediaPackage vlc = new VLC();
		vlc.playFile("file.vlc");
		MediaPlayer playerVLC = new FormatAdapter(vlc);
		playerVLC.play("file.mp4");

	}
}
