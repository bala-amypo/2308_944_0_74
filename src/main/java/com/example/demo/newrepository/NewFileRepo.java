package com.example.demo.newrepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.newentity.NewFileEntity;
@Repository
public interface NewFileRepo extends JpaRepository<NewFileEntity,Long>{

}