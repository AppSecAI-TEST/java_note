package cn.web1992.utils.demo.factory;

/**
 * Created by web1992 on 2016/8/29.
 *
 * @desc
 */
public class People {

    public String name;

    public int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
