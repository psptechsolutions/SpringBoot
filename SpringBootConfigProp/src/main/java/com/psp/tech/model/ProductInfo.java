package com.psp.tech.model;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
@ConfigurationProperties(prefix = "my.app")
public class ProductInfo {

	private Integer pid;
	private String pcode;
	private Double pversion;
	
	//private List<String> clients;
	//private Set<String> clients;
	private String[] clients;
	
	//private Map<String,String> details;
	private Properties details;
	
}
