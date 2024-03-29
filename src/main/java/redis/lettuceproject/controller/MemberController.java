package redis.lettuceproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.lettuceproject.service.RedisService;

@RestController
public class MemberController {

    private final RedisService redisService;

    public MemberController(RedisService redisService) {
        this.redisService = redisService;
    }

    @GetMapping
    public String setPersonInfo() {
        redisService.setRedisData();
        return "ok";
    }
}
