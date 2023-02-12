import java.util.Arrays;
import java.util.List;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    //System.out.println(Arrays.asList(intArray));
    // Arrays.sort(intArray,.......)
    String[] strings = {"abc", "ab", "teee", "output", "abcde", "anotheeString"};
    //QuestionOne(strings);
    QuestionFive();
  }
  private static String[] createList() {
    return new String []{
            "apple",
            "banana",
            "cucumber",
            "dill",
            "eggplant",
            "foil",
            "ganache",
            "him",
            "ink"
    };
  }

  static void QuestionOne (String[] strings){
    System.out.println("Initial: " + Arrays.asList(strings));

    Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
    System.out.println("Shortest to longest: " + Arrays.asList(strings));

    Arrays.sort(strings, (s1, s2) -> s2.length() - s1.length());
    System.out.println("Longest to shortest: " + Arrays.asList(strings));

    Arrays.sort(strings, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
    System.out.println("By first character: " + Arrays.asList(strings));

    Arrays.sort(strings, (s1, s2) -> StringUtils.eCounter(s2) - StringUtils.eCounter(s1));
    System.out.println("By e's: " + Arrays.asList(strings));

    Arrays.sort(strings, String::compareTo);

    Arrays.sort(strings, StringUtils::eChecker);
    System.out.println("By e's [method reference]: " + Arrays.asList(strings));
  }

  static void QuestionFive() {
    List<String> words = List.of(createList());
    List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
    List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
    List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);

    System.out.println(words);
    System.out.println(shortWords);
    System.out.println(wordsWithB);
    System.out.println(evenLengthWords);

  }

  static void QuestionSix() {

  }

}

