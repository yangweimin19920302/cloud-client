package app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/5/5.
 */
@Component
public class User {
    private @Value("${id:123456}") String id;//如果配置文件没有对id赋值，那么id的默认值就是123456
    private @Value("${age:100}") int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
