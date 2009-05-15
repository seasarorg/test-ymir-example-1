package com.example.ymir.util;

import org.seasar.ymir.Response;
import org.seasar.ymir.id.action.Action;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.response.ProceedResponse;

import com.example.ymir.util.PageUtils;

public class Proceed {
    protected Proceed() {
    }

    public static Response to(String path) {
        return to(path, null);
    }

    public static Response to(String path, String param, Object... params) {
        Object[] pms;
        if (param != null) {
            pms = new Object[1 + params.length];
            pms[0] = param;
            System.arraycopy(params, 0, pms, 1, params.length);
        } else {
            pms = params;
        }

        return new ProceedResponse(PageUtils.constructPath(path, false, pms));
    }

    public static Response to(Class<?> pageClass) {
        return to(pageClass, (String) null);
    }

    public static Response to(Class<?> pageClass,
            Class<? extends GetAction> actionInterface, Object... params) {
        Object[] pms = new Object[1 + params.length];
        pms[0] = "";
        System.arraycopy(params, 0, pms, 1, params.length);

        try {
            return to(pageClass, (String) actionInterface.getField(
                    Action.FIELD_KEY).get(null), pms);
        } catch (Throwable t) {
            throw new RuntimeException(
                    "Cannot get action key from action method '"
                            + actionInterface
                            + "'. Try to re-generate Page class.", t);
        }
    }

    public static Response to(Class<?> pageClass, String param,
            Object... params) {
        Object[] pms;
        if (param != null) {
            pms = new Object[1 + params.length];
            pms[0] = param;
            System.arraycopy(params, 0, pms, 1, params.length);
        } else {
            pms = params;
        }

        return new ProceedResponse(PageUtils.constructPath(pageClass, false,
                pms));
    }
}
