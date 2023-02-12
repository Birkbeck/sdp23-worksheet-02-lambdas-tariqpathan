import java.util.Arrays;
import java.util.Comparator;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    System.out.println(Arrays.asList(intArray));
    // Arrays.sort(intArray,.......)
    String[] strings = {"abc", "ab", "teee", "output", "abcde", "anotheeString"};
    System.out.println("Initial: " + Arrays.asList(strings));
    ExerciseOne(strings);
  }

  static void ExerciseOne (String[] strings){
    Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
    System.out.println("Shortest to longest: " + Arrays.asList(strings));

    Arrays.sort(strings, (s1, s2) -> s2.length() - s1.length());
    System.out.println("Longest to shortest: " + Arrays.asList(strings));

    Arrays.sort(strings, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
    System.out.println("By first character: " + Arrays.asList(strings));

    Arrays.sort(strings, (s1, s2) -> eCounter(s2) - eCounter(s1));
    System.out.println("By e's: " + Arrays.asList(strings));

    Arrays.sort(strings, String::compareTo);

    Arrays.sort(strings, Outline::eChecker);
    System.out.println("By e's [method reference]: " + Arrays.asList(strings));

  }

  static int eCounter(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'e') count += 1;
    }
    return count;
  }

  private static int eChecker(String s1, String s2) {
    return eCounter(s2) - eCounter(s1);
  }
}

