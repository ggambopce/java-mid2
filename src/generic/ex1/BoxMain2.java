package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.setValue(10);
        Integer integer = (Integer) objectBox.getValue();
        System.out.println("integer = " + integer);
        
        objectBox.setValue("Hello");
        String string = (String) objectBox.getValue();
        System.out.println("string = " + string);

        intgerBox.setValue("문자100");
        Integer result = (Integer) intgerBox.getValue();

        System.out.println("result = " + result);
    }
}
