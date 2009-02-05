package com.example.dto.checkbox2;

import java.io.Serializable;

public class FormDto extends FormDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;

    public FormDto() {
        // このサンプルではチェックボックスの項目自体は固定（ZPTに埋め込み）であるため、
        // PageクラスではなくFormDto内で静的に初期化しています。
        //
        // このサンプルのような、選択された項目のラベルを列挙するケースのように
        // ラベルを動的に利用する場合はこのように初期化する必要がありますが、
        // ラベルを動的に利用する必要が特にないのであればラベルをZPTに埋め込んで構いません。
        // その場合は以下の初期化は不要になります。
        smokingInputTag.setContent("たばこを吸う");
        drinkingInputTag.setContent("お酒を飲む");
        gamblingInputTag.setContent("賭け事をする");
    }
}
