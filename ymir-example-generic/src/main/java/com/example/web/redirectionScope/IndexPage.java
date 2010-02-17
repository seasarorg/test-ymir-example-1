package com.example.web.redirectionScope;

import org.seasar.ymir.Response;
import org.seasar.ymir.message.Note;
import org.seasar.ymir.message.Notes;
import org.seasar.ymir.redirection.impl.RedirectionScope;
import org.seasar.ymir.scope.annotation.Out;

import com.example.ymir.util.Redirect;

public class IndexPage extends IndexPageBase {
    private Notes notes = new Notes();

    @Override
    public Response _post() {
        // 一時的に表示させたいメッセージを保存しておきます。
        notes.add(new Note("message.redirectionScope.updated"));

        // view.htmlにリダイレクトします。
        return Redirect.to(ViewPage.class);
    }

    /**
     * notesフィールドに設定されているメッセージをリクエストの処理が終わった後に
     * redirectionスコープにセットするためのGetterです。
     * <p>リダイレクト先のPageで@Inアノテーションを使ってリダイレクションスコープから値を取得して
     * リクエストにセットすることでメッセージをリダイレクト先の画面で表示させることができます。
     * </p>
     * 
     * @return Notesオブジェクト。
     */
    @Out(RedirectionScope.class)
    public Notes getTemporaryNotes() {
        return notes;
    }
}
