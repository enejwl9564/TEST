package com.korea1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.korea1.domain.BoardVO;


public interface BoardMapper {

	Class<?> Integer = null;

	@Select("select * from tbl_board where bno>0")
	public List<BoardVO> getList();
	@Insert
	("insert into tbl_board(title,content,writer,regdate) values(#{title},#{content},#{writer},now())")
	public void insert(BoardVO board);
	@SelectKey
	(
			statement="select seq_board.currval from dual",
			keyProperty="bno",
			before=false,
			resultType=long.class
	)
	@Insert
	("insert into tbl_board(title,content,writer,regdate) values(#{title},#{content},#{writer},now())")
	public long insertSelectKey(BoardVO bno);
	@Select("select * from tbl_board where bno=#{bno}")
	public BoardVO read(int bno);
	@Delete("delete from tbl_board where bno=#{bno}")
	public int delete (int bno);	
	@Update
	("update tbl_board set title=#{title},content=#{content},writer=#{writer},updateDate=now() where bno=#{bno}")
	public int update(BoardVO board);
	@Select("select count(*) from tbl_board where bno>0")
	public int getTotalCount(int i);
}

