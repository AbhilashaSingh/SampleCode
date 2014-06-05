package infinitec.eleventh.remindme.utils;

/*
 * 
 * @author Abhilasha Singh
 * Helper Main Class To Test ValidateMessage class.(Not Required In Project)
 */
public class ValidateMessageMain {

	public static void main(String args[]) {
		String message = "Namaste! Your bill dated 12-Apr-14 of Rs 1589 for your airtel fixedline 08042132154 is due on 01-May-14. ignore if paid.";
		ValidateMessage val = new ValidateMessage();
		boolean isValidVal = val.isValid(message);
		System.out.println(isValidVal);
	}

}
