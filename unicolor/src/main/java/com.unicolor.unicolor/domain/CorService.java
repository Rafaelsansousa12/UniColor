package com.unicolor.unicolor.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class CorService {

    @Autowired
    private CorRepository rep;

    public Cor findById(Long id){
        Cor car = rep.findById(id).orElse(null);
        return car;
    }

    public List<Cor> findAll(){
        return rep.findAll();
    }

    @Transactional
    public Cor save(Cor cor){
        return rep.save(cor);
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
