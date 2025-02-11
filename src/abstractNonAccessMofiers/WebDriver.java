package abstractNonAccessMofiers;

public interface WebDriver {
	
	public void click();
	
	public void get(String url);
	
	public void sendKeys(String text);
	
	public default void getIncognitoMode() {
		System.out.println("Incognito mode is not applicable");
		getDefaultInconitoMode();
	}	
	
	public static void takeScreenshot() {
		System.out.println("Take Screenshot of Window");
	}
	
	private void getDefaultInconitoMode() {
		System.out.println("Change settings to Incognito");
		System.out.println("Launch the browser");
	}
	

}
