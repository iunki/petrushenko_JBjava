package ru.kpfu.itis.service;

import ru.kpfu.itis.model.Tweet;
import ru.kpfu.itis.model.User;

import java.util.List;

public interface TweetService {

    void addTweet(User user, String text);

    public List<Tweet> getTweets(User user);


}
