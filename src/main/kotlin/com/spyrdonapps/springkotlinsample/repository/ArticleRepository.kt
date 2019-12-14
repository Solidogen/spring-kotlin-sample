package com.spyrdonapps.springkotlinsample.repository

import com.spyrdonapps.springkotlinsample.model.entity.ArticleEntity
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<ArticleEntity, Long> {
  fun findBySlug(slug: String): ArticleEntity?
  fun findAllByOrderByAddedAtDesc(): Iterable<ArticleEntity>
}
