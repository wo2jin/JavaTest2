package com.test;

public class BBSItem {
	
	static int seqNo; 			//일련번호 필드
	String writer; 			//작성자 필드
	String writtenDate;			//작성일자 필드
	String title;			//제목필드
	String content;			//내용필드
	void BBSItem( String writer, String writtenDate, String title, String content){//생성자
		this.seqNo++;
		this.writer=writer;
		this.writtenDate=writtenDate;
		this.title=title;
		this.content=content;
		System.out.println(this.seqNo);
	}
	public static void main(String[] args) {
		BBSItem a =new BBSItem();
		a.BBSItem("홍길동", "0410","제목", "내용");
		BBSItem b =new BBSItem();
		b.BBSItem("홍길동2", "0411","제목", "내용");
		BBSItem c =new BBSItem();
		c.BBSItem("홍길동3", "0412","제목", "내용");
		BBSItem d =new BBSItem();
		d.BBSItem("홍길동3", "0413","제목", "내용");
	}
}
