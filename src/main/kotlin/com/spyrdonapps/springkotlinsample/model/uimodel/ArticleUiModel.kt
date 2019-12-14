package com.spyrdonapps.springkotlinsample.model.uimodel

data class ArticleUiModel(
    val slug: String,
    val title: String,
    val headline: String,
    val content: String,
    val author: UserUiModel,
    val addedAt: String
)