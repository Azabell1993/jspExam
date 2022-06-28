package com.yangdoll;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yangdoll.domain.Board;
import com.yangdoll.persistence.BoardRepository;

@SpringBootTest
public class BoardRepositoryTest {

	@Autowired
	private BoardRepository board;

	@Test
	public void boardDataSetting() {
		for (int i = 1; i <= 3; i++) {
			Board insertData = Board.builder()
					.title("게시글 제목" +i)
					.writer("홍길동")
					.content("게시글의 내용입니다." + i)
					.build();
			board.save(insertData);
		}
	}
}
