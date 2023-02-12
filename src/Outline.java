import java.util.Arrays;
import java.util.List;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    System.out.println(Arrays.asList(intArray));
//    Arrays.sort(intArray,.......)
    QuestionOne();
    QuestionThree();
    QuestionFour();
    QuestionFive();
    QuestionSixStrings();
    QuestionSixInts();
    QuestionSeven();
    QuestionEight();
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

  static void QuestionOne (){
    String[] strings = {"abc", "ab", "teee", "output", "abcde", "anotheeString"};
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

  static void QuestionThree() {
    String string1 = "short";
    String string2 = "aLongerString";
    String out = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
    System.out.println(out);
  }

  static void QuestionFour() {
    String stringOne = "here is my first string";
    String stringTwo = "sec";
    String out = GenericUtils.betterEntry(stringOne, stringTwo, (s1, s2) -> s1.length() > s2.length());
    String out2 = GenericUtils.betterEntry(stringOne, stringTwo, (s1, s2) -> true);
    System.out.println(out);
    System.out.println(out2);
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

  static void QuestionSixStrings() {
    List<String> words = List.of(createList());
    List<String> shortWords = GenericUtils.allGenericMatches(words, s -> s.length() < 4);
    List<String> wordsWithB = GenericUtils.allGenericMatches(words, s -> s.contains("b"));
    List<String> evenLengthWords = GenericUtils.allGenericMatches(words, s -> (s.length() % 2) == 0);

    System.out.println(words);
    System.out.println(shortWords);
    System.out.println(wordsWithB);
    System.out.println(evenLengthWords);

  }

  static void QuestionSixInts() {
    int[] ints = {1, 4, 3, 5, 7, 9, 19, 21};
    List<Integer> numbers = Arrays.stream(ints).boxed().toList();
    List<Integer> shortNums = GenericUtils.allGenericMatches(numbers, s -> s / 3 < 5);
    System.out.println(numbers);
    System.out.println(shortNums);

  }

  static void QuestionSeven() {
    List<String> words = List.of(createList());
    List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
    List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
    List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);

    System.out.println(excitingWords);
    System.out.println(eyeWords);
    System.out.println(upperCaseWords);
  }
  static void QuestionEight() {
    List<String> words = List.of(createList());
    List<String> excitingWords = GenericUtils.transformedGenericList(words, s -> s + "!");
    List<String> eyeWords = GenericUtils.transformedGenericList(words, s -> s.replace("i", "eye"));
    List<String> upperCaseWords = GenericUtils.transformedGenericList(words, String::toUpperCase);

    System.out.println(excitingWords);
    System.out.println(eyeWords);
    System.out.println(upperCaseWords);
  }
}

