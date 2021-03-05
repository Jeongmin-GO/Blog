package org.spring.blog.board.vo;

/*MySQL
 * 
 * create table reply(
		rno int auto_increment comment '일련번호' primary key,
	    bno int not null comment '게시물 일련번호',
	    content text null comment '댓글내용',
	    reg_id varchar(45) not null comment '작성자',
	    reg_date datetime not null comment '작성일',
	    edit_date datetime not null comment '수정일',
	    constraint reply_board_fk
	    foreign key (bno) references board(bno)
	);
	*/
public class ReplyVO {
	public int rno;
	public int bno;
	public String content;
	public String reg_id;
	public String reg_date;
	public String edit_date;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getEdit_date() {
		return edit_date;
	}
	public void setEdit_date(String edit_date) {
		this.edit_date = edit_date;
	}
	
	
}
