package apt.dev.store.manager

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "StoreManager",
    ) {
        App()
    }
}