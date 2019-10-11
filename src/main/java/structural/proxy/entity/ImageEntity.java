package structural.proxy.entity;

/**
 * Created by HauKute on 10/15/2019.
 */
public class ImageEntity {
	private String url;
	private String title;

	public ImageEntity(String url, String title) {
		this.url = url;
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

}
