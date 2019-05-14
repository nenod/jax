package org.nirkoren.maven.*;

public class TomcatPropsHandler {

	private static String appurl = System.getProperty("appurl");

	public static String getAppurl() {
		return appurl;
	}

}
