package com.nam.join.model.dao;

import com.nam.join.model.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoinMapper {

    int joinUser(UserDTO parameters);
}
