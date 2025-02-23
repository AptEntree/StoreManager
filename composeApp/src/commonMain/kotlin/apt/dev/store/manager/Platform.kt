package apt.dev.store.manager

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform