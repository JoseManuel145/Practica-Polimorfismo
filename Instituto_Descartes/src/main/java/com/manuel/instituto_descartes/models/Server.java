package com.manuel.instituto_descartes.models;

public interface Server {
    void save(Student student);
    void update(String update, String id, String name);
}
