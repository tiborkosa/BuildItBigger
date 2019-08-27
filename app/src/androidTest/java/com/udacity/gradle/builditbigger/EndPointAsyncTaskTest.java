package com.udacity.gradle.builditbigger;

import android.text.TextUtils;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {
    private String result = null;

    @Test
    public void jokeLoadedTest() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        new EndPointsAsyncTask(new EndPointsAsyncTask.JokeListener() {
            @Override
            public void jokeListener(String joke) {
                result = joke;
                countDownLatch.countDown();
            }

        }).execute();

        try {
            countDownLatch.await();
            assertNotNull("joke is null", result);
            assertFalse("joke is empty", TextUtils.isEmpty(result));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
