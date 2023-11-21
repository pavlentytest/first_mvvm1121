package com.example.myapplication

class Calculator {
    fun calc(a: Int, b: Int) = a+b
    fun getLength(str: String?) : Boolean {
        println(str!!.length)
        return true
    }
}