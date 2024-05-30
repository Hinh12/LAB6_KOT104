package com.example.lab6

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration: String,
    val releaseDate: String,
    val genre: String,
    val shortDescription: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie("Movie 1", "2021", "https://sb.tinhte.vn/2020/12/5264193_thon-phe-tinh-khong.jpg", "120 min", "2021-01-01", "Action", "Short description 1"),
            Movie("Movie 2", "2022", "https://sb.tinhte.vn/2020/12/5264193_thon-phe-tinh-khong.jpg", "90 min", "2022-01-01", "Comedy", "Short description 2"),
            Movie("Movie 3", "2023", "https://sb.tinhte.vn/2020/12/5264193_thon-phe-tinh-khong.jpg", "110 min", "2023-01-01", "Drama", "Short description 3")
        )
    }
}

enum class ListType {
    ROW, COLUMN, GRID
}