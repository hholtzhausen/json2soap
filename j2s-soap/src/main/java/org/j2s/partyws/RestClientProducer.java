package org.j2s.partyws;

import java.net.URI;
import java.net.MalformedURLException;

import javax.inject.Named;
import javax.enterprise.inject.Produces;
import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

import org.j2s.PartyResource;

@ApplicationScoped
public class RestClientProducer
{
  @ConfigProperty(name = "app.jparty.baseuri")
  String partyBaseUri;

  @Produces
  @Named
  public PartyResource partyResource() throws MalformedURLException
  {
    PartyResource party = RestClientBuilder.newBuilder()
                                           .baseUri(URI.create(partyBaseUri))
                                           .build(PartyResource.class);

    return party;
  }
}
