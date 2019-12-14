package com.spyrdonapps.springkotlinsample.controller.api

import com.spyrdonapps.springkotlinsample.model.entity.UserEntity
import com.spyrdonapps.springkotlinsample.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/user")
class UserApiController(private val repository: UserRepository) {

    @GetMapping("/")
    fun findAll(): Iterable<UserEntity> = repository.findAll()

    @GetMapping("/{login}")
    fun findByLogin(@PathVariable login: String) =
        repository.findByLogin(login) ?: ResponseStatusException(HttpStatus.NOT_FOUND, "This user does not exist")
}