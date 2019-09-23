package structural.adapter.adapter;

import structural.adapter.mediapackage.MediaPackage;
import structural.adapter.mediaplayer.MediaPlayer;

/**
 * Created by HauKute on 9/23/2019.
 */

/**
 * Purpose: format from MediaPackage to MediaPlayer
 * So this adapter will implement from MediaPlayer interface
 */
public class FormatAdapter implements MediaPlayer {

	private MediaPackage mediaPackage;

	public FormatAdapter(MediaPackage mediaPackage) {
		this.mediaPackage = mediaPackage;
	}

	public void play(String fileName) {
		System.out.print("Using Adapter --> ");
		mediaPackage.playFile(fileName);
	}
}
