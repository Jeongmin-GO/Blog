package org.spring.blog.board.vo;

import java.util.Date;

/* MySQL
 * 
 * create table board(
  bno      int auto_increment comment '일련번호' primary key,
  category  varchar(20)   not null comment '게시글 카테고리',
  title    varchar(200)  not null comment '제목',
  content  text          not null comment '게시글',
  tag      varchar(1000) null comment '태그',
  view_cnt int default 0 not null comment '카운트',
  reg_id   varchar(45)   not null comment '작성자',
  reg_date   datetime not null comment '작성일',
  edit_date  datetime comment '수정일'
);
 * */
public class BoardVO {
	public int bno;
	public String category;
	public String title;
	public String content;
	public String tag;
	public int view_cnt;
	public String reg_id;
	public String reg_date;
	public String edit_date;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getView_cnt() {
		return view_cnt;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
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
