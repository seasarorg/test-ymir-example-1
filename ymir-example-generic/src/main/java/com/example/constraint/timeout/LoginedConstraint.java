package com.example.constraint.timeout;

import java.lang.reflect.AnnotatedElement;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.ymir.Request;
import org.seasar.ymir.constraint.ConstraintViolatedException;
import org.seasar.ymir.constraint.PermissionDeniedException;
import org.seasar.ymir.constraint.impl.AbstractConstraint;
import org.seasar.ymir.session.SessionManager;

import com.example.constraint.timeout.annotation.Logined;

public class LoginedConstraint extends AbstractConstraint<Logined> {
    private SessionManager sessionManager;

    @Binding(bindingType = BindingType.MUST)
    public void setSessionManager(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    public void confirm(Object component, Request request, Logined annotation,
            AnnotatedElement element) throws ConstraintViolatedException {
        if (sessionManager.getSession(false) == null) {
            throw new PermissionDeniedException();
        }
    }
}
