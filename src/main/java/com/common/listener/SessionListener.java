package com.common.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {
    public SessionListener() {
        System.out.println("session listener 인스턴스가 생성되었습니다! 야호!");
    }

    public void sessionCreated(HttpSessionEvent se)  {
        System.out.println("session이 생성되었습니다 :)");
        System.out.println("생성된 session id : " + se.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent se)  {
        System.out.println("session이 만료되었습니다 :)");
    }

    public void attributeAdded(HttpSessionBindingEvent se)  {
        System.out.println("session에서 attribute가 추가되었습니다.");
        System.out.println("session에서 추가된 attrribute : " + se.getName() + ", " + se.getValue());
    }

    public void attributeRemoved(HttpSessionBindingEvent se)  {
        System.out.println("session에서 attribute가 제거되었습니다.");
        System.out.println("session에서 제거된 attribute : " + se.getName() + ", " + se.getValue());
    }

    public void attributeReplaced(HttpSessionBindingEvent se)  {
        System.out.println("session에서 attribute가 수정되었습니다.");
        System.out.println("session에서 수정된 attrribute : " + se.getName() + ", " + se.getValue());
    }
}