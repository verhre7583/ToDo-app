package org.ibm.repository;

import org.ibm.model.PartyEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PartyEventRepository extends JpaRepository<PartyEvent, Long> {

  @Query(value = "select * from party where names = ?1", nativeQuery = true)
  Set<PartyEvent> getPartiesByCreatorName(String name);



//  @Query(value = "select * from party where place = ?1", nativeQuery = true)
//  Set<PartyEvent> getPartiesByPlaceName(String place);


}
