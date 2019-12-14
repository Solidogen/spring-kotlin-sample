package com.spyrdonapps.springkotlinsample.repository

import com.spyrdonapps.springkotlinsample.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
  fun findByLogin(login: String): User?
}
