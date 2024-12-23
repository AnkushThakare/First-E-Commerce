package com.example.firstecommerce.Module;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Date;
@MappedSuperclass


public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private Date createdAt;
    private Date updatedAt;
    private boolean deleted;

    public long getId() {
            return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;

    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public boolean isDeleted() {
        return deleted;
    }
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;

    }


}
