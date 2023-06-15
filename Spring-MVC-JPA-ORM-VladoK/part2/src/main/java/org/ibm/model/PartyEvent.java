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
  @Column(name = "userName")
  private String userName;

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

  public String getUserName() {
    return userName;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override public String toString() {
    return "PartyEvent{" +
        "id=" + id +
        ", userName='" + userName + '\'' +
        ", place='" + place + '\'' +
        '}';
  }
}
