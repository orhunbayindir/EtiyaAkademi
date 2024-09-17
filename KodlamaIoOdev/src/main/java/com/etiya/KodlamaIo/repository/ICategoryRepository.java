package com.etiya.KodlamaIo.repository;

import com.etiya.KodlamaIo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository <Category,Long>{

}
