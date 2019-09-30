package structural.facade.entities;

/**
 * Created by HauKute on 10/1/2019.
 */
public class VideoFile {
	private String name;
	private String codecType;

	public VideoFile(String name) {
		this.name = name;
		this.codecType = name.substring(name.indexOf(".") + 1);
	}

	public String getCodecType() {
		return codecType;
	}

	public String getName() {
		return name;
	}
}
