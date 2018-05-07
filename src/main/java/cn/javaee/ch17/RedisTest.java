package cn.javaee.ch17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;

/**
 * @author lwk
 * @date 2018/5/2 11:29
 */
public class RedisTest {

    public static void main(String[] args) {

        saveRole();

        System.out.println("----END----");
    }

    private static void saveRole(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ch17/applicationContext.xml");
        RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);
        Role role = new Role();
        role.setId(1L);
        role.setRoleName("role_name_1");
        role.setNote("role_note_1");
        redisTemplate.opsForValue().set("role_1",role);
        Role role1 = (Role) redisTemplate.opsForValue().get("role_1");
        System.out.println(role1);
    }

    private static void connectRedis(){
        Jedis jedis = new Jedis("localhost", 6379);
        //jedis.auth("");
        int i = 0;
        try {
            long start = System.currentTimeMillis();
            while (true){
                long end = System.currentTimeMillis();
                if (end-start >= 1000){
                    break;
                }
                i++;
                jedis.set("test"+i, i+"");
            }
        } finally {
            jedis.close();
        }
        System.out.printf("redis每秒操作：%d次",i);
    }
}
