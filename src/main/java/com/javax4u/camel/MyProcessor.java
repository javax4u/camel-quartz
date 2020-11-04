package com.javax4u.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
    	System.out.println("Executing camel processor");
    }

}
