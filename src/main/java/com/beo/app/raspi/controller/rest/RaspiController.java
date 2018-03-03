package com.beo.app.raspi.controller.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 3 mars 2018
 * @author bennyben54
 */
@Component
@Path("/control")
public class RaspiController {

	@Autowired
	private ControlService controlService;

	public RaspiController() {
		super();
	}

	@Path("/shutdown")
	@GET
	public String shutdown() {
		return controlService.shutdown();
	}

}
