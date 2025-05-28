package com.example.test1.controller;
import com.example.test1.dao.entity.Student;
import com.example.test1.util.Response;
import com.example.test1.util.ResponseCrud;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public interface TestController {
    @GetMapping("/data/students")
    public ResponseEntity<Response<List<Student>>> getStudentList();
    @PostMapping("/data/studentsPost")
    public ResponseEntity<Response<String>> addStudent(@RequestBody Map<String, Object> studentData);
    @PostMapping("/data/studentsDelete")
    public ResponseEntity<Response<String>> deleteStudent(@RequestBody List<Long> studentData);

    //Amis�޸ĵ���ѧ��
    @PostMapping("/data/testForm/Alter/{StudentInternalId}")
    public ResponseEntity<Response<Boolean>> alterStudent(@PathVariable Long id,
                                                          @RequestBody Map<String, Object> studentData);
    //Amisɾ������ѧ��
    @PostMapping("/data/testForm/studentDeleteAmis/{Sno}")
    public ResponseEntity<Response<Boolean>> deleteStudentAmis(@PathVariable Long id);

    //Amis��ӵ���ѧ��

    @PostMapping("/data/testForm/Add/{Sno}")
    public ResponseEntity<Response<Boolean>> addStudentAmis(@PathVariable Long id,
                                                            @RequestBody Map<String, Object> studentData);
    //Amis����ѧ����������ҳ�ͻ�ȡȫ��ѧ��
    @GetMapping("/data/testForm/search")
    public ResponseEntity<Response<ResponseCrud<Student>>> searchStudent(
            @RequestParam(required = false) Long sno,
            @RequestParam(required = false) String sname,
            @RequestParam(required = false) Integer sage,
            @RequestParam(required = false) String ssex,
            @RequestParam(required = false) String grade,
            @RequestParam(required = false) Integer classs,
            @RequestParam(required = false) Boolean isAnd,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer perPage);
}
