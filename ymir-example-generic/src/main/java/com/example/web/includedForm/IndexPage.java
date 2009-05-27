package com.example.web.includedForm;

import org.seasar.ymir.annotation.Include;

import com.example.web.included.LoginPage;

/**
 * ログインフォームをインクルードしている画面のPageクラスです。
 * ログインフォーム固有の処理をフォームから呼び出せるよう、ログインフォームに対応するPageクラス
 * である{@link LoginPage}を@Includeアノテーションで指定しています。
 */
@Include(LoginPage.class)
public class IndexPage extends IndexPageBase {
}
