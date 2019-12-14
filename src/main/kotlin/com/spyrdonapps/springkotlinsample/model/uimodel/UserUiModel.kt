package com.spyrdonapps.springkotlinsample.model.uimodel

data class UserUiModel(
    val login: String,
    val firstName: String,
    val lastName: String,
    val description: String? = null
)