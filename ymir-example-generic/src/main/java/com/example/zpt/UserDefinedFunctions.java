package com.example.zpt;

import org.seasar.ymir.zpt.Functions;

/**
 * ZPTのJava式に記述可能なファンクションを追加するサンプルです。
 * <p>{@link Functions}インタフェースの実装クラスをapp.diconに登録しておくことで、
 * クラスが持つstatic methodはJava式に記述可能になります。
 * </p>
 */
public class UserDefinedFunctions implements Functions {
    public static int add(int o1, int o2) {
        return o1 + o2;
    }
}
