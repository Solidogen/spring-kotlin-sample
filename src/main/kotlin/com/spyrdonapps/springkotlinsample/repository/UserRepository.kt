package com.spyrdonapps.springkotlinsample.repository

import com.spyrdonapps.springkotlinsample.model.entity.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserEntity, Long> {
  fun findByLogin(login: String): UserEntity?
}
