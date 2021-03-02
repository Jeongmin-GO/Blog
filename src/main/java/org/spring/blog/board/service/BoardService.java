package org.spring.blog.board.service;

import java.util.List;
import java.util.Map;

import org.spring.blog.board.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> selectBoardList() throws Exception;
	
	public void insertBoard(BoardVO vo) throws Exception;
	
}
