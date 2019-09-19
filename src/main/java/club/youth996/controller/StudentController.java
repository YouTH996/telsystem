package club.youth996.controller;

import club.youth996.entity.Student;
import club.youth996.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption
 */
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/login1")
    public String login(Student student, HttpSession session) {
        Student student1 = studentService.selectStudent(student);
        if (student1 != null) {
            session.setAttribute("student", student1);
            return "login";
        }
        return "redirect:login.jsp";
    }
}
