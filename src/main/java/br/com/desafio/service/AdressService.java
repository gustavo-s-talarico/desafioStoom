package br.com.desafio.service;

import br.com.desafio.exception.AdressNotFoundException;
import br.com.desafio.model.Adress;
import br.com.desafio.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdressService {

    @Autowired
    private AdressRepository repository;

    public List<Adress> findAll() {
        return repository.findAll();
    }

    public Adress findById(final Long id) {
        final Optional<Adress> adress = repository.findById(id);

        if(adress.isPresent()){
            return adress.get();
        }else{
            throw new AdressNotFoundException();
        }
    }

    public Adress save(final Adress adress) {
        return repository.save(adress);
    }

    public Adress update(final Long id, final Adress dtoAdress) {
        final Optional<Adress> adressEntity = repository.findById(id);
        final Adress adress;

        if (adressEntity.isPresent()) {
            adress = adressEntity.get();
        }else {
            throw new AdressNotFoundException();
        }

        adress.setStreetName(dtoAdress.getStreetName());
        adress.setNumberAdress(dtoAdress.getNumberAdress());
        adress.setComplement(dtoAdress.getComplement());
        adress.setNeighbourhood(dtoAdress.getNeighbourhood());
        adress.setCity(dtoAdress.getCity());
        adress.setState(dtoAdress.getState());
        adress.setCountry(dtoAdress.getCountry());
        adress.setZipCode(dtoAdress.getZipCode());
        adress.setLatitude(dtoAdress.getLatitude());
        adress.setLongitude(dtoAdress.getLongitude());

        return repository.save(adress);
    }

    public void delete(Long id) {
        final Adress adress = findById(id);

        repository.delete(adress);
    }
}
