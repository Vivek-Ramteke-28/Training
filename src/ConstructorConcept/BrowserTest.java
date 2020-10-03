package ConstructorConcept;

import java.util.ArrayList;

public class BrowserTest {

	public static void main(String[] args) {

		Browser b1 = new Browser("FF", "ABC");
		System.out.println(b1.browserName + " " + b1.vendorName);

		Browser b2 = new Browser("Opera", "XYZ", 85.00f);
		System.out.println(b2.browserName + " " + b2.vendorName + b2.currentVersion);

		ArrayList<String> plugins = new ArrayList<String>();
		plugins.add("ABP");
		plugins.add("LastPass");
		plugins.add("Privacy Badger");
		plugins.add("Google Toolbar");
		plugins.add("ChroPath");

		Browser b3 = new Browser("Chrome", "PQR", 80.0f, plugins);
		System.out.println(b3.browserName + " " + b3.vendorName + " " + b3.currentVersion + " " + b3.supportedplugins);

	}

}
