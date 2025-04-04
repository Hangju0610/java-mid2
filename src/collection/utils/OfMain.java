package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
//        list.add(4); // UnsupportedOperationException 발생
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, " one", 2, "two", 3, "three");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list class = " + list.getClass()); // list class = class java.util.ImmutableCollections$ListN

        //java.lang.UnsupportedOperationException 예외 발생
        //list.add(4);
    }
}
