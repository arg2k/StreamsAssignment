import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh",
				"abcdefghi", "abcdefghij", "abcdefghijk");
		List<String> output = new ArrayList<>();

		output = strings.stream().filter(string -> string.length() > 5 && string.length() < 8)
				.collect(Collectors.toList());
		System.out.println(output);
	}

}