package club.youth996.entity;

import lombok.Data;

/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption
 */
@Data
public class Student {
    /**
     * id
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;

    public Student() {
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
