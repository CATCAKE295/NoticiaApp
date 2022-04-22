package edu.uca.ni.noticiaapp

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)