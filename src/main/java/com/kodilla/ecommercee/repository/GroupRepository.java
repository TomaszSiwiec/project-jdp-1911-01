package com.kodilla.ecommercee.repository;

<<<<<<< HEAD
public interface GroupRepository{
=======
import com.kodilla.ecommercee.domain.Group;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GroupRepository extends CrudRepository<Group, Long> {

    @Override
    List<Group> findAll();

    @Override
    Optional<Group> findById(Long id);

    @Override
    Group save(Group group);
>>>>>>> GroupController - first implementation, draft for Group, GroupDto, Repository, Service
}
