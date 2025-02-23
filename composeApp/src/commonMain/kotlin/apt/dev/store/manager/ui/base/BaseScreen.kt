package apt.dev.store.manager.ui.base

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

abstract class BaseScreen<E : BaseEvent, A : BaseAction, V : BaseViewModel<E, A>>(navController: NavController) {

    protected lateinit var viewModel: V

    @Composable
    fun start() {
        onStart()

        initUI()

        onStated()
    }

    @Composable
    open fun onStart() {
        viewModel = getViewModel()
    }

    open fun onStated() {}

    @Composable
    private fun initUI() {
        Scaffold(
            topBar = { topBar() },
            bottomBar = { bottomBar() },
            backgroundColor = getBackground()
        ) { contentPadding ->
            Row(modifier = Modifier.padding(contentPadding)) {
                content()
            }
        }
    }

    @Composable
    open fun topBar() {
    }

    @Composable
    open fun bottomBar() {
    }

    @Composable
    open fun content() {}

    @Composable
    open fun getBackground(): Color = Color.White

    @Composable
    abstract fun getViewModel(): V

}