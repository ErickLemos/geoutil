package com.cabradati.rest.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestResponse;

@Path("/roteirizacao")
public class RoteirizacaoController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public RestResponse<String> roterizar() {
        return RestResponse.ok("hello world");
    }

}
