package com.shapkin.student_planner.navigation

import javax.security.auth.Subject

sealed class Screen(val route: String){
    object Home: Screen("home")
    object Details: Screen("detalis/{subjectId}"){
        fun createRoute(subjectId: String)="details/$subjectId"
    }
    object Profile: Screen("profile")
    object Settings: Screen("settings")
}