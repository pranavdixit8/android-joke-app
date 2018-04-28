package com.udacity.gradle.builditbigger;

import android.app.Fragment;
import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Toast;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void test_Asynctask_retrieve() throws InterruptedException {
        MainActivityFragment fragment = (MainActivityFragment) mActivityTestRule.getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment);
        new EndpointAsyncTask().execute(fragment);
        Thread.sleep(2000);
        onView(withId(R.id.tv_joke)).check(matches(withText("This is my first joke and its recursive")));

    }




}