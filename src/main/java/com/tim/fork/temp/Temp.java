package com.tim.fork.temp;

import java.util.ArrayList;

import com.tim.fork.vo.BookVO;

public class Temp {
	
public static void main(String[] args) {
	
	
	ArrayList<BookVO>  books = new ArrayList<BookVO>();
	
	//1.鏈表裏新增元素；
	for(int i = 0;i<5;i++)
	{
		books.add(new BookVO("Book"+i));
	}
	//2.指定位置新增元素
	BookVO bookSpecial  = new BookVO("This is an amazing book!");
	books.add(2, bookSpecial);
	//3.獲取元素；
	for (BookVO bookVo : books) {		
		System.out.println(bookVo.getBookName());		
	}
	//4.判断对象是否在List中
	System.out.println(books.contains(bookSpecial));
	//5.获取指定位置元素c
	System.out.println(books.get(2).getBookName());
	//6.获取元素的指定下下标
	System.out.println(books.indexOf(bookSpecial));
	//7.移除4号元素
	books.remove(3);
	System.out.println(3);
	//8.替換5号元素
	books.set(4, new BookVO("I am num5 book"));
	System.out.println(books.get(4).getBookName());
	//9.list转化为数组
	BookVO bookArray[] = (BookVO[])books.toArray(new BookVO[] {});
	for (BookVO bookVO : bookArray) {
		System.out.println(bookVO.getBookName());
		
	}
	
}

}
