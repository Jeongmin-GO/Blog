package org.spring.blog.board.dao;

import java.util.List;

import org.spring.blog.board.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> selectBoardList() throws Exception;
	
	public BoardVO selectBoardDetail(int bno) throws Exception;
	
	public int insertBoard(BoardVO vo) throws Exception;
	
	public int updateBoard(BoardVO vo) throws Exception;
	
	public int deleteBoard(int bno) throws Exception;
	
	public int updateViewCnt(int bno) throws Exception;
}
