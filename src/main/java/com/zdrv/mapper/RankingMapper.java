package com.zdrv.mapper;

import java.util.List;

import com.zdrv.domain.Ranking;

public interface RankingMapper {
	
	// ランキングを取得
	List<Ranking> selectAll();
	
	// ランキングを更新
	void update(Ranking ranking);

}
