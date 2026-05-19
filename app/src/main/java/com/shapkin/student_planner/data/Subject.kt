package com.shapkin.student_planner.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits:Int,
    val currentGrade: String,
    val description: String
)
val samleSubjects=listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    ),
    Subject(
        id = "2",
        name = "Математика",
        professor = "Трошина",
        credits = 90,
        currentGrade = "Хорошо",
        description = "Тотальный ужас"
    ),
    Subject(
        id = "3",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust: управление памятью без сборщика мусора, многопоточность, работа с операционной системой и создание высокопроизводительных системных компонентов."
    ),
    Subject(
        id = "4",
        name = "РПМ",
        professor = "Донскова",
        credits = 78,
        currentGrade = "Хорошо",
        description = "Что-то делаем в VS"
    ),
    Subject(
        id = "5",
        name = "Проектная деятельность",
        professor = "Трошина",
        credits = 71,
        currentGrade = "Хорошо",
        description = "Проджект отстой"
    ),
    Subject(
        id = "6",
        name = "Физическая культура",
        professor = "Курбаныч",
        credits = 71,
        currentGrade = "Хорошо",
        description = "Бегаем прыгаем как инвалиды"
    ),
)