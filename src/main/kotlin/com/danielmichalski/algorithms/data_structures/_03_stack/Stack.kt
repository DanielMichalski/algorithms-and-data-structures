package com.danielmichalski.algorithms.data_structures._03_stack

import com.danielmichalski.algorithms.data_structures._01_singly_linked_list.Node

class Stack {

    private var first: Node?
    private var last: Node?
    private var size: Int

    init {
        this.first = null
        this.last = null
        this.size = 0
    }

    fun push(value: String): Int {
        val newNode = Node(value)
        if (this.first == null) {
            this.first = newNode
            this.last = newNode
        } else {
            val temp = this.first
            this.first = newNode
            this.last
            this.first!!.setNext(temp)
        }
        return ++this.size
    }

    fun pop(): String? {
        if (this.size == 0) {
            return null
        }

        val temp = this.first

        if (this.first == this.last) {
            this.last = null
        }
        this.first = this.first!!.getNext()
        this.size--
        return temp!!.getValue()
    }

    override fun toString(): String {
        return "First: $first\n" +
                "Last: $last\n" +
                "Size: $size\n"
    }

}
