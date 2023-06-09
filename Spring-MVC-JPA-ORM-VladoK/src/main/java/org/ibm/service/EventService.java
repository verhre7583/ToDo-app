package org.ibm.service;

import org.ibm.model.PartyEvent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

  private List<PartyEvent> partyEventList = new ArrayList<>();

  public EventService(){
    PartyEvent partyEvent = new PartyEvent();
    partyEvent.setPlace("ibm");
    partyEvent.setUserName("vlado");
    partyEventList.add(partyEvent);
  }
  public List<PartyEvent> getEventList() {
    return partyEventList;
  }

  public void addEvent(PartyEvent partyEvent){
    partyEventList.add(partyEvent);
  }
}
