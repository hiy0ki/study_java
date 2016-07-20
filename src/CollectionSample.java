import java.util.*;

public class CollectionSample {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbb");
        list.add("cccc");

        for(String s : list){
            System.out.println(s);
        }

        list.add("hello");

        System.out.println(list.get(2));

        list.set(2, "dddd");

        System.out.println(list.get(2));


        List<String> list2 = new LinkedList<>();


        list2.add("aaaa");
        list2.add("bbb");
        list2.add("cccc");

        System.out.println(list2);

        for(String s : list2){
            if(s.equals("bbb")){
                System.out.println(s + " get!");
            }
        }


        Map<String,Integer> map1 = new HashMap<>();
        map1.put("a", 1000);

        System.out.println(map1.get("a"));

    }
}
