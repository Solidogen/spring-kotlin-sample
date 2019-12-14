package com.spyrdonapps.springkotlinsample.model.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class UserEntity(
    var login: String,
    var firstName: String,
    var lastName: String,
    var description: String? = null,
    @Id @GeneratedValue var id: Long? = null
)
