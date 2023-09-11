package org.j2s;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;

@Path("/party")
@Consumes({"application/json"})
@Produces({"application/json"})
public interface PartyResource
{
  @GET
  @Path("/fe/{id}")
  public JParty getPartyFE(@PathParam("id") String id);

  @GET
  @Path("/be/{id}")
  public JParty getPartyBE(@PathParam("id") String id);
}
