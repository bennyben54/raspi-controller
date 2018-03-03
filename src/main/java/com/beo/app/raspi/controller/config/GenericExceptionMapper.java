package com.beo.app.raspi.controller.config;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * 3 mars 2018
 * @author bennyben54
 */
@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(final Throwable arg0) {
		return Response.serverError().entity(arg0.getMessage()).build();
	}

}
