package org.ibm.repository;

import org.ibm.model.PartyEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyEventRepository extends JpaRepository<PartyEvent,Long> {


}
