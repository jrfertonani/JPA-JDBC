package com.devsuperior.uri2602.repositories;

import com.devsuperior.uri2602.dto.CustomerMinDTO;
import com.devsuperior.uri2602.entities.Customer;
import com.devsuperior.uri2602.projections.CustomerMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

     @Query(nativeQuery = true, value = "SELECT name "
             + "FROM customers "
             + "where UPPER(states) = UPPER(:state)")
     List<CustomerMinProjection> search1(String state);

    @Query("SELECT new com.devsuperior.uri2602.dto.CustomerMinDTO(obj.nome) "
            + "FROM Customer obj "
            + "where UPPER(obj.states) = UPPER(:state)")
    List<CustomerMinDTO> search2(String state);


}
