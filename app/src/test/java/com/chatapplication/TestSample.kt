package com.chatapplication

import android.widget.EditText
import android.widget.ImageView
import com.chatapplication.view.MainActivity
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class PgButtonTest {

    var activity: MainActivity? = null
    var firstNumber: EditText? = null
    var btnAdd: ImageView? = null

    @Before
    fun setup(){
        activity = Robolectric.setupActivity(MainActivity::class.java)
        firstNumber = activity?.findViewById(R.id.msgBox) as EditText
        btnAdd = activity?.findViewById(R.id.sendBtn) as ImageView

    }

    /**
     * If it is a tertiary button, it should not have a background
     */
    @Test
    fun testSetTertiary_NoBackground() {
        //setup

        firstNumber?.setText("12.2");

        //test
        btnAdd?.performClick();

        //verify
        assertEquals(25.5, firstNumber?.text.toString().toDouble(), 0.0);


    }


}
