import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping {

    public static void main(String[] args) {
        Map<String, List<String>> mp = new HashMap();
        List<String> lst = new ArrayList<>();
        lst.add("first");
        lst.add("second");
        lst.add("third");
        mp.put("adas", lst);
        System.out.println(mp);

    }
}
