package seleniumsessions;

public class StringUtils {
	
	
	private StringUtils() {}
	
	
	
	public static String getRandomEmail() {
		return "automation"+System.currentTimeMillis()+"@"+"opencat.com";
		//return "automation" + UUID.randomUUID()+"@opencart.com";
		
		//9999-999988-999888-
		
		//automation12121212121@opencat.com
		//automation1212121221221@opencat.com
		//automation1212121221121@opencat.com
		//automation12121212434121@opencat.com
		//automation12121215552121@opencat.com
		//testauto

		//Delete from user where email like '%automation%';
		
		
	}

}
