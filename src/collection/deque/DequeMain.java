package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque : Double Ended queue의 약자
 * 양쪽 끝에서 요소를 추가하거나 제거할 수 있어, 일반적인 큐와 Stack의 기능을 모두 포함
 * 대표적인 구현체는 ArrayDeque, LinkedList가 존재한다.
 * ArrayDeque가 모든 면에서 더 빠르다.
 */
public class DequeMain {
    public static void main(String[] args) {
        Deque<Object> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("pollFirst = " + deque.pollFirst());
        System.out.println("pollFirst = " + deque.pollFirst());
        System.out.println("pollLast = " + deque.pollLast());
        System.out.println("pollLast = " + deque.pollLast());
        System.out.println(deque);
    }
}
