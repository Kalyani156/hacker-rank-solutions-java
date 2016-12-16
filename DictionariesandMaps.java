
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
			for (String s1 : list) {
				System.out.println(s1);
			}
		}

		in.close();
	}
}
