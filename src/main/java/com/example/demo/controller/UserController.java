package com.example.demo.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhong
 * @since 2020-04-14
 */
@Slf4j
@RestController
@RequestMapping("/demo/user")
@Api(tags = "用户API")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 添加用户
     *
     * @param userVo
     * @return
     * @throws Exception
     */
    @ApiOperation(value = "用户新增")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Map<String, String> addUser(@Valid @RequestBody UserVo userVo) throws Exception {
        Map<String, String> map = new HashMap<>();
        boolean result = userService.addUser(userVo);
        if (!result) {
            map.put("respCode", "0444");
            map.put("respMsg", "新增失败");
        } else {
            map.put("respCode", "0200");
            map.put("respMsg", "新增成功");
        }
        return map;
    }

    /**
     * 修改用户信息
     *
     * @param userVo
     * @return
     * @throws Exception
     */
    @ApiOperation(value = "用户修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Map<String, String> updateUser(@Valid @RequestBody UserVo userVo) throws Exception {
        Map<String, String> map = new HashMap<>();

        boolean result = userService.updateUser(userVo);
        if (!result) {
            map.put("respCode", "0444");
            map.put("respMsg", "修改失败");
        } else {
            map.put("respCode", "0200");
            map.put("respMsg", "修改成功");
        }
        return map;
    }

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    @ApiOperation(value = "用户查询（ID）")
    @ApiImplicitParam(name = "id", value = "查询", required = true)
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Map<String, Object> selectUser(@PathVariable("id") String id) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        User user = userService.selectUserById(id);
        if (user == null) {
            log.info("用户ID:" + id + " 未找到");
        }
        UserVo userVo = UserVo.builder()
                .id(user.getId())
                .code(user.getCode())
                .name(user.getName())
                .status(user.getStatus())
                .build();
        result.put("respCode", "0200");
        result.put("respMsg", "成功");
        result.put("data", userVo);
        return result;
    }

    /**
     * 分页查询
     *
     * @param current
     * @param size
     * @return
     */
    @ApiOperation(value = "用户查询（分页）")
    @RequestMapping(value = "page", method = RequestMethod.GET)
    public Map<String, Object> pageUser(int current, int size) {
        Page<User> page = new Page<>(current, size);
        Map<String, Object> result = new HashMap<>();
        result.put("respCode", "01");
        result.put("respMsg", "成功");
        result.put("data", userService.selectPage(page));
        return result;
    }
}

