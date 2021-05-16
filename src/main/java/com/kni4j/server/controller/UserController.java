package com.kni4j.server.controller;

import com.kni4j.server.entity.User;
import com.kni4j.server.response.Response;
import com.kni4j.server.service.IUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: Kenfe4jController
 * @Auther: Yuu
 * @Description: 用户 - 前端控制器
 */
@RestController
@RequestMapping("user")
@Api(tags = "用户模块")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 用户列表
     *
     * @param pageNo 第一页
     * @param pageSize 每页的大小
     * @return
     */
    @ApiOperation(value = "用户列表", notes = "获取用户列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "分页-第几页", required = true, paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "分页-每页的大小", required = true, paramType = "query", dataType = "int")
    })
    @GetMapping("list")
    public Response<List<User>> getUserList(@RequestParam Integer pageNo, @RequestParam Integer pageSize) {

        // 模拟数据库查询用户列表
        List<User> users = userService.list(pageNo, pageSize);
        return Response.success(users);
    }
}
