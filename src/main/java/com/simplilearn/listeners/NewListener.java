package com.simplilearn.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.event.NewsEvent;

@Component
public class NewListener {

	@EventListener
	public void ListenNewsEvent1(NewsEvent ne) {
		System.out.println("East dealer hets notified");	
	}
	@EventListener
	public void ListenNewsEvent2(NewsEvent ne) {
		System.out.println("North dealer hets notified");	
	}
	
	@EventListener
	public void ListenNewsEvent3(NewsEvent ne) {
		System.out.println("west dealer hets notified");	
	}
	
	@EventListener
	public void ListenNewsEvent4(NewsEvent ne) {
		System.out.println("south dealer hets notified");	
	}
}
