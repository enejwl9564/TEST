package com.korea1.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.korea1.domain.BoardVO;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void getListTest() {
		List<BoardVO> list = mapper.getList();
		list.forEach(vo -> vo.toString());
		log.info(list);
	}
	
	@Test
	public void insertTest() {
		BoardVO vo = new BoardVO(0, "titletest", "contenttest", "writertest", null, null);
		mapper.insertSelectKey(vo);
	}
	@Test
	public void readTest() {
		mapper.read(110);
		log.info(mapper.read(110));
	}
	@Test
	public void DeleteTest() {
		mapper.delete(110);
		log.info(mapper.delete(110));
	}
	@Test
	public void UpdateTest() {
		
	}
	@Test
	public void getTotalCountTest() {
		
	}
}






