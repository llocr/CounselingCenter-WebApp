package com.common.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {

    public ContextListener() {
        System.out.println("context listener 인스턴스 생성되었습니다! 오호!");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("context에 attribute가 추가되었습니다 :)");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("context에 attribute가 제거되었습니다 :(");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("context에 attribute가 변경되었습니다 0_0");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context가 생성되었습니다 :)");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context가 소멸되었습니다 :(");
    }

}