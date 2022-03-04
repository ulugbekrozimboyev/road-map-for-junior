package com.just.go.aggregate;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 6:56 PM}
 */
@Getter
@Setter
public abstract class Entity {
    //
    protected String id;

    protected Entity(){
        this.id = UUID.randomUUID().toString();
    }
    public Entity(String id) {
        this.id = id;
    }
}
