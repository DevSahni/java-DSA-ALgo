import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateBYStream {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Dev");
        str.add("rahul");
        str.add("pankaj");
        str.add("Dev");
        List<String> distinct = str.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);
    }
}
