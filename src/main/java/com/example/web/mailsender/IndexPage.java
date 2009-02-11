package com.example.web.mailsender;

import org.seasar.ymir.Response;
import org.seasar.ymir.constraint.annotation.Required;
import org.seasar.ymir.scope.annotation.Inject;

import com.example.mailsender.TestMailsender;
import com.example.ymir.util.Redirect;
import com.ozacc.mail.Mail;

public class IndexPage extends IndexPageBase {
    private TestMailsender testMailsender;

    @Inject
    public void setTestMailsender(TestMailsender testMailsender) {
        this.testMailsender = testMailsender;
    }

    @Override
    @Required("to")
    public Response _post_send() {
        // メールを送信します。

        Mail m = new Mail();
        m.addTo(mail.getTo());
        // 本文はTestMailsender#send()メソッドが適切に設定してくれるので、
        // ここでは設定不要です。
        testMailsender.send(m, mail);

        return Redirect.to(SentPage.class);
    }
}
