package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    /**
     * 배열의 추가
     * 배열의 첫번째 추가
     * 배열의 중간 위치 추가
     * 배열의 마지막 위치 추가
     * 공간을 확보하고 추가해야한다.
     */
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        /**
         * 배열의 첫번째 위치에 추가
         * 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
         * 위치 파악 O(1)
         * 오른쪽 데이터 한칸씩 이동 O(n)
         */
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        /**
         * 배열의 가운데 위치에 추가
         * 가운데 위치 파악하고 다음 데이터는 한칸씩 이동
         * 위치 파악 0(1)
         * 오른쪽 데이터 한칸씩 이동 O(n/2) -> O(n)
         */
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        /**
         * 배열의 마지막 위치에 추가
         * 배열이 이동하지 않고 바로 접근 가능
         * 가장 빠르다 O(1)
         */
        System.out.println("배열의 마지막 위치에 5추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void addLast(int[] arr, int newValue ) {
        arr[arr.length - 1] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        // 뒤에서 부터 인덱스까지
        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }

    public static void addFirst(int[] arr, int newValue) {
        // 뒤에서 부터 순회하면서 오른쪽에서 왼쪽으로 값 이동
        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = newValue;
    }

    /**
     * 배열의 한계
     * 배열의 크기를 배열을 생성하는 시점에 미리 정해야한다는 점
     * 처음부터 너무 많은 배열을 확보하면 메모리가 많이 낭비된다.
     * 동적으로 길이기 변하는 자료구조가 필요
     */

}
