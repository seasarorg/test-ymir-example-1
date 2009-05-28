package com.example.web.included;

import org.seasar.ymir.Response;
import org.seasar.ymir.constraint.annotation.Required;
import org.seasar.ymir.message.Note;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.response.SelfContainedResponse;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.web.PageBase;

/**
 * ログインフォームのための処理をするためのPageクラスです。
 * ところでインクルードされるPageクラスに対応するHTMLは、ブラウザから直接アクセスできないように
 * した方が望ましいです。
 * そのための設定を src/main/resources/mapping+.dicon に追記してありますので
 * 参照してみて下さい（includedDeniedPathMappingという名前のコンポーネントです）。
 */
public class LoginPage extends PageBase {
    /**
     * ユーザIDです。
     */
    private String userId;

    /**
     * パスワードです。
     */
    private String password;

    public String getUserId() {
        return userId;
    }

    @RequestParameter
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    @RequestParameter
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 「ログイン」ボタンが押された時に呼び出されるアクションメソッドです。
     */
    @Required( { "userId", "password" })
    public Response _post_login() {
        if ("user".equals(userId) && "pass".equals(password)) {
            // ログインに成功した場合は「ログインしました。」と表示するようにします。
            return new SelfContainedResponse("ログインしました。",
                    "text/plain;charset=UTF-8");
        } else {
            // ログインに失敗した場合は自画面にエラーメッセージを表示するようにします。
            addNote(new Note("error.included_loginPage.loginFailed"));
            return new PassthroughResponse();
        }
    }
}
