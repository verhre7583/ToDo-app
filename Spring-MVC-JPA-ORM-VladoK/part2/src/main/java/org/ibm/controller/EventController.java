package org.ibm.controller;

import org.ibm.model.PartyEvent;
import org.ibm.repository.PartyEventRepository;
import org.ibm.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ibm")
public class EventController {

  @Autowired
  private EventService eventService;

  @Autowired
  private PartyEventRepository partyEventRepository;

  @GetMapping(value = "/")
  public String getInitialPage(Model model) {
    model.addAttribute("parties", eventService.getEventList());
    model.addAttribute("partyEvent", new PartyEvent());
    return "events";
  }

  @PostMapping(value = "/")
  public String add(Model model, @ModelAttribute PartyEvent partyEvent) {
    eventService.addEvent(partyEvent);
    return "redirect:/ibm/";
  }




  @PostMapping(value = "/findPlace")
  public String findByPlace(Model model, @RequestParam String place) {
    model.addAttribute("partiesInPlace", eventService.getEventFromName(place));
    model.addAttribute("parties", eventService.getEventList());
    model.addAttribute("partyEvent", new PartyEvent());
    return "events";
  }
}