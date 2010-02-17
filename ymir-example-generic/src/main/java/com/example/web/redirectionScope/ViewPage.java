package com.example.web.redirectionScope;

import org.seasar.ymir.message.Note;
import org.seasar.ymir.message.Notes;
import org.seasar.ymir.redirection.impl.RedirectionScope;
import org.seasar.ymir.scope.annotation.In;

public class ViewPage extends ViewPageBase {
    /**
     * redirectionスコープからメッセージを取得するためのSetterです。
     * <p>リダイレクト元のPageでredirectionスコープにNotesをセットしておくと、
     * このメソッドでNotesを受け取ることができます。
     * </p>
     * 
     * @param notes Notesオブジェクト。
     */
    @In(RedirectionScope.class)
    public void setTemporaryNotes(Notes notes) {
        for (Note note : notes.getNotes()) {
            // redirectionスコープから受け取ったNoteをリクエストに追加することで
            // 画面に表示されるようになります。
            // 画面には
            // <ul tal:condition="notes/notes">
            //   <li tal:repeat="note notes/notes" tal:content="note/%value">NOTE</li>
            // </ul>
            // のようなタグを書いておいて下さい。
            addNote(note);
        }
    }
}
