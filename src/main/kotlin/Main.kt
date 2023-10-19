fun main() {
    fun wrappedFoo2() {
        Baz().timerMinimalCopy { return }
    }
    wrappedFoo2()
}