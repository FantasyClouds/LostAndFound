package com.example.test1.service;


import com.example.test1.dao.entity.Student;

import java.util.List;

public interface StudentOperation {
    public List<Student> getStudentList();

    public void addStudent(Student student);

    //��ȡ��ҳ����
    public List<Student> getStudentList(int page, int perPage);

    //��ȡѧ������
    public int getStudentCount();

    public boolean deleteStudent(List<Student> data);
    //Amis��ܵ�������ѧ��
    public int updateStudent(Student student);

    //Amis��ܵ���ɾ��ѧ��
    public boolean deleteStudentAmis(Long id);

    //Amis�����ӵ���ѧ��
    public boolean addStudentAmis(Student student);

    //Amis�������ѧ��
    public List<Student> searchStudent(Long sno, String name, Integer sage, String ssex, String grade, Integer classs, Boolean isAnd);
}
