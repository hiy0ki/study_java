/**
 * Created by hirokiiyoda on 2016/07/20.
 */
public class ArraySample {

    public static void main(String[] args) {

        /**
         * 配列は基本型をそのまま要素として扱えるのが
         * コレクションと違うところ
         */
        int[] arr = new int[3];
        arr[0] = 4;
        arr[2] = 3;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // 配列の初期化
        int[] arr3 = {1,2,3};

        /**
         * 要素が参照型のものも配列型が使える
         * 参照型の配列型は要素の値ではなく参照を持っているイメージ
         */
        StringBuilder[] arr2 = new StringBuilder[3];
        arr2[0] = new StringBuilder("aaaa");
        arr2[1] = new StringBuilder("bbbb");
        arr2[2] = new StringBuilder("cccc");

        System.out.println(arr2[1]);

        // 配列の初期化その2
        StringBuilder[] arr4 = {new StringBuilder("aaa"), new StringBuilder("bbb")};

    }
}
