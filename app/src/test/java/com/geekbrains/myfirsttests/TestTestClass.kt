package com.geekbrains.myfirsttests



import org.junit.Assert.*
import org.junit.Test

class TestTestClass {

    @Test
    fun correct_sum(){
        assertEquals(8,NewClassForTest().sumN(4))
    }
    @Test
    fun incorrect_sum(){
        assertNotEquals(8,NewClassForTest().sumN(6))
    }
    @Test
    fun null_sum(){

        assertNull(NewClassForTest().funNull(null))

    }
    @Test
    fun array(){
        val arr1 = arrayOf(NewClassForTest().sumN(1))
        val arr2 = arrayOf(NewClassForTest().sumN(1))
        assertArrayEquals(arr1,arr2)
    }



    @Test
    fun not_null_sum(){
        assertNotNull(NewClassForTest().funNull("not null"))
    }

    @Test
    fun sameTest(){
        assertSame("Good",NewClassForTest().funNull("Good"),NewClassForTest().funNull("Good"))
    }
}