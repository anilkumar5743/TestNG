import CommonMethods.CommonMethods;

public class Commontest {
public static void main(String[] args) {
	CommonMethods obj = new CommonMethods();
	obj.launchBrowser("chrome");
	obj.openURL("https://magnus.jalatechnologies.com/");
	obj.login("training@jalaacademy.com", "jobprogram");

	
}
}
