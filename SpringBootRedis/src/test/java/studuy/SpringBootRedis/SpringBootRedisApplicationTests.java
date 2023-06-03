package studuy.SpringBootRedis;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import studuy.SpringBootRedis.Utils.RedisUtlis;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootRedisApplicationTests {
    @Autowired
    private RedisUtlis redisUtlis;

    @Test
    void TestRedisSetValue() {
        boolean b = redisUtlis.set("k6",1);
        System.out.println(b);
    }

    @Test
    void TestRedisGetValue() {
        Object k6 = redisUtlis.get("k6");
        System.out.println(k6);
    }

}
