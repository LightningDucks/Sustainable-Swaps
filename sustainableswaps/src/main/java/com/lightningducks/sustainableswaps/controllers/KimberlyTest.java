package com.lightningducks.sustainableswaps.controllers;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class KimberlyTest {
    @Test
    public void testA4Kimberly() {
        WebController testWeb = new WebController();
        Map testLunch = testWeb.a4Kimberly();
        Assert.assertNotNull(testLunch);
    }

}
