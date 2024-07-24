package com.jpabook.ch07mapping.compositekey.idclass;

import com.jpabook.ch07mapping.compositekey.idclass.entity.Parent;
import com.jpabook.ch07mapping.compositekey.idclass.entity.ParentId;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseIdClass {

    private final EntityManager em;

    @Autowired
    public UseIdClass(EntityManager em) {
        this.em = em;
    }

    public void save() {
        Parent parent = new Parent();
        parent.setId1("myId1");
        parent.setId2("myId2");
        parent.setName("parentName");
        em.persist(parent);
    }

    public void find() {
        ParentId parentId = new ParentId("myId1", "myId2");
        Parent parent = em.find(Parent.class, parentId);
    }
}
