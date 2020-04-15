package com.example.demo.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.entity.User;
import com.example.demo.vo.UserVo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhong
 * @since 2020-04-14
 */
public interface UserService extends IService<User> {

    boolean addUser(UserVo userVo) throws Exception;

    boolean updateUser(UserVo userVo) throws Exception;

    User selectUserById(String id) throws Exception;

}
