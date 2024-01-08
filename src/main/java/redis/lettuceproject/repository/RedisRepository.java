package redis.lettuceproject.repository;

import org.springframework.data.repository.CrudRepository;
import redis.lettuceproject.entity.Member;

public interface RedisRepository extends CrudRepository<Member, String> {
}
