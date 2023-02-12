import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils {

    static List<String> allMatches(List<String> l1, Predicate<String> p) {
        List<String> resultList = new ArrayList<String>();
        for (String s : l1) {
            if (p.test(s)) resultList.add(s);
        }
        return resultList;
    }

    static String betterString (String s1, String s2, TwoStringPredicate p) {
        return p.compareTwoStrings(s1, s2) ? s1 : s2;
    }

    static int eCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') count += 1;
        }
        return count;
    }

    static int eChecker(String s1, String s2) {
        return eCounter(s2) - eCounter(s1);
    }

    static List<String> transformedList(List<String> l1, Function<String, String> fn) {
        List<String> resultList = new ArrayList<>();
        for (String s: l1) {
            resultList.add(fn.apply(s));
        }
        return resultList;
    }


}
