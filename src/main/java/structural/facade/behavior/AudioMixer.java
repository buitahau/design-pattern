package structural.facade.behavior;

import structural.facade.entities.VideoFile;

import java.io.File;

/**
 * Created by HauKute on 10/1/2019.
 */
public class AudioMixer {
	public File fix(VideoFile result){
		System.out.println("AudioMixer: fixing audio...");
		return new File("tmp");
	}
}
