package com.example.dto.checkbox2;

import java.io.Serializable;

import org.seasar.ymir.render.html.Input;

public class FormDto extends FormDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;

    public FormDto() {
        // このサンプルではチェックボックスの項目は固定（ZPTに埋め込み）であるため、
        // PageクラスではなくFormDto内で静的に初期化しています。
        smokingInput.setType(Input.TYPE_CHECKBOX).setInputValue(
                String.valueOf(true)).setContent("たばこを吸う");
        drinkingInput.setType(Input.TYPE_CHECKBOX).setInputValue(
                String.valueOf(true)).setContent("お酒を飲む");
        gamblingInput.setType(Input.TYPE_CHECKBOX).setInputValue(
                String.valueOf(true)).setContent("賭け事をする");
    }
}
