package com.minseo.timemate.TimeMate.DAO;

import com.minseo.timemate.TimeMate.DTO.LoginDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Usersmapper {
    public void select_login(LoginDTO dto);
}
