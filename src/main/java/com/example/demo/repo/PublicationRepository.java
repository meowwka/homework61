package com.example.demo.repo;

import com.example.demo.model.Publication;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface PublicationRepository extends CrudRepository<Publication,String> {
    List<Publication> getPublicationsByUserId(String userId);

    List<Publication> getPublicationsByUserIdNot(String userId);
    Set<Publication> getPublicationByUserIdIn(List<String> idList);

    Publication getPublicationByUserId(String userId);
}