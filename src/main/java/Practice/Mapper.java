package Practice;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapper {

    static void meth(){
        Map<Integer,String> mp = new HashMap();{

            mp.put(1,"Arpit");
            mp.put(2, "Sumit");
            System.out.println(mp);
            Map<Integer, String> lHMP= new LinkedHashMap(mp);
            System.out.println(lHMP);

        }


    }

    public static void main(String[] args) {
        Mapper.meth();
    }
}
