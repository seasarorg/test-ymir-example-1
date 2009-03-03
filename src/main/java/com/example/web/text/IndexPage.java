package com.example.web.text;

public class IndexPage extends IndexPageBase {
    // 日付の項目に対応するIndexPageBaseクラスのプロパティ（date1、date2）の
    // Setterに@Datetimeアノテーションを付与することで、
    // 「yyyyMMdd形式の日付」項目に入力可能な文字列のパターンを指定しています。
    //
    // ZPTテンプレート中で「self/date1」というTAL式を書くと、Pageクラスのdate1プロパティの
    // GetterまたはSetterに付与されている@Datetimeアノテーションの日付パターンに従った形式で
    // Dateオブジェクトがフォーマットされて表示されます。
}
