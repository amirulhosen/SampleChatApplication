package com.chatapplication

import android.content.Context
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.widget.EditText
import android.widget.ImageView
import androidx.test.core.app.ApplicationProvider
import com.chatapplication.view.MainActivity
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class PgButtonTest {

    var activity: MainActivity? = null
    var firstNumber: EditText? = null
    var btnAdd: ImageView? = null

    @Before
    fun setup() {
        val context: Context = ApplicationProvider.getApplicationContext<MainActivity>()
    }

    /**
     * If it is a tertiary button, it should not have a background
     */
    @Test
    fun testSetTertiary_NoBackground() {

        onView(withId(R.id.msgBox))       // onView() is a ViewMatcher</strong>
                .perform(click())              // click()  is a ViewAction</strong>
                .check(matches(isDisplayed()));
    }


}
