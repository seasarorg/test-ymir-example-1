package com.example.web.download;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletResponse;

import org.seasar.kvasir.util.io.IOUtils;
import org.seasar.ymir.scope.annotation.Inject;

public class IndexPage extends IndexPageBase {
    // ダウンロードボタンが押された時に呼び出されるアクションです。
    // 引数に@Injectアノテーションをつけることによって、
    // このメソッド呼び出しに必要なオブジェクトをYmirが渡してくれるようになります。
    public void _post(@Inject
    HttpServletResponse response) throws IOException {
        response.setContentType("application/zip");
        response.setHeader("Content-Disposition",
                "attachment; filename=\"sample.zip\"");

        OutputStream os = response.getOutputStream();
        ZipOutputStream zos = new ZipOutputStream(os);
        zos.putNextEntry(new ZipEntry("sample.txt"));
        IOUtils.writeString(zos, "sample", "UTF-8", false, false);
        zos.closeEntry();
        zos.finish();
        // レスポンスのOutputStreamをflushすることでレスポンスがコミットされます。
        // これによって、返り値型がvoidであるアクションでもpassthroughされない
        // ようになります。
        os.flush();
    }
}
