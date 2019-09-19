package club.youth996.service.impl;

import club.youth996.entity.Student;
import club.youth996.mapper.StudentMapper;
import club.youth996.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhanxinjian
 * @date 2019/9/14
 * @Descritption
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student selectStudent(Student student) {
        return studentMapper.selectStudent(student);
    }

}
