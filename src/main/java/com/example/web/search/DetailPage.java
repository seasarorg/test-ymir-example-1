package com.example.web.search;

import org.seasar.ymir.Response;
import org.seasar.ymir.conversation.annotation.Begin;
import org.seasar.ymir.conversation.annotation.Conversation;
import org.seasar.ymir.conversation.annotation.End;

@Conversation(name = "detail")
public class DetailPage extends DetailPageBase {
    @Begin
    @Override
    public void _get() {
    }

    @End
    @Override
    public Response _get_back() {
        return null;
    }

    @Override
    public void _prerender() {
        detailViewConverter
                .copyEntityToDto(entryLogic.get(id), getDetailView());
    }

}
