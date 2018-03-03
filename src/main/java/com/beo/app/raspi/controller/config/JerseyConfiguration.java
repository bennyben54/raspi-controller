package com.beo.app.raspi.controller.config;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.beo.app.raspi.controller.rest.RaspiController;

/**
 * 3 mars 2018
 * @author bennyben54
 */
@Configuration
@ApplicationPath("rest")
public class JerseyConfiguration extends ResourceConfig {

	public JerseyConfiguration() {
		super();
	}

	@PostConstruct
	public void setUp() {
		register(RaspiController.class);
		register(GenericExceptionMapper.class);
	}

}
