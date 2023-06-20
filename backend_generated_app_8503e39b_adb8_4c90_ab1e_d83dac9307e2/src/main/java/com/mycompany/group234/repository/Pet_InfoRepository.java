package com.mycompany.group234.repository;


import com.mycompany.group234.model.Pet_Info;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class Pet_InfoRepository extends SimpleJpaRepository<Pet_Info, String> {
    private final EntityManager em;
    public Pet_InfoRepository(EntityManager em) {
        super(Pet_Info.class, em);
        this.em = em;
    }
    @Override
    public List<Pet_Info> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Pet_Info\"", Pet_Info.class).getResultList();
    }
}