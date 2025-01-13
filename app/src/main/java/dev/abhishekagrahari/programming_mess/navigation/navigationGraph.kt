package dev.abhishekagrahari.programming_mess.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.abhishekagrahari.programming_mess.view.AboutUsScreen
import dev.abhishekagrahari.programming_mess.view.BaseLayout
import dev.abhishekagrahari.programming_mess.view.ChapterList
import dev.abhishekagrahari.programming_mess.view.ContactUsScreen

import dev.abhishekagrahari.programming_mess.view.chapterList
import dev.abhishekagrahari.programming_mess.view.CppUiView

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("cppUiView/{title}/{description}/{inputCodeSnippet}/{outputCodeSnippet}") { backStackEntry ->
            BaseLayout(
                title = backStackEntry.arguments?.getString("title") ?: "",
                navController = navController ,
            ) {
                CppUiView(
                    description = backStackEntry.arguments?.getString("description") ?: "",
                    inputCodeSnippet = backStackEntry.arguments?.getString("inputCodeSnippet")
                        ?: "",
                    outputCodeSnippet = backStackEntry.arguments?.getString("outputCodeSnippet")
                        ?: ""
                )
            }
        }
        composable("home"){
            BaseLayout (
                navController = navController
            ){ ChapterList(
                chapters = chapterList,
                navController = navController
            ) }
        }
        composable("contact_us"){
            BaseLayout(navController = navController , title ="Contact Us") {
                ContactUsScreen()
            }
        }
        composable("about"){
            BaseLayout(navController = navController , title = " About us") {
                AboutUsScreen()
            }
        }
    }
}
