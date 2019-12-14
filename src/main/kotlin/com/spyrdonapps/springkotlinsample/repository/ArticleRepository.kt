package com.spyrdonapps.springkotlinsample.repository

import com.spyrdonapps.springkotlinsample.model.Article
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
  fun findBySlug(slug: String): Article?
  fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}
