package collection.utils;

import java.util.*;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바5
        List<Integer> list4 = List.of(); //자바9
        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1,2,3,4,5};
        // Arrays.asList() 로 생성된 리스트는 생성된 리스트는 고정된 크기를 가지지만, 요소들은 변경할 수 있다.
        List<Integer> list7 = Arrays.asList(arr); // arr을 받아서 그대로 쓴다.
        List<Integer> arr1 = List.of(arr);

        list7.set(0, 100);
        System.out.println("list7 = " + list7);
        System.out.println("arr = " + Arrays.toString(arr)); // arr = [100, 2, 3, 4, 5]

        // 따라서 List.of() 를 사용하는 것을 권장한다.
        // 엄청 큰 배열을 list로 전환하는 경우, Arrays.asList()를 사용하면, 메모리 낭비를 줄일 수 있다.
        // 근데 거의 쓸 일 없음.
    }
}
