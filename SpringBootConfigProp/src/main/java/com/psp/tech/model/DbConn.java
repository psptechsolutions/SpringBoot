package com.psp.tech.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Setter
@Component
@ToString
@ConfigurationProperties(prefix="db.con")
public class DbConn {

	private String driver;
	private String url;
	private Integer port;
}
