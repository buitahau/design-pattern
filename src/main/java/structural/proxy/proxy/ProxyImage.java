package structural.proxy.proxy;

import structural.proxy.realservice.Image;
import structural.proxy.realservice.RealImage;

/**
 * Created by HauKute on 10/15/2019.
 */
public class ProxyImage implements Image {
	private Image realImage;
	private String url;

	public ProxyImage(String url) {
		this.url = url;
		System.out.println("Image unloaded: " + this.url);
	}

	public void showImage() {
		if (realImage == null) {
			realImage = new RealImage(this.url);
		} else {
			System.out.println("Image already existed: " + this.url);
		}
		realImage.showImage();
	}
}
