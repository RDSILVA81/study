package br.com.data.study.repository;

import br.com.data.study.entity.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People, Long> {
}
