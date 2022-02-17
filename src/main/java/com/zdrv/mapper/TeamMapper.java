package com.zdrv.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zdrv.domain.Team;

@Mapper
public interface TeamMapper {
	
    List<Team> selectAll();
}
