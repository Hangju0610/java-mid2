package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가진다.
    // 따라서 이 메서드는 제네릭 타입과는 무관하고 제네릭 메서드가 적용된다.
    // 따라서 제네릭 타입에 Dog를 넣고, 제네릭 메서드에 Cat을 넣으면 Cat이 반환
    // 하지만, 이렇게 작성하는 경우 남들이 보기 애매하니, 다르게 제네릭을 넣는것이 좋다. (타입은 T, 메서드는 Z)
    public <T> T printAndReturn (T t) {
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("t.className = " + t.getClass().getName());
        return t;
    }


}
