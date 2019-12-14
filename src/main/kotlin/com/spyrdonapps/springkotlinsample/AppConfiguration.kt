package com.spyrdonapps.springkotlinsample

import com.spyrdonapps.springkotlinsample.model.entity.ArticleEntity
import com.spyrdonapps.springkotlinsample.model.entity.UserEntity
import com.spyrdonapps.springkotlinsample.repository.ArticleRepository
import com.spyrdonapps.springkotlinsample.repository.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfiguration {

    @Bean
    fun databaseInitializer(
        userRepository: UserRepository,
        articleRepository: ArticleRepository
    ) = ApplicationRunner {

        val smaldini = userRepository.save(UserEntity("smaldini", "Stéphane", "Maldini"))
        articleRepository.save(
            ArticleEntity(
                title = "Reactor Bismuth is out",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
            )
        )
        articleRepository.save(
            ArticleEntity(
                title = "Reactor Aluminium has landed",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
            )
        )
    }
}