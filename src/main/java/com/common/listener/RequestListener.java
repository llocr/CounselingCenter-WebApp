package com.common.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    public RequestListener() {
        System.out.println("request listener 인스턴스가 생성되었습니다! 이얏!");
    }

    public void requestDestroyed(ServletRequestEvent sre)  {
        System.out.println("request가 소멸되었습니다 :(");
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae)  {
        System.out.println("request에 attribute가 제거되었습니다 :(");
    }

    public void requestInitialized(ServletRequestEvent sre)  {
        System.out.println("request가 호출되었습니다 :)");
    }

    public void attributeAdded(ServletRequestAttributeEvent srae)  {
        System.out.println("request에 attribute가 추가되었습니다 :)");
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae)  {
        System.out.println("request에 attribute가 갱신되었습니다 :-)");
        System.out.println(srae.getName() + ", " + srae.getValue());
    }

}
