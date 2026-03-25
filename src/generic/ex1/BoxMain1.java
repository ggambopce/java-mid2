package generic.ex1;

/**
 * 10을 담는 IntegerBox
 * "Hello"를 담는 StringBox
 * 오토박싱에 의해 자동으로 형변환된다.
 * 타입을 담는 박스가 필요할때마다 생성해야한다.
 */
public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("Hello");
        String string = stringBox.getValue();
        System.out.println("string = " + string);
    }

}
