package kr.hs.emirim.Sagittta.kotlinsample;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {

    @Test
    public void test1() {

        Assert.assertEquals(4, 1+3);
    }

    @Test
    public void testGetterSetter() {

        PersonJava personJava = new PersonJava("John");
        personJava.setAge(20);

        Assert.assertEquals(20, personJava.getAge());
        Assert.assertEquals("John", personJava.getName());

        Person personKotlin = new Person("John");
        personKotlin.setAge(20);

        Assert.assertEquals(20, personKotlin.getAge());
        Assert.assertEquals("John", personKotlin.getName());

    }

    @Test
    public void testSetNickname() {

        PersonJava personJava = new PersonJava("John");

        personJava.setNickname("Apple");
        Assert.assertEquals("apple", personJava.getNickname());

        Person personKotlin = new Person("John");

        personKotlin.setNickname("Apple");
        Assert.assertEquals("apple", personKotlin.getNickname());

    }
}
