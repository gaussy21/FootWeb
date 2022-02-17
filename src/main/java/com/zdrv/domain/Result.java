package com.zdrv.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Result {

	private Integer id;
	private Integer homeTeamId;
	private String homeTeamName;
	private Integer awayTeamId;
	private String awayTeamName;
	private Integer homeScore;
	private Integer awayScore;
	private Date date;
	
}
