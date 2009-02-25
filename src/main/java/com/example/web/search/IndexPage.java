package com.example.web.search;

import java.util.List;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Bool;
import org.seasar.ymir.conversation.annotation.Begin;
import org.seasar.ymir.conversation.annotation.BeginSubConversation;
import org.seasar.ymir.conversation.annotation.Conversation;
import org.seasar.ymir.conversation.impl.ConversationScope;
import org.seasar.ymir.scope.annotation.In;
import org.seasar.ymir.scope.annotation.Inject;
import org.seasar.ymir.scope.annotation.Out;

import com.example.converter.search.EntryConverter;
import com.example.dao.search.Entry;
import com.example.dto.search.ConditionDto;
import com.example.dto.search.SearchViewDto;
import com.example.ymir.util.Redirect;

// 検索画面のためのカンバセーション指定です。
// acceptBrowsersBackButton = Bool.TRUE とすることで、詳細画面からブラウザバックで検索画面に戻ってきても
// 不正な遷移エラーとせずに動作するようにしています。
@Conversation(name = "search", acceptBrowsersBackButton = Bool.TRUE)
public class IndexPage extends IndexPageBase {
    private EntryConverter entryConverter;

    @Inject
    public void setEntryConverter(EntryConverter entryConverter) {
        this.entryConverter = entryConverter;
    }

    // _get_resumeアクション実行前に、検索条件をカンバセーションスコープから復帰させるようにしています。
    @In(scopeClass = ConversationScope.class, actionName = "_get_resume")
    public void setCondition(ConditionDto condition) {
        this.condition = condition;
    }

    // _get_resumeアクション実行前に、検索結果をカンバセーションスコープから復帰させるようにしています。
    @In(scopeClass = ConversationScope.class, actionName = "_get_resume")
    public void setSearchView(SearchViewDto searchView) {
        this.searchView = searchView;
    }

    // 初期表示のためのアクションです。
    // 検索画面のためのカンバセーションを開始します。
    @Begin
    @Override
    public void _get() {
    }

    // 詳細画面から戻ってくるためのアクションです。
    // カンバセーションスコープに退避させていた検索条件と検索結果のDTOを使って画面を再構築します。
    public void _get_resume() {
    }

    // 検索を実行するためのアクションです。
    @Override
    public void _get_search() {
        // 検索を行ないます。
        List<Entry> entries = entryLogic.search(condition.getName());

        // DTOに変換してビューDTOにセットします。
        getSearchView().setEntries(entryConverter.toDtoList(entries));
    }

    // 検索結果の一覧から詳細画面に遷移するためのアクションです。
    // BeginSubConversationアノテーションによって、詳細画面のためのサブカンバセーションを開始するようにします。
    // reenterによって、サブカンバセーションが終了した際には_get_resumeアクションが呼び出されます。
    @BeginSubConversation(reenter = "redirect:./index.html?resume")
    public Response _get_detail() {
        return Redirect.to(DetailPage.class, "id", id);
    }

    // 検索処理実行時の検索条件をカンバセーションスコープに保存するようにしています。
    @Out(scopeClass = ConversationScope.class, actionName = "_get_search")
    public ConditionDto getCondition() {
        return condition;
    }

    // 検索結果をカンバセーションスコープに保存するようにしています。
    @Out(scopeClass = ConversationScope.class, actionName = "_get_search")
    @Override
    public SearchViewDto getSearchView() {
        return super.getSearchView();
    }
}
