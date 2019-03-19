package com.example.demo.service.serviceInterface;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by qfcomputer on 2018/5/27.
 */


public interface InterLoginService {
    public User loginResult(String name,String passwd);
}
