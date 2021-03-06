package com.cloud.justyou.mapper;

<<<<<<< HEAD
import com.cloud.justyou.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Author :
 * @Description :
 * @Date : 2020/5/12 9:58
 * @Version ：1.0
 */


//这个注解表示了这是一个mybatis的mapper类
@Mapper

@Repository
public interface UserMapper {

    /**
     * @param user_name 用户名
     * @param user_password 密码
     * @return 用户对象
     */
    Users login(@Param("user_name") String user_name, @Param("user_password") String user_password);


    /**
     * @param user_id
     * @param user_password
     * @param user_name
     * @param user_email
     * @param user_birthday
     * @param user_telephone_number
     * @param user_nickname
     */
    void register(@Param("user_id") long user_id,
                  @Param("user_password") String user_password,
                  @Param("user_name") String user_name,
                  @Param("user_email") String user_email,
                  @Param("user_birthday") Date user_birthday,
                  @Param("user_telephone_number") String user_telephone_number,
                  @Param("user_nickname") String user_nickname);
=======
import com.cloud.justyou.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author HP
 */
@Mapper
public interface UserMapper {
    /**
     * 更新一个用户
     * @param user 插入用户
     */
    boolean updateOne(@Param("user") User user);

    /**
     * @param userId 用户id
     * @return 用户信息
     */
    User selectOne(@Param("userId") int userId);
>>>>>>> 9520ddb0b720bff4fce0c6127f076862f7cccd2b
}
