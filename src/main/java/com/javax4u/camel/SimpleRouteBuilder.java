package com.javax4u.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.routepolicy.quartz.CronScheduledRoutePolicy;


public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	CronScheduledRoutePolicy startPolicy = new CronScheduledRoutePolicy();
		startPolicy.setRouteStartTime("0 0/1 * * * ?");

	from("file:C:/inputFolder?noop=true").routePolicy(startPolicy).noAutoStartup().process(new MyProcessor())
				.to("file:C:/outputFolder");
    }

}
