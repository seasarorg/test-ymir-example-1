package com.example.web.text;

public class IndexPage extends IndexPageBase {
    // 「yyyyMMdd形式の日付」項目に対応するIndexPageBaseクラスのプロパティ（date）の
    // Setterに@Datetimeアノテーションを付与することで、
    // 「yyyyMMdd形式の日付」項目に入力可能な文字列のパターンを指定しています。
    //
    // ZPTテンプレート中で「self/date」というTAL式を書くと、Pageクラスのdateプロパティの
    // GetterまたはSetterに付与されている@Datetimeアノテーションの日付パターンに従った形式で
    // Dateオブジェクトがフォーマットされて表示されます。
}
