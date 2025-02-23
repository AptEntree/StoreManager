package apt.dev.store.manager.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import apt.dev.store.manager.util.NavigationEnum
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = NavigationEnum.LOGIN.name) {
            composable(NavigationEnum.LOGIN.name) {  }
            composable(NavigationEnum.MAIN.name) {  }
        }

    }
}