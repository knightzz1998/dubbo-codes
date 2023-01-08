package cn.knightzz.service.impl;

import cn.knightzz.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 王天赐
 * @title: ConsumerServiceImpl
 * @projectName dubbo-codes
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2023-01-08 10:08
 */
@Service // 这里的service注解不能使用spring的注解，要使用dubbo中的注解
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
