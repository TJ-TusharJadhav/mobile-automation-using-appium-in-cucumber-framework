package Utility;
import org.apache.commons.lang3.RandomStringUtils;

import Testbase.Testbase;

public class EmailGen extends Testbase {

	public static void main(String[] args) {
		String Email = RandomStringUtils.randomNumeric(4);
		System.out.println("tj."+Email+"@mailinator.com");

	}
public static  String mailgerator() {
	
	String Email = RandomStringUtils.randomNumeric(4);
	
	return "tj."+Email+"@mailinator.com";

}
}
