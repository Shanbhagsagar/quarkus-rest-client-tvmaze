package org.gs.proxy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.gs.model.Episode;

import java.util.List;

@Path("/shows/")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface EpisodeProxy {

    @GET
    @Path("{id}/episodes")
    List<Episode> get(@PathParam("id") Long id);

}
