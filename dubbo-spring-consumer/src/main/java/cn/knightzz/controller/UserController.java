package cn.knightzz.controller;

import cn.knightzz.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王天赐
 * @title: UserController
 * @projectName dubbo-codes
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2023-01-08 10:28
 */
@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("/test")
    public String test() {
        return userService.sayHello("test");
    }

}
