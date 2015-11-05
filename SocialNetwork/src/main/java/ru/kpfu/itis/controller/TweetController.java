package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.kpfu.itis.model.Tweet;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.UserRepository;
import ru.kpfu.itis.service.TweetService;
import ru.kpfu.itis.service.UserService;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Controller
public class TweetController {

    @Autowired
    TweetService tweetService;

    @Autowired
    UserService userService;

    /*@RequestMapping("/tweets/add")
    @ResponseStatus(HttpStatus.OK)
    public void addTweet(@RequestParam("text") String text, @RequestParam("currUsername") String currUsername) {
        User user = userService.findOneByUsername(currUsername);
        tweetService.addTweet(user, text);
    }*/

    @RequestMapping("/tweets/add")
    @ResponseStatus(HttpStatus.OK)
    public void addTweet(@RequestParam("text") String text, @RequestParam("currUsername") String username) {
        User user = userService.findOneByUsername(username);
        tweetService.addTweet(user, text);
    }

    @RequestMapping("/tweets/getAll")
    public String getAllTweetsPage(@RequestParam("currUsername") String username, Model model) {
        /*User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();*/
        User user = userService.findOneByUsername(username);
        List<Tweet> tweets = tweetService.getTweets(user);
        model.addAttribute("tweets", tweets);
        return "tweet-list";
    }

   /* @Autowired //FIXME BAD!! Almost
            UserRepository userRepository;

    @Autowired
    TweetService tweetService;

    @RequestMapping("/tweets/add")
    @ResponseStatus(HttpStatus.OK)
    public void addTweet(@RequestParam("text") String text) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        tweetService.addTweet(user, text);
    }

    @RequestMapping("/tweets/getAll")
    public String getAllTweetsPage(Model model) {
        List<Tweet> tweets = tweetService.getAll();
        model.addAttribute("tweets", tweets);
        return "tweet-list";

    }*/
}
