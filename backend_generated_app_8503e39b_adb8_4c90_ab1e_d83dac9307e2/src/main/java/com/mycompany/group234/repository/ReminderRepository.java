package com.mycompany.group234.repository;


import com.mycompany.group234.model.Reminder;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ReminderRepository extends SimpleJpaRepository<Reminder, String> {
    private final EntityManager em;
    public ReminderRepository(EntityManager em) {
        super(Reminder.class, em);
        this.em = em;
    }
    @Override
    public List<Reminder> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Reminder\"", Reminder.class).getResultList();
    }
}