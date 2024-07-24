package com.jpabook.ch07mapping.compositekey.identifyrelationship.embeddedid.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GrandChildId implements Serializable {

    public ChildId childId;

    @Column(name = "GRANDCHILD_ID")
    private String id;

    // equals, hashCode...
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrandChildId that = (GrandChildId) o;
        return Objects.equals(childId, that.childId) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(childId, id);
    }
}
