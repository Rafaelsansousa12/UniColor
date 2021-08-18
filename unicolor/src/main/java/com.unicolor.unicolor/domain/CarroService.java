package com.unicolor.unicolor.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository rep;

    public Carro findById(Long id){
        return rep.findById(id).orElse(null);
    }

    public List<Carro> findAll(){
        return rep.findAll();
    }

    @Transactional
    public Carro save(Carro carro){
        return rep.save(carro);
    }

    @Transactional
    public Boolean deleteById(Long id){
        if (rep.findById(id).isPresent()){
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
