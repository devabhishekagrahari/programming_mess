package dev.abhishekagrahari.programming_mess.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.abhishekagrahari.programming_mess.view.ChapterList
import dev.abhishekagrahari.programming_mess.view.baseLayout
import dev.abhishekagrahari.programming_mess.view.chapterList
import dev.abhishekagrahari.programming_mess.view.cppUiView

@Composable
fun navigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("cppUiView/{title}/{description}/{inputCodeSnippet}/{outputCodeSnippet}") { backStackEntry ->
            baseLayout {
                cppUiView(
                    navController = navController,
                    title = backStackEntry.arguments?.getString("title") ?: "",
                    description = backStackEntry.arguments?.getString("description") ?: "",
                    inputCodeSnippet = backStackEntry.arguments?.getString("inputCodeSnippet")
                        ?: "",
                    outputCodeSnippet = backStackEntry.arguments?.getString("outputCodeSnippet")
                        ?: ""
                )
            }
        }
        composable("home"){
            baseLayout { ChapterList(
                chapters = chapterList,
                navController = navController
            ) }
        }
        // Other composables
    }
}
