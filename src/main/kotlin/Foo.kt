interface Foo {
    fun counter(name: String, tags: Map<String, String?>): String
}

class Baz : Foo {
    override fun counter(name: String, tags: Map<String, String?>): String {
        throw Error("hello")
    }
}

inline fun Foo.timerMinimalCopy(
    f: () -> Unit
): Unit {
    var duration: String? = null
    try {
        f()
        duration = "foo"
    } finally {
        try {
            if (duration == null) {
                // Set duration so its never null
                duration = "bar"
            }
            println("duration ${duration.length}")
        } catch (t: Throwable) {
            throw t
        }
    }
}