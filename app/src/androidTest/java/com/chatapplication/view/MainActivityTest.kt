package com.chatapplication.view

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.chatapplication.R
import com.chatapplication.model.ChatModel
import com.chatapplication.viewModel.ChatViewModel
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith



@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentationTest {

    lateinit var viewModel: ChatViewModel
    lateinit var chatModel: ChatModel

    @Rule
    @JvmField
    public val rule = ActivityTestRule(MainActivity::class.java)


    @Test
    fun displayedAll() {
        onView(withId(R.id.mRecycleView)).check(matches(isDisplayed()));
        onView(withId(R.id.msgBox)).check(matches(isDisplayed()));
        onView(withId(R.id.sendBtn)).check(matches(isDisplayed()));
    }


    @Test
    fun checkTextEntry() {
        onView(withId(R.id.msgBox)).perform(ViewActions.typeText("testing"));
    }

    @Test
    fun CheckbButtonClick() {
        onView(withId(R.id.sendBtn)).perform(ViewActions.click());
    }
}