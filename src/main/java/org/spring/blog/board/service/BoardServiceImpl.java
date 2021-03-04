package org.spring.blog.board.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.spring.blog.board.dao.BoardDAO;
import org.spring.blog.board.vo.BoardVO;
import org.spring.blog.error.controller.NotFoundException;
import org.spring.common.Pagination;
import org.spring.common.Search;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO boardDAO;
	
	public List<BoardVO> selectBoardList(Search search) throws Exception{
		return boardDAO.selectBoardList(search);
	}
	
	@Override
	public void insertBoard(BoardVO vo) throws Exception{
		boardDAO.insertBoard(vo);
	}
	
	@Transactional
	@Override
	public BoardVO selectBoardDetail(int bno) throws Exception {
		BoardVO boardVO = new BoardVO();
		boardDAO.updateViewCnt(bno);
		boardVO = boardDAO.selectBoardDetail(bno);
		
		//예외처리 test
		/*category 저장크기보다 큰 문자열을 저장하도록 셋팅 후 게시물 수정 로직 호출하면 수정 sql문 처리시 문제가 발생*/
//		try {
//			boardVO.setBno(bno);
//			boardVO.setCategory("111111111111111111111111111111111111");
//			boardDAO.updateBoard(boardVO);
//		}catch (RuntimeException e) {
//			throw new NotFoundException();
//		}
//		return boardDAO.selectBoardDetail(bno);
		return boardVO;
	}

	@Override
	public void updateBoard(BoardVO vo) throws Exception {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(int bno) throws Exception {
		boardDAO.deleteBoard(bno);
	}

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		return boardDAO.getBoardListCnt(search);
	}
}
