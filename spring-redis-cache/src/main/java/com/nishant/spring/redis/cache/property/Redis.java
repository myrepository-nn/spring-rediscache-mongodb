package com.nishant.spring.redis.cache.property;

import org.springframework.stereotype.Component;

@Component
public class Redis {
	
	private String host;
	private String port;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
	

}
