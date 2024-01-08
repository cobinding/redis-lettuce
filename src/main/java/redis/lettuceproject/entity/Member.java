package redis.lettuceproject.entity;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("member")
public class Member {
    @Id
    private String id;   // redis는 key- value 쌍이기 떄문에 person:<Id> 이런식으로 들어감
    private String  name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
