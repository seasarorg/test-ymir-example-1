package com.example.zpt;

import java.util.Map;

import net.skirnir.freyja.Attribute;
import net.skirnir.freyja.TagEvaluatorUtils;
import net.skirnir.freyja.TemplateContext;

import org.seasar.ymir.zpt.TagRenderingInterceptor;
import org.seasar.ymir.zpt.TagRenderingInterceptorChain;

/**
 * ZPTによるカスタムタグ実装のサンプルです。
 * <p>Ymir+ZPTでは、{@link TagRenderingInterceptor}
 * インタフェースの実装クラスを作成してapp.diconにコンポーネント登録することで、
 * カスタムタグを定義して利用することができるようになります。
 * </p>
 * <p>このクラスは、<code>&lt;math:increment value="1" /&gt;</code>と記述すると
 * 「2」とレンダリングされるようなカスタムタグ「math:increment」をZPTで使えるようにするための
 * TagRenderingInterceptor実装です。
 * </p>
 */
public class MathInterceptor implements TagRenderingInterceptor {
    private static final String TAGNAME_INCREMENT = "math:increment";

    private static final String ATTRNAME_VALUE = "value";

    public String[] getSpecialAttributePatternStrings() {
        return null;
    }

    public String[] getSpecialTagPatternStrings() {
        return new String[] { "^" + TAGNAME_INCREMENT + "$" };
    }

    public String render(TemplateContext context, String name,
            Attribute[] attributes, String body,
            TagRenderingInterceptorChain chain) {
        if (name.equals(TAGNAME_INCREMENT)) {
            // math:incrementタグの処理です。

            @SuppressWarnings("unchecked")
            Map<String, Attribute> attr = TagEvaluatorUtils.toMap(attributes);

            Attribute valueAttr = attr.get(ATTRNAME_VALUE);
            if (valueAttr == null) {
                return "";
            } else {
                return String.valueOf(Integer.parseInt(TagEvaluatorUtils
                        .defilter(valueAttr.getValue())) + 1);
            }
        } else {
            // このInterceptorの処理対象でないタグの場合は、
            // 処理をchainに委譲して下さい。
            return chain.render(context, name, attributes, body);
        }
    }
}
