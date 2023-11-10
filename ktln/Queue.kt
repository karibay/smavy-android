package ktln

interface Queue<T> {
    fun add(value: T)
    fun remove(): T
}