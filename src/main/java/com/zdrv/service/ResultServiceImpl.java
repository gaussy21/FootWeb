package com.zdrv.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.zdrv.domain.Ranking;
import com.zdrv.domain.Result;
import com.zdrv.mapper.RankingMapper;
import com.zdrv.mapper.ResultMapper;

public class ResultServiceImpl implements ResultService {

	@Autowired
	private ResultMapper resultMapper;
	
	@Autowired
	private RankingMapper rankingMapper;
	
	
	@Override
	public Result getResultById(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void insertResult(Result result) {
		// resultテーブルにデータを追加
		resultMapper.insert(result);
		
		// ホームチームの勝敗結果や勝ち点等を計算
		Ranking rank1 = new Ranking();
		rank1.setTeamId(result.getHomeTeamId());
		if(result.getHomeScore() > result.getAwayScore()) {
			// 勝ち
			rank1.setWin(1);
			rank1.setDraw(0);
			rank1.setLose(0);
			rank1.setPoint(3);
		}
		else if(result.getHomeScore() < result.getAwayScore()) {
			// 負け
			rank1.setWin(0);
			rank1.setDraw(0);
			rank1.setLose(1);
			rank1.setPoint(0);
		}
		else {
			rank1.setWin(0);
			rank1.setDraw(1);
			rank1.setLose(0);
			rank1.setPoint(1);
		}
		
		rank1.setPlus(result.getHomeScore());
		rank1.setMinus(result.getAwayScore());
		
		
		
		// アウェイチーム
		Ranking rank2 = new Ranking();
		rank2.setTeamId(result.getAwayTeamId());
		
		// rankingテーブルを更新
		rankingMapper.update(rank1);
		rankingMapper.update(rank2);
	}

	@Override
	public void deleteResult(int id) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void editResult(Result result) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
