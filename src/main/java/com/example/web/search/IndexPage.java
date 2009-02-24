package com.example.web.search;

import java.util.List;

import org.seasar.ymir.Response;
import org.seasar.ymir.conversation.BeginCondition;
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

@Conversation(name = "search")
public class IndexPage extends IndexPageBase {
    private EntryConverter entryConverter;

    @Inject
    public void setEntryConverter(EntryConverter entryConverter) {
        this.entryConverter = entryConverter;
    }

    @In(scopeClass = ConversationScope.class, actionName = "_get_resume")
    public void setCondition(ConditionDto condition) {
        this.condition = condition;
    }

    @In(scopeClass = ConversationScope.class, actionName = "_get_resume")
    public void setSearchView(SearchViewDto searchView) {
        this.searchView = searchView;
    }

    @Begin
    @Override
    public void _get() {
    }

    public void _get_resume() {
    }

    // TODO Beginだとブラウザバックの際にスタックにたまっていってしまう。
    @Begin
    @Override
    public void _get_search() {
        // 検索を行ないます。
        List<Entry> entries = entryLogic.search(condition.getName());

        // DTOに変換してビューDTOにセットします。
        getSearchView().setEntries(entryConverter.toDtoList(entries));
    }

    // TODO Beginだとブラウザバックの際にスタックにたまっていってしまう。
    @Begin(where = BeginCondition.EXCEPT_FOR_SAME_CONVERSATION)
    @BeginSubConversation(reenter = "redirect:./index.html?resume")
    public Response _get_detail() {
        return Redirect.to(DetailPage.class, "id", id);
    }

    @Out(scopeClass = ConversationScope.class, actionName = "_get_search")
    public ConditionDto getCondition() {
        return condition;
    }

    @Out(scopeClass = ConversationScope.class, actionName = "_get_search")
    @Override
    public SearchViewDto getSearchView() {
        return super.getSearchView();
    }
}
