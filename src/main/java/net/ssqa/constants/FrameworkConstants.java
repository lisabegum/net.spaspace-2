package net.ssqa.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants() {}
	
	private final static String RESOURCEPATH=System.getProperty("user.dir")+"/src/test/resources";
	private final static String CHROMEDRIVERPATH=RESOURCEPATH+"/browser/chromedriver.exe";
	private final static String CONFIGFILEPATH=RESOURCEPATH+"/config/config.properties";
	private static final int EXPLICITWAIT=40;
	private static final String IMGPATH="D:\\WORKSPACE\\2020\\net.spaspace\\src\\test\\resources\\photos\\Test.jpg";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
	
	public static String getConfigFilePath()
	{
		return CONFIGFILEPATH;
	}
	
	public static int getExplicitWait() {
		return EXPLICITWAIT;
	}

	public static String getImgpath() {
		return IMGPATH;
	}
	
	

}
