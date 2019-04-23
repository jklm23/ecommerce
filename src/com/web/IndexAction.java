package com.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.bean.book.Book;
import com.service.book.BookService;
import com.service.book.BookTypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class IndexAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Resource BookTypeService bts;


	@SuppressWarnings("rawtypes")
	public String execute(){

		Map<String, List> allBookType=bts.searchAllDistinctBookType();
		ActionContext.getContext().put("allBookType", allBookType);

		return SUCCESS;
	}
}

