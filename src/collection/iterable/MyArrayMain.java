package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        // 위 아래 두 코드는 같은 코드이다. 아래 코드 for-each로 사용시 컴파일 시점에 while문과 같이 코드를 변경한다.
        System.out.println("for-each 사용");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
