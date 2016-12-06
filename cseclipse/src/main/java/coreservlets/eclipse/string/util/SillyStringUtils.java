package coreservlets.eclipse.string.util;

public class SillyStringUtils {

	private static final String PIG_LATIN_SUFFIX = "ay";
	private static final String ERKEL_SUFFIX = ", did I do thaaaaat?";

	// ===================================================================

	public static String toPigLatin(String words) {
		if (CoreUtils.isNullOrEmpty(words)) {
			return words;
		}
		String pigLatin = "";
		String[] wordArray = words.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			String word = wordArray[i];
			String firstLetter = word.substring(0, 1);
			String suffix = firstLetter + PIG_LATIN_SUFFIX;
			String root = word.substring(1);
			String pigLatinWord = root + suffix;
			pigLatin += pigLatinWord + " ";
		}
		String cleanPigLatin = pigLatin.toLowerCase().trim();
		return cleanPigLatin;
	}

	public static String steveErkelize(String string) {
		if (CoreUtils.isNullOrEmpty(string)) {
			string = "You're pretty quiet";
		}
		String erkeled = string + ERKEL_SUFFIX;
		return erkeled;
	}

	public static String encodlerize(String string) {
		if (CoreUtils.isNullOrEmpty(string)) {
			return string;
		}
		String encodlerized = string.replace('e', '3');
		encodlerized = encodlerized.replace('E', '3');
		encodlerized = encodlerized.replace('s', '$');
		encodlerized = encodlerized.replace('S', '$');
		encodlerized = encodlerized.replace('a', '@');
		encodlerized = encodlerized.replace('A', '@');
		encodlerized = encodlerized.replace('z', '2');
		encodlerized = encodlerized.replace('Z', '2');
		return encodlerized;
	}

	public static String reverse(String string) {
		if (CoreUtils.isNullOrEmpty(string)) {
			return string;
		}
		String reverse = "";
		for (int i = 0; i < string.length(); i++) {
			String letter = String.valueOf(string.charAt(i));
			reverse = letter + reverse;
		}
		return reverse;
	}

	public static String extremeCamelCase(String string) {
		if (CoreUtils.isNullOrEmpty(string)) {
			return string;
		}
		String extremeCamelCase = "";
		for (int i = 0; i < string.length(); i++) {
			String letter = String.valueOf(string.charAt(i));
			letter = (i % 2 == 0) ? letter.toLowerCase() : letter.toUpperCase();
			extremeCamelCase = extremeCamelCase + letter;
		}
		return extremeCamelCase;
	}

}
