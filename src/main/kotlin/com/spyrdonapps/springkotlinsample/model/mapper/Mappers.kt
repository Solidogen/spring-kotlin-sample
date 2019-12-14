package com.spyrdonapps.springkotlinsample.model.mapper

import com.spyrdonapps.springkotlinsample.model.entity.ArticleEntity
import com.spyrdonapps.springkotlinsample.model.entity.UserEntity
import com.spyrdonapps.springkotlinsample.model.uimodel.ArticleUiModel
import com.spyrdonapps.springkotlinsample.model.uimodel.UserUiModel
import com.spyrdonapps.springkotlinsample.utils.englishFormat

fun ArticleEntity.toUiModel() = ArticleUiModel(
    slug,
    title,
    headline,
    content,
    author.toUiModel(),
    addedAt.englishFormat()
)

fun UserEntity.toUiModel() = UserUiModel(
    login,
    firstName,
    lastName,
    description
)
