package kr.hs.emirim.Sagittta.kotlinsample

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1() {
        Assert.assertEquals(4, 1+3)
    }

    @Test
    fun testGetterSetter() {
        val person = Person("John")
        person.age = 20

        Assert.assertEquals(20, person.age)
        Assert.assertEquals("John", person.name)
    }

    @Test
    fun testSetNickname() {
        val person = Person("John")
        person.nickname = "Banana"

        Assert.assertEquals("banana", person.nickname)
    }

    @Test
    fun testUser() {
        val user = User()
        user.nickname = "death note"

        Assert.assertEquals("DEATH NOTE", user.nickname)
    }
}