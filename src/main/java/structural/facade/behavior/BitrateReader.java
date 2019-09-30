package structural.facade.behavior;

import structural.facade.codec.Codec;
import structural.facade.entities.VideoFile;

/**
 * Created by HauKute on 10/1/2019.
 */
public class BitrateReader {
	public static VideoFile read(VideoFile file, Codec codec) {
		System.out.println("BitrateReader: reading file...");
		return file;
	}

	public static VideoFile convert(VideoFile buffer, Codec codec) {
		System.out.println("BitrateReader: writing file...");
		return buffer;
	}
}
