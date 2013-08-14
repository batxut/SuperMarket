package com.love.exception;
/**
 * 
 * @类功能说明: 数据格式类型不匹配异常
 * @类修改者:   
 * @修改日期:   
 * @修改说明:   
 * @作者:      Aaron
 * @创建时间:  2013-7-23 下午05:00:08
 * @版本:      1.0.0
 */
public class TypeException extends Exception {

	/**
	 * 
	 * @描述: TODO
	 *
	 */
	private static final long serialVersionUID = 3486796452001254108L;

	public TypeException(String msg){
		
		super(msg);
	}
}
