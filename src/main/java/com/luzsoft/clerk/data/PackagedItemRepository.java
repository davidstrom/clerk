package com.luzsoft.clerk.data;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PackagedItemRepository {

    Optional<PackagedItemEntity> getOneByCode(String code);

}
