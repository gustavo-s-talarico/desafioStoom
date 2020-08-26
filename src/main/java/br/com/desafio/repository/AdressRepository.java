package br.com.desafio.repository;

import br.com.desafio.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

    List<Adress> findByStreetNameContainingIgnoreCase(final String streetName);
}
