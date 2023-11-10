package ktln

import interfaces.Animal
import java.util.Objects

class Node<T: Animal> (var value: T){
    var nextNode: Node<T>? = null
    var prevNode: Node<T>? = null
}