package apt.dev.store.manager

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import apt.dev.store.manager.ui.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "StoreManager",
    ) {
        App()
    }
}