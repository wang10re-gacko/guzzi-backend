package guzzi.project.mapper;

import guzzi.project.DTO.votePostDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface VoteMapper {
    public List<votePostDto> findVoteAll();
    //@param("변수명") 타입 변수
    public void createVote(@Param("vote") HashMap<String,Object> vote);
}
