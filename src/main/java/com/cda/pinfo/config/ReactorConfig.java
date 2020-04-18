package com.cda.pinfo.config;

import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class ReactorConfig {

	public static final Scheduler SCHEDULER_ELASTIC = Schedulers.elastic();
	
}
