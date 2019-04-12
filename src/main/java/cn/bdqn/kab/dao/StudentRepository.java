package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    /**
     * 根据班级Id获取学生
     * @param classGradeId
     * @return
     */
    public List<Student> findByClassGradeId(Integer classGradeId);



}
