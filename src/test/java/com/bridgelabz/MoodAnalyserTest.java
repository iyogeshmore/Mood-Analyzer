package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
//    @Test
//    public void givenMessage_WhenProper_ShouldReturnSad() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String result = moodAnalyser.analyseMood("I am in Sad mood");
//        Assertions.assertEquals("Sad",mood);
//    }
//    @Test
//    public void givenMessage_WhenProper_ShouldReturnHappy() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String result = moodAnalyser.analyseMood("I am in Happy mood");
//        Assertions.assertEquals("Happy", mood);
//    }
@Test
public void givenMessage_WhenSad_ShouldReturnSad() {
    MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad Mood");
    String mood = moodAnalyzer.analyzeMood();
    Assertions.assertEquals("Sad", mood);
}
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("Happy", mood);
    }
}