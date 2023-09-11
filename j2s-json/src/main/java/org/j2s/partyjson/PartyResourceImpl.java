package org.j2s.partyjson;

import java.util.Map;
import java.util.HashMap;

import org.j2s.JParty;
import org.j2s.PartyResource;

import javax.inject.Inject;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;

public class PartyResourceImpl implements PartyResource
{
  @Inject
  CamelContext context;

  @Override
  public JParty getPartyFE(String id)
  {
    Map<String,Object> headers = new HashMap<String,Object>();
    headers.put("jsonId",id);

    ProducerTemplate producer = context.createProducerTemplate(); 
    JParty p = producer.requestBodyAndHeaders("seda:getSoapParty",
                                               "<xml></xml>",
                                               headers,
                                               JParty.class);
    return p;
  }

  @Override
  public JParty getPartyBE(String id)
  {
    return new JParty().jsonId(id)
                       .jsonFirstName("Restless")
                       .jsonLastName("Ronnie");
  }
}
