package _01_StringBuilder;

public class _03_StringBuilder {

	public static String append(String str, char[] characters) {
		StringBuilder builder = new StringBuilder(str);
		builder.append(characters);
		return builder.toString();
	}

	public static String reverse(String str) {
		StringBuilder helper = new StringBuilder(str);
		helper.reverse();
		return helper.toString();
	}

	public static String insert(String str, int index, char newChar) {
		StringBuilder apprentice = new StringBuilder(str);
		apprentice.insert(index, newChar);
		return apprentice.toString();
	}

	public static String delete(String str, int startIndex, int endIndex) {
		StringBuilder employee = new StringBuilder(str);
		employee.delete(startIndex, endIndex);
		return employee.toString();
	}
}