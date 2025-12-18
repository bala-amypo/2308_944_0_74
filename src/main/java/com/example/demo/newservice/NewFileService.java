package com. example.demo.newservice;

import java.util.List;

import com.example.demo.newentity.NewFileEntity;

public interface NewFileService {
    NewFileEntity savedata(NewFileEntity newfile);
    NewFileEntity getidval(Long id);
    List<NewFileEntity> getall();
    NewFileEntity update(Long id, NewFileEntity newfile);
    void delete(Long id);
}