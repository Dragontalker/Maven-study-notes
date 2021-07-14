package com.dragontalker.maven;
import org.junit.Test;
import static junit.framework.Assert.*;
public class HelloTest {
    @Test
    public void testHello() {
        Hello hello = new Hello();
        String reuslts = hello.sayHello("litingwei");
        assertEquals("Hello litingwei!", reuslts);
    }
}