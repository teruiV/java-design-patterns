package design.creator.builder;

import com.alibaba.fastjson.JSON;

/**
 * 模式: 建造者模式
 * Created by jianweilin on 2017/9/3.
 */
public class Bootstrap {
    public static void main(String[] args) {
        Student student = Student.builder().withAge(12).withName("张三").withComeFrom("china").build();
        System.out.println(JSON.toJSONString(student));
    }
}
