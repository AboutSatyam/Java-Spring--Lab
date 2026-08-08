package practiceProblem89to98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap98 {

	public static void main(String[] args) {
		Map<String, String> countryMap = new HashMap<>();
		countryMap.put("Bharat", "New Delhi");
		countryMap.put("Pakistan", "Islamabad");
		countryMap.put("China", "Beijing");
		countryMap.put("Nepal", "Kathmandu");
		countryMap.put("Bhutan", "Thimphu");
		countryMap.put("Bangladesh", "Dhaka");
		countryMap.put("Myanmar", "Naypyidaw");
		countryMap.put("Sri Lanka", "Sri Jayawardenepura Kotte");
		countryMap.put("Afghanistan", "Kabul");
		countryMap.put("Maldives", "Malé");

		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter The Country Name :");
		String country = Scan.next();

		if (countryMap.containsKey(country)) {
			System.out.printf("Capital Of %s is %s", country, countryMap.get(country));
		} else {
			System.out.println("Sorry Result Not Found");
		}
	}

}
