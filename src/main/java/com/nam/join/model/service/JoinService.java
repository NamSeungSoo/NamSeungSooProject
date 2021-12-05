package com.nam.join.model.service;

import com.nam.join.model.dao.JoinMapper;
import com.nam.join.model.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    private  JoinMapper joinMapper;

    public JoinService(JoinMapper joinMapper){
        this.joinMapper = joinMapper;
    }


    public int joinUser(UserDTO parameters) {

        int result = joinMapper.joinUser(parameters);


        return result;
    }
}
