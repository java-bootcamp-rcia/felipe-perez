package com.globant.maven;

import static org.junit.Assert.assertTrue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    Logger log=LogManager.getLogger(AppTest.class);
    @Test
    public void shouldAnswerWithTrue()
    {
        log.error("Testing log4j logger error message");
        assertTrue( true );
    }
}
