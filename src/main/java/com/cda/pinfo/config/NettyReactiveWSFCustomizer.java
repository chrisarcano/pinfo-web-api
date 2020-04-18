package com.cda.pinfo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

@Component
@ConditionalOnProperty(name = "netty.reactive.wiretap.enabled")
public class NettyReactiveWSFCustomizer implements WebServerFactoryCustomizer<NettyReactiveWebServerFactory> {

	@Override
	public void customize(NettyReactiveWebServerFactory factory) {
		factory.addServerCustomizers( httpServer -> httpServer.wiretap(true) );
	}
}