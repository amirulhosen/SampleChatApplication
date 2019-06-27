package com.chatapplication;

import org.junit.Test;

//import android.content.res.ColorStateList
//import android.graphics.Color
//import android.graphics.Paint.UNDERLINE_TEXT_FLAG
//import android.graphics.drawable.AnimatedStateListDrawable
//import android.graphics.drawable.RippleDrawable
//import android.view.ContextThemeWrapper
//import androidx.test.core.app.ApplicationProvider
//import org.junit.Assert
//import org.junit.Before
//import org.junit.Test
//import org.junit.runner.RunWith
//import org.robolectric.RobolectricTestRunner
//import java.lang.reflect.Field
//
//@RunWith(RobolectricTestRunner::class)
//class PgButtonTest {
//
//    private val context: Context = ApplicationProvider.getApplicationContext()
//
//
//    @Before
//    fun setup(){
//        context.setTheme(R.style.Theme_MaterialComponents_Light)
//    }
//
//    /**
//     * If it is a tertiary button, it should not have a background
//     */
//    @Test
//    fun testSetTertiary_NoBackground() {
//
//        val newContext = ContextThemeWrapper(context,R.style.Widget_Pg_TertiaryButton)
//
//        val button = PgButton(newContext)
//
//        Assert.assertNull(button.background)
//
//    }
//
//    /**
//     * If it is a tertiary button, the text should be underlined
//     */
//    @Test
//    fun testSetTertiary_TextIsUnderlined(){
//
//        val newContext = ContextThemeWrapper(context,R.style.Widget_Pg_TertiaryButton)
//
//        val button = PgButton(newContext)
//
//        button.text = "Pay Now"
//
//        assert((button.paintFlags and UNDERLINE_TEXT_FLAG) != 0)
//    }
//
//
//}
