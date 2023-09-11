package org.j2s.partyjson;

import javax.inject.Named;
import java.net.MalformedURLException;
import javax.enterprise.inject.Produces;
import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.net.URL;

import org.tempuri.PartyWS;
import org.tempuri.PartyService;

@ApplicationScoped
public class WebServiceClientProducer 
{
  @ConfigProperty(name = "app.partyws.wsdl")
  String partyWsdl;

  @Produces
  @Named
  public PartyWS partyWS() throws MalformedURLException
  {
    PartyService service = new PartyService(new URL(partyWsdl));
    return service.getPartyWSPort();
  }
}

