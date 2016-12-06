package coreservlets.eclipse.string.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CoreUtils {

	public static final List<String> VOWELS = new ArrayList<String>();

	static {
		VOWELS.add("a");
		VOWELS.add("A");
		VOWELS.add("e");
		VOWELS.add("E");
		VOWELS.add("i");
		VOWELS.add("I");
		VOWELS.add("o");
		VOWELS.add("O");
		VOWELS.add("u");
		VOWELS.add("U");
	}

	public static String getMethodName() {
		String methodName = Thread.currentThread().getStackTrace()[1].getClassName();
		return methodName;
	}

	public static <EntityType> boolean isNullOrEmpty(EntityType entity) {
		if (entity == null) {
			return true;
		}
		if (entity instanceof String) {
			return ((String) entity).isEmpty();
		}
		if (entity instanceof Collection) {
			return ((Collection<?>) entity).isEmpty();
		}
		if (entity instanceof Map) {
			return ((Map<?, ?>) entity).isEmpty();
		}
		if (entity instanceof Array) {
			return Array.getLength(entity) == 0;
		}
		else {
			return (entity == null);
		}
	}

	public static boolean isStartsWithVowel(String string) {
		if (CoreUtils.isNullOrEmpty(string)) {
			return false;
		}
		String firstLetter = string.substring(0, 0);
		if (VOWELS.contains(firstLetter)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean isVowel(char letter) {
		if (VOWELS.contains(String.valueOf(letter))) {
			return true;
		}
		else {
			return false;
		}
	}

}
