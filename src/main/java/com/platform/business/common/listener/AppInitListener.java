package com.platform.business.common.listener;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


/**
 * 启动事件
 */
@Slf4j
@Component
public class AppInitListener implements ApplicationListener<ApplicationStartedEvent> {
    /**
     * Callback used to run the bean.
     *
     */
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {

    }
}
