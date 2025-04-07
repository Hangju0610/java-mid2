package collection.compare.test;

/**
 * ENUM 타입은 compareTo()가 열거형의 순서인 ordinal로 구현되어 있다.
 * 그리고 ENUM 의 compareTo() 메서드는 final 선언이 되어있어 재정의 할 수 없다.
 */
public enum Suit {
    SPADE("♠"), // 스페이드(♠)
    HEART("♥"),// 하트(♥)
    DIAMOND("♦"),// 다이아몬드(♦)
    CLUB("♣");// 클로버(♣)

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
