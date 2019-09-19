import club.youth996.entity.Student;
import club.youth996.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhanxinjian
 * @date 2019/9/15
 * @Descritption
 */
public class StudentTest {
    @Autowired
    StudentService studentService;
    @Test
    public void selectStudentTest() throws Exception {
        Student john = studentService.selectStudent(new Student(2, "marry"));
        System.out.println(john);

    }
}
