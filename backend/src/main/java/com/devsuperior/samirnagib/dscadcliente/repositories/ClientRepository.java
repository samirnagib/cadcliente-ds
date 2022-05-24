package com.devsuperior.samirnagib.dscadcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.samirnagib.dscadcliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
