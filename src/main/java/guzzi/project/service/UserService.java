package guzzi.project.service;

import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Map;

@Service("UserService")
public interface UserService {

    /*
     * selectUserById - userId 로 user info 조회 (토큰 관련 로직에 연결)
     * @author 남현정
     * @param paramMap
     * @return paramMap
     * @exception SQLException
     * @exception Exception
     * */
    Map<String,Object> selectUserById(Map<String,Long> paramMap) throws SQLException, Exception;

}