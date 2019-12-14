package com.spyrdonapps.springkotlinsample.controller.ui

import com.spyrdonapps.springkotlinsample.AppProperties
import com.spyrdonapps.springkotlinsample.model.mapper.toUiModel
import com.spyrdonapps.springkotlinsample.repository.ArticleRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainPageUiController(
    private val repository: ArticleRepository,
    private val properties: AppProperties
) {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = properties.title
        model["banner"] = properties.banner
        model["articles"] = repository.findAllByOrderByAddedAtDesc().map { it.toUiModel() }
        return "blog"
    }
}
