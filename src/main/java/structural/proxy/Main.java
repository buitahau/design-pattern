package structural.proxy;

import structural.proxy.proxy.ProxyImage;
import structural.proxy.realservice.Image;

/**
 * Created by HauKute on 10/15/2019.
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Init proxy image: ");
		ProxyImage proxyImage = new ProxyImage("https://gpcoder.com/favicon.ico");

		System.out.println("---");
		System.out.println("Load Image 1st: ");
		loadImage(proxyImage);

		System.out.println("---");
		System.out.println("Load Image 2st: ");
		loadImage(proxyImage);

	}

	private static void loadImage(Image image) {
		long startTime = System.currentTimeMillis();
		image.showImage();
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.print("Time elapsed: " + estimatedTime + "ms\n");
	}
}
