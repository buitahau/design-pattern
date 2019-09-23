package structural.adapter.mediapackage;

/**
 * Created by HauKute on 9/23/2019.
 */
public class VLC implements MediaPackage {
	public void playFile(String fileName) {
		System.out.println("Playing VLC file " + fileName);
	}
}
