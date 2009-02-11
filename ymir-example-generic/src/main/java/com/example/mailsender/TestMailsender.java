package com.example.mailsender;

import org.seasar.cms.mailsender.annotation.BodyTemplate;

import com.example.dto.mailsender.MailDto;
import com.ozacc.mail.Mail;

/**
 * メール送信のためのインタフェースです。
 * <p>ルートパッケージ.mailsenderパッケージに、末尾が「Mailsender」で終わるインタフェース
 * または抽象クラスを作成することで、メール送信クラスを作成することができます。
 * </p>
 */
public interface TestMailsender {
    /**
     * メールを送信するメソッドです。
     * <p>メールの本文は@BodyTemplateで指定されたFreemarkerテンプレートをMailDtoを使って
     * 評価した結果の文字列になります。
     * "send.ftl"は src/main/resources/com/example/mailsender/TestMailsender.send.ftl
     * というパスのリソースに対応しています。
     * </p>
     * 
     * @param mail Mailオブジェクト。
     * @param dto Freemarkerテンプレートを評価するためのパラメータを持つDTO。
     */
    @BodyTemplate("send.ftl")
    void send(Mail mail, MailDto dto);
}
