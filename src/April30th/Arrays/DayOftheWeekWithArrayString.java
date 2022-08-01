package April30th.Arrays;

import java.util.Arrays;

public class DayOftheWeekWithArrayString {

	public static void main(String[] args) {
		String[] Days = { "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday" };
		System.out.println(Arrays.toString(Days));

		String dayWithMostCharedters = "";
		for (String day : Days) {
			if (day.length() >= dayWithMostCharedters.length()) {
				dayWithMostCharedters = day;
			}

		}
		System.out.println("Day with Most charters :" +dayWithMostCharedters);

		for(int i=0;i<=Days.length-1;i++) {
			System.out.println(Days[i]);
		}
		
		for(int i=Days.length-1;i>=0;i--) {
			System.out.println(Days[i]);
		}
	}

}
