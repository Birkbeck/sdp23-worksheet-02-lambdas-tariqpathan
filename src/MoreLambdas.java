public class MoreLambdas {

    static <T> T betterEntry (T t1, T t2, TwoElementPredicate<T> p) {
        return p.compareTwoElements(t1, t2) ? t1 : t2;
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
        String out = betterEntry(stringOne, stringTwo, (s1, s2) -> s1.length() > s2.length());
        String out2 = betterEntry(stringOne, stringTwo, (s1, s2) -> true);
        System.out.println(out);
        System.out.println(out2);
    }

    public static void main(String[] args) {
        QuestionThree();
        QuestionFour();
    }
}
