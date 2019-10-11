package structural.proxy.realservice;

import structural.proxy.entity.ImageEntity;

/**
 * Created by HauKute on 10/15/2019.
 */
public class RealImage implements Image {
	private ImageEntity entity;

	public RealImage(String url) {
		this.entity = new ImageEntity(url, url);
		System.out.println("Image loaded: " + this.entity.getUrl());
		experienceNetworkLatency();
	}


	public void showImage() {
		System.out.println("Image showed: " + this.entity.getUrl());
	}

	// -----------------------------------------------------------------------
	// Fake methods to simulate network activity. They as slow as a real life.
	private void experienceNetworkLatency() {
		int randomLatency = random(5, 10);
		for (int i = 0; i < randomLatency; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private int random(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
}
