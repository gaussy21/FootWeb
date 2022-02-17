package com.zdrv.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import lombok.Data;

@Data
public class Result {

	
	private Integer id;
	private Integer homeTeamId;
	@NotBlank(message="必須項目です")
	private String homeTeamName;
	private Integer awayTeamId;
	@NotBlank(message="必須項目です")
	private String awayTeamName;
	@Min(0)
	private Integer homeScore;
	@Min(0)
	private Integer awayScore;
	@Past(message="今日以前にしてください")
	private Date date;
	
}
