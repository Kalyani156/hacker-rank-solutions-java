/**
Given n  names and phone numbers, assemble a phone book that maps friends' names 
to their respective phone numbers. You will then be given an unknown number
of names to query your phone book for. For each name  queried, print
the associated entry from your phone book on a new line in the form name=phoneNumber;
if an entry for name  is not found, print Not found instead.
**/



import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DictionariesandMaps {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> data = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			data.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			List<String> list = new LinkedList<String>();
			if (data.get(s) == null) {
				list.add("Not found");
			} else {
				list.add(s + "=" + data.get(s));
			}
			for (String finalResult : list) {
				System.out.println(finalResult);
			}
		}

		in.close();
	}
}
