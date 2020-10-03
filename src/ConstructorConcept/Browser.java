package ConstructorConcept;

import java.util.ArrayList;

public class Browser {

	String browserName;
	String vendorName;
	float currentVersion;
	ArrayList<String> supportedplugins;

	public Browser(String browsername, String vendorName) {
		this.browserName = browsername;
		this.vendorName = vendorName;
	}

	public Browser(String browsername, String vendorName, float currentVersion) {
		this.browserName = browsername;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public Browser(String browsername, String vendorName, float currentVersion, ArrayList<String> supportedBrowser) {
		this.browserName = browsername;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.supportedplugins = supportedBrowser;
	}

}
