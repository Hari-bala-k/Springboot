package com.example.springJPA.Repository;

import com.example.springJPA.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
    List<Student> findBystuTech(String technology);

      @Query(value = "select * from student where stuid = :stuID and stu_tech = :stuTech", nativeQuery = true)
      List<Student> findByIdAndTech(@Param("stuID") int stuID,@Param("stuTech") String stuTech);

      @Query(value = "select * from student where stu_tech=:stuTech and gender=:gender",nativeQuery = true)
    List<Student> findByTechAndGender(@Param("stuTech") String tech,@Param("gender")String gender);
}
