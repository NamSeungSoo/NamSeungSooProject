package model.service;

import model.dao.JoinMapper;
import model.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class JoinService {

    private JoinMapper joinMapper;

    @Autowired
    public JoinService(JoinMapper joinMapper){
        this.joinMapper = joinMapper;
    }

    public int joinUser(UserDTO parameters) {

        int result = joinMapper.joinUser(parameters);

        return result;
    }
}
