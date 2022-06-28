package com.yangdoll.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {
	@Id
	@SequenceGenerator(
			name = "board_sequence",
			sequenceName = "board_sequence",
			allocationSize = 1
	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_sequence")
	private Long seq;
	
	private String title;
	
	@Column(updatable = false)
	private String writer;
	
	private String content;
	
	@Column(insertable = false, updatable = false, columnDefinition = "date default sysdate")
	private Date createDate;
	
	@Column(insertable = false, columnDefinition ="number default 0" )
	private Long cnt;

	//직접 적용을 해주는 것이 바람직하다 특히 조인 매핑일 경우 자기 참조가 발생해서 stackoverflow가 발생되는 것을 방지
	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", createDate=" + createDate + ", cnt=" + cnt + "]";
	}
	
	
	
}
