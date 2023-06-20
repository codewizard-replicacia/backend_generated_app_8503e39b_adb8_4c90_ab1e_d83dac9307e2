package com.mycompany.group234.repository;


import com.mycompany.group234.model.Vet_Visit_History;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class Vet_Visit_HistoryRepository extends SimpleJpaRepository<Vet_Visit_History, String> {
    private final EntityManager em;
    public Vet_Visit_HistoryRepository(EntityManager em) {
        super(Vet_Visit_History.class, em);
        this.em = em;
    }
    @Override
    public List<Vet_Visit_History> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Vet_Visit_History\"", Vet_Visit_History.class).getResultList();
    }
}