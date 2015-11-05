package ru.kpfu.itis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.model.Tweet;
import ru.kpfu.itis.model.User;

import java.util.List;

@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long> {

    public List<Tweet> findByUserOrderByDateDesc(User user);

}
