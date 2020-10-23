package com.demo.simple;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("fortuneCookie")
@RequestScoped
public class FortuneCookieResource {

    @Inject
    private FortuneCookieController fortuneCookieController;

    public FortuneCookieResource() {

    }

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getFrase() {
        return fortuneCookieController.retornaFrase();
    }
}
