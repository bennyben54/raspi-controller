package com.beo.app.raspi.controller.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

/**
 * 3 mars 2018
 * @author bennyben54
 */
@Component
@Path("/control")
public class RaspiController {

	public RaspiController() {
		super();
	}

	@Path("/shutdown")
	@GET
	@Produces("application/text")
	public String shutdown() {
		String command = "shutting down now";
		System.out.println(command);
		return command;
	}

	@Path("/reboot")
	@GET
	@Produces("application/text")
	public String reboot() {
		String command = "rebooting now";
		System.out.println(command);
		return command;
	}

}
