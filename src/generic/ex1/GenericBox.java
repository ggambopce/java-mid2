package generic.ex1;

/**
 * 제네릭
 * T: 타입 매개변수
 * T를 사용하여 타입을 외부에서 지정할 수 있도록 하는 기능
 */
public class GenericBox<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
