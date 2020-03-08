package com.dinazor.user.repository;

import com.dinazor.core.entity.user.UserEntity;
import com.dinazor.core.repository.abstracts.SoftDeleteCrudRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends SoftDeleteCrudRepo<UserEntity, Long> {
}
