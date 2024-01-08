package redis.lettuceproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.lettuceproject.entity.Member;
import redis.lettuceproject.repository.RedisRepository;

@Service
public class RedisServiceImpl implements RedisService{
    @Autowired
    private final RedisRepository redisRepository;

    public RedisServiceImpl(RedisRepository redisRepository) {
        this.redisRepository = redisRepository;
    }

    public void setRedisData() {
        Member member = new Member("springredis", 99);
        redisRepository.save(member);
    }
}
