package design.creator.builder;

import lombok.Data;

/**
 * Created by jianweilin on 2017/9/3.
 */
@Data
public class Student {
    private String name;
    private Integer age;
    private String comeFrom;

    public Student(Builder builder){
        this.age = builder.getAge();
        this.name = builder.getName();
        this.comeFrom = builder.getComeFrom();
    }

    public static Builder builder(){
        return new Builder();
    }

    @Data
    public static class Builder {
        private String name;
        private Integer age;
        private String comeFrom;

        public Builder withAge(Integer age){
            this.age = age;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withComeFrom(String comeFrom){
            this.comeFrom = comeFrom;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
