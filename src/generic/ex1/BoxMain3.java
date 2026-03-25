package generic.ex1;

/**
 * 생성시점에 타입을 지정하여 사용할 수 있다.
 * 타입에 해당하는 코드가 실제로 만들어지는 것은 아니다.
 * 컴파일러가 우리가 입력한 타입정보를 기반으로 추론하여 컴파일 과정에 타입정보를 반영한다.
 * 메서드는 매개변수에 인자를 전달해서 사용할 값을 결정한다.
 * 제네릭 클래스는 타입 매개변수에 타입인자를 전달해서 사용할 타입을 결정한다.
 */
public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setValue(10);
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);
        
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("Hello");
        String string = stringBox.getValue();
        System.out.println("string = " + string);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setValue(3.14);
        Double doubleValue = doubleBox.getValue();
        System.out.println("doubleValue = " + doubleValue);
    }
}
