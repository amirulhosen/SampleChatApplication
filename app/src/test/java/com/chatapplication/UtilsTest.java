package com.chatapplication;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test
    public void testIsEmailValid() {
        String testEmail = "amirulhosen@gmail.com";
        Assert.assertThat(String.format("Email Validity Test failed for %s ", testEmail), Utils.checkEmailForValidity(testEmail), is(true));

    }

    @Test
    public void testCheckDateWasConvertedCorrectly() {
        long inMillis = System.currentTimeMillis();
        Date date = Utils.calendarDate(inMillis);
        assertEquals("Date time in millis is wrong",
                inMillis * 1000, date.getTime());
    }

    @Test
    public void testEmailValidityPartTwo() {
        String testEmail = "   amirulhosen@gmail.com  ";
        Assert.assertThat(String.format("Email Validity Test failed for %s ", testEmail), Utils.checkEmailForValidity(testEmail), is(true));
    }

    @Test
    public void emailStringNullCheck() {
        Assert.assertThat(Utils.emailStringChecker("amirulhosen@gmail.com"), is("amirulhosen@gmail.com"));
    }

    @Test
    public void emailStringEmptyCheck() {
        Assert.assertThat(Utils.emailStringChecker("amirulhosen@gmail.com"), is("amirulhosen@gmail.com"));
    }

}
