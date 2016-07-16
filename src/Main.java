import java.awt.*;

public class Main {

    /**
     * Java 基本
     * 1 ソースコードの拡張子は.javaにする
     * 2 基本的に一つのソースコードに一つのpublicなクラス定義を記述する(publicでなければ問題ない)
     * 3 ソースコードのファイル名とクラス名を一致させる
     *
     * オブジェクト指向は依存関係の制御がポイント(分割統治)
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Hello World!");

        // 文字列もStringクラスのオブジェクト
        String aaa = "abcde";
        System.out.println(aaa.indexOf('c'));

        // +演算子以外で文字列連結する一例
        /**
         * この処理の問題点は、
         * Stringオブジェクトが3つできる。
         * Stringクラスは読み込み専用文字列のため。
         * 連結するオブジェクトが増えれば増えるほど、文字列の生成コストが上がる
         *
         * この問題を回避するためにはStringBuilderクラスを使用する
         */
        String s1 = "012";
        String s2 = "abc";
        System.out.println(s1.concat(s2));


        /**
         * 桁あふれの確認
         */
        int i = Integer.MAX_VALUE;
        System.out.println(i);
        i++;
        System.out.println(i);

        int j = Integer.MIN_VALUE;
        System.out.println(j);
        j--;
        System.out.println(j);

        /**
         * Char型の計算
         *
         * 0x20は英語アルファベットの大文字と小文字の差分
         */
        char c = 'a' - 0x20;
        System.out.println(c);

    }
}

