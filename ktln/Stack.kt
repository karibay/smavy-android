package ktln

interface Stack<T> {
    fun add(value: T)
    fun pop(): T
}