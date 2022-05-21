package com.simplilearn.listeners;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class AppEventListener {
	
	
	@EventListener
	public void onApplicationEvent(ContextStartedEvent cse) {
		
		System.out.println("context started event occured...");
		
	}
	
	
	@EventListener
	public void onApplicationEvent1(ContextStartedEvent cse) {
		
		System.out.println("context started event occured1111...");
		
	
	

	}
	}
