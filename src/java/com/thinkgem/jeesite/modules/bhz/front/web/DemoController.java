package com.thinkgem.jeesite.modules.bhz.front.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thinkgem.jeesite.modules.bhz.front.dto.JsonResult;

/**
 * 接口开发模板类
 * @author zhenHeng
 *
 */
@Controller
@RequestMapping("/f/item")
public class DemoController {
	
	 private static Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	 
	 /**
	  * 获取单条记录
	  * @param pkid
	  * @return
	  */
	 @RequestMapping(value = "/{id}/get", method = RequestMethod.GET)
	 @ResponseBody
	    public JsonResult get(@PathVariable String id) {
	        try {
	        	//获取业务层数据return到前台，省略代码
	        	//暂时写死返回空
	            return JsonResult.success(null);
	        } catch (Exception e) {
	            logger.error(e.getMessage(), e);
	            return JsonResult.failure(e.getMessage());
	        }
	    }
}
