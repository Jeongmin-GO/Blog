package org.spring.blog.board.service;

import java.util.List;
import java.util.Map;

import org.spring.blog.board.vo.BoardVO;
import org.spring.common.Pagination;

public interface BoardService {
	public List<BoardVO> selectBoardList(Pagination pagination) throws Exception;
	
	public void insertBoard(BoardVO vo) throws Exception;
	
	public BoardVO selectBoardDetail(int bno) throws Exception;

	public void updateBoard(BoardVO vo) throws Exception;

	public void deleteBoard(int bno) throws Exception;
	
	public int getBoardListCnt() throws Exception; //총 게시글 개수 확인
}
