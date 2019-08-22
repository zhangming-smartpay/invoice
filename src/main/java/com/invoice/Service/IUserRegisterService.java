package com.invoice.Service;

import com.invoice.Entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RequestBody;
@MapperScan("com.invoice.Mapper")
public interface IUserRegisterService {
    int registerUser(@RequestBody User user);


}
