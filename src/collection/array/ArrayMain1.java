package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        //index 입력: 0(1)
        System.out.println("==index 입력: 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경: 0(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        /**
         * 배열은 메모리상에 순서대로 붙어서 존재한다.
         * int는 4byte를 차지한다
         * 시작 참조값에서 인덱스번호에 해당하는 자료의 크기를 곱하여 메모리 위치를 찾을 수 있다.
         * 한번의 계산으로 위치를 찾을 수 있다.
         */
        System.out.println("==index 조회: 0(1)==");
        System.out.println("arr[2] = " + arr[2]);

        /**
         * 배열안에 들어있는 데이터를 순회하면서 하나하나 확인해야한다.
         * 검색의 경우 데이터 크기만큼 연산이 필요하다 크기가 n이면 연산도 n만큼 필요하다
         */
        System.out.println("==배열 검색: 0(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}

/**
 * 빅오 표기법
 * 알고리즘의 성능을 분석할 때 사용하는 수학적 표현방식
 * 알고리즘의 적황한 실행 시간을 계산하는것이 아니라 데이터 양의 증가에 따른 성능의 변화 추세
 * O(1) 최적 - 데이터 크기와 상관없이 일정
 * O(n) 최악 - 데이터 크기가 크면 비례하여 시간이 증가 O(n/2)도 O(n)으로 볼수 있다.
 */
