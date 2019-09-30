package structural.facade;

import structural.facade.facade.VideoConversionFacade;

import java.io.File;

/**
 * Created by HauKute on 10/1/2019.
 */
public class Main {
	public static void main(String[] args) {
		VideoConversionFacade converter = new VideoConversionFacade();
		File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
	}
}
