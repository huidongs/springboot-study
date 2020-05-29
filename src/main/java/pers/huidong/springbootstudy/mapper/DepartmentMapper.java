package pers.huidong.springbootstudy.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pers.huidong.springbootstudy.bean.Department;

/**
 * @auther huidong
 * @date 2020/5/29 16:35
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * form department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete form department where id = #{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id = #{id}")
    public int updateDept(Department department);
}
