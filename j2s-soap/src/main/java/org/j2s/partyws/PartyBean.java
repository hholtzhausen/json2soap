package org.j2s.partyws;

import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;

import org.j2s.JParty;
import org.j2s.PartyResource;

import org.tempuri.FEQuery;

@ApplicationScoped
@Named("partyBean")
public class PartyBean
{
  @Inject
  PartyResource partyResource;

  public JParty getParty(FEQuery query)
  {
    try
    {
      return partyResource.getPartyBE(query.getXmlId());
    }
    catch (Exception e)
    {
      return new JParty();
    }
  }
}
