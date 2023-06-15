package org.ibm.model;

import javax.persistence.*;

@Entity
@Table(name = "party")
public class PartyEvent {

  @Id
  @Column(name = "id")
  @GeneratedValue
  private Long id;

  //pay attention on column name
  @Column(name = "peopleCount")
  private int peopleCount;

  @Column(name = "place")
  private String place;

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public String getPlace() {
    return place;
  }


  public void setPlace(String place) {
    this.place = place;
  }

  @Override public String toString() {
    return "PartyEvent{" +
        "id=" + id +
        ", peopleCount=" + peopleCount +
        ", place='" + place + '\'' +
        '}';
  }

  public int getPeopleCount() {
    return peopleCount;
  }

  public void setPeopleCount(int peopleCount) {
    this.peopleCount = peopleCount;
  }
}
