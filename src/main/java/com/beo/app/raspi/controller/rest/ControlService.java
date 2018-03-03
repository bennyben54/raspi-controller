package com.beo.app.raspi.controller.rest;

import org.springframework.stereotype.Service;

/**
 * 3 mars 2018
 * @author bennyben54
 */
@Service
public class ControlService {

	public ControlService() {
		super();
	}

	public String shutdown() {
		String command = "shutting down now";
		System.out.println(command);
		return command;
	}

}
