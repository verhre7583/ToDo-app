package org.ibm.service;

import org.ibm.model.PartyEvent;
import org.ibm.repository.PartyEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class EventService {

  @Autowired
  private PartyEventRepository partyEventRepository;

  @Autowired
  private CrudRepository crudRepository;

  private List<PartyEvent> partyEventList = new ArrayList<>();

  public EventService() {
    PartyEvent partyEvent = new PartyEvent();
    partyEvent.setPlace("ibm");
    partyEvent.setUserName("vlado");
    partyEventList.add(partyEvent);
  }

  //  public List<PartyEvent> getEventList() {
  //    return partyEventList;
  //  }


  public void addEventOnlyFromMatus(PartyEvent partyEvent) {
    if (partyEvent.getUserName().equalsIgnoreCase("Matus")) {
      partyEventRepository.save(partyEvent);
    }
  }
  public List<PartyEvent> getEventList() {
    return partyEventRepository.findAll();
  }

  public PartyEvent getEventFromName(String name) {
    return partyEventRepository.findByUserName(name);
  }

  public Set<PartyEvent> getPartiesBasedOnOrganizationName(String organizationName) {
    return partyEventRepository.getPartiesByCreatorName(organizationName);
  }

}
