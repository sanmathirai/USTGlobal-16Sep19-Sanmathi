package com.ustglobal.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component("hello")
public class Hello {
	public Hello() {
		System.out.println("heloo object");
	}
	private String msg;

	public Map<String, Integer> map;
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	@PostConstruct
	public void init() {
		System.out.println("Init method executing from hello");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method from hello");
		
	}

}
