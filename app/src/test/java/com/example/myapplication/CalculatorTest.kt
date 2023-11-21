package com.example.myapplication

import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculatorTest {

     var calculator: Calculator? = null

    @Before
    fun setUp4e345() {
        calculator = Calculator()
    }

    @After
    fun tearDownadgadfg() {
        calculator = null
    }

    @Test
    fun calc() {
        assertEquals(100, calculator?.calc(4,5) ?: 0)
    }

     @Test
    fun calc2() {
         assertEquals(100, calculator?.calc(50,50) ?: 0)
    }

    @Test
    fun test3() {
        Assume.assumeNotNull(4,5,6, null)
    }

    @Test(expected = NullPointerException::class)
    fun test4() {
        calculator?.let { assertTrue(it.getLength("null")) }
    }
}