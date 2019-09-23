package structural.adapter.mediapackage;

/**
 * Created by HauKute on 9/23/2019.
 */
public class MP4 implements MediaPackage {
	public void playFile(String fileName) {
		System.out.println("Playing MP4 file " + fileName);
	}
}
