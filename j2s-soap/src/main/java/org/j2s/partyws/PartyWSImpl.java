package org.j2s.partyws;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;

import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;

import javax.jws.WebService;

import org.tempuri.*;

@WebService(endpointInterface = "org.tempuri.PartyWS", 
            targetNamespace = "http://tempuri.org/",
            portName="PartyWSPort",
            serviceName="PartyService")
@ApplicationScoped
public class PartyWSImpl implements PartyWS
{
  @Inject
  CamelContext context;

  @Override
  public XParty beProcess(BEQuery query)
  {
    XParty party = new XParty();
    party.setXmlId(query.getXmlId());
    party.setXmlGivenName("Joe");
    party.setXmlSurname("Soap");

    return party;
  }

  @Override
  public XParty feProcess(FEQuery query)
  {
    ProducerTemplate producer = context.createProducerTemplate();
    XParty p = producer.requestBodyAndHeaders("seda:getJsonParty",
                                               query, 
                                               null,
                                               XParty.class);
    return p;
  }
}
