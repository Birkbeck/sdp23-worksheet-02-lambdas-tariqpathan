import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class GenericUtils {

    static <T> List<T> allGenericMatches(List<T> l1, Predicate<T> p) {
        List<T> resultList = new ArrayList<T>();
        for (T t : l1) {
            if (p.test(t)) resultList.add(t);
        }
        return resultList;
    }

    static <T> T betterEntry (T t1, T t2, TwoElementPredicate<T> p) {
        return p.compareTwoElements(t1, t2) ? t1 : t2;
    }

    static <T> List<T> transformedGenericList(List<T> l1, Function<T, T> fn) {
        List<T> resultList = new ArrayList<>();
        for (T t: l1) {
            resultList.add(fn.apply(t));
        }
        return resultList;
    }

}
