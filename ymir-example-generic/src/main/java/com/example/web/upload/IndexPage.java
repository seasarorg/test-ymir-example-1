package com.example.web.upload;

import java.io.IOException;

import org.seasar.ymir.Response;
import org.seasar.ymir.constraint.annotation.Required;
import org.seasar.ymir.response.SelfContainedResponse;

public class IndexPage extends IndexPageBase {
    @Override
    @Required(P_file)
    public Response _post() throws IOException {
        // 受け取ったデータをそのままSelfContainedResponseに詰めてアクションの返り値として渡すことで、
        // アップロードしたファイルをそのまま表示することができます。
        SelfContainedResponse response = new SelfContainedResponse();
        response.setContentType(file.getContentType());
        response.setInputStream(file.getInputStream());
        return response;
    }
}
