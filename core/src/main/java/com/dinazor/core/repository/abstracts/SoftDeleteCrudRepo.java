package com.dinazor.core.repository.abstracts;

import com.dinazor.core.entity.abstracts.SoftDeleteEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@NoRepositoryBean
public interface SoftDeleteCrudRepo<TEntity extends SoftDeleteEntity, TId extends Long> extends CrudRepository<TEntity, TId> {

    @Override
    @Transactional(readOnly = true)
    @Query(value = "SELECT e FROM #{#entityName} e WHERE e.deleted = FALSE")
    List<TEntity> findAll();
}
