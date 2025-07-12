package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    /**
     * List 자료구조
     * 순서가 있고 중복을 허용하는 자료구조 크기가 동적으로 변할 수 있다
     * 배열은 크기가 정적으로 고정된다.
     */
    private static final int DEFAULT_CAPACITY = 5;

    // 오브젝트를 담을 수 있는 배열
    private Object[] elementData;
    private int size = 0;

    // 생성자
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }
    // 배열의 현재 크기
    public int getSize() {
        return size;
    }

    // 배열의 순서증가
    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return  oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return -1;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
                size + ", capacity=" + elementData.length;
    }

}
