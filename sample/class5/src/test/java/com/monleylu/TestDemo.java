package com.monleylu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by monley_Lu on 2018/4/26.
 */
public class TestDemo {



    @Test
    public void testGetName(){
        String name = "jmeter";
        Demo demo = new Demo();
        assertEquals("test","name is:" +name,demo.getName(name));
    }
}
