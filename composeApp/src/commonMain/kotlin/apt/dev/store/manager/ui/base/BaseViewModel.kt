package apt.dev.store.manager.ui.base

import androidx.lifecycle.ViewModel

open class BaseViewModel<E: BaseEvent, A: BaseAction>: ViewModel() {

    private var eventListener: (E) -> Unit = {}

    fun setEventListener(newEventListener: (E) -> Unit) {
        eventListener = newEventListener
    }

    fun sendEvent(event: E) = eventListener.invoke(event)

    fun startAction(action: A) {

    }
}