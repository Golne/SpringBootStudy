package com.example.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhong
 * @since 2020-04-14
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public boolean addUser(UserVo userVo) {
        User user = new User();
        user.setCode(userVo.getCode());
        user.setName(userVo.getName());

        int result = userDao.insert(user);

        if (result < 1) {
            log.info("新增用户异常");
            return false;
        }
        return true;
    }

    @Override
    public boolean updateUser(UserVo userVo) {
        User user = new User();
        user.setId(userVo.getId());
        user.setCode(userVo.getCode());
        user.setName(userVo.getName());
        user.setStatus(userVo.getStatus());
        int result = userDao.updateById(user);
        if (result < 1) {
            log.info("修改用户信息异常");
            return false;
        }
        return true;
    }

    @Override
    public User selectUserById(String id) throws Exception {
        User user = userDao.selectById(id);
        return user;
    }
}
