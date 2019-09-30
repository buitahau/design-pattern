package structural.facade.codec;

import structural.facade.entities.VideoFile;
import structural.facade.enums.FileType;

/**
 * Created by HauKute on 10/1/2019.
 */
public class CodecFactory {
	private CodecFactory() {

	}

	public static Codec getInstance(VideoFile file) {
		String type = file.getCodecType();
		return getInstance(type);
	}

	public static Codec getInstance(String type) {
		if(type.toUpperCase().equals(FileType.MP4.toString())) {
			System.out.println("CodecFactory: extracting mp4 audio...");
			return new MP4CompressionCodec();
		}else {
			System.out.println("CodecFactory: extracting ogg audio...");
			return new OggCompressionCodec();
		}
	}
}
