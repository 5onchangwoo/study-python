package com.jpabook.ch07mapping.compositekey.embeddedid;

import com.jpabook.ch07mapping.compositekey.embeddedid.entity.Parent;
import com.jpabook.ch07mapping.compositekey.embeddedid.entity.ParentId;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Component;

@Component
public class UseEmbeddedId {

    private final EntityManager em;

    public UseEmbeddedId(EntityManager em) {
        this.em = em;
    }

    public void save() {
        Parent parent = new Parent();
        ParentId parentId = new ParentId("myId1", "myId2");
        parent.setId(parentId);
        parent.setName("parentName");
        em.persist(parent);
    }

    public void find() {
        ParentId parentId = new ParentId("myId1", "myId2");
        Parent parent = em.find(Parent.class, parentId);
    }
}
