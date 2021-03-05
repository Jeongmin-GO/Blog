package org.spring.blog.board.dao;

import java.util.List;

import org.spring.blog.board.vo.BoardVO;
import org.spring.blog.board.vo.ReplyVO;
import org.spring.common.Pagination;
import org.spring.common.Search;

public interface BoardDAO {
	public List<BoardVO> selectBoardList(Search search) throws Exception;
	
	public BoardVO selectBoardDetail(int bno) throws Exception;
	
	public int insertBoard(BoardVO vo) throws Exception;
	
	public int updateBoard(BoardVO vo) throws Exception;
	
	public int deleteBoard(int bno) throws Exception;
	
	public int updateViewCnt(int bno) throws Exception;
	
	//총 게시글 개수 확인
	public int getBoardListCnt(Search search) throws Exception;

	/*댓글 리스트*/
	public List<ReplyVO> selectReplyList(int bno) throws Exception;
	
	public int insertReply(ReplyVO replyVO) throws Exception;
	
	public int updateReply(ReplyVO replyVO) throws Exception;
	
	public int deleteReply(int rno) throws Exception;
}
