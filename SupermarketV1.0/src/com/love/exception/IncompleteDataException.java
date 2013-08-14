package com.love.exception;
/**
 * 
 * @类功能说明: 数据不完整异常
 * @类修改者:   
 * @修改日期:   
 * @修改说明:   
 * @作者:      Aaron
 * @创建时间:  2013-7-29 上午11:57:02
 * @版本:      1.0.0
 */
public class IncompleteDataException extends Exception {

	/**
	 * 
	 * @描述: TODO
	 *
	 */
	private static final long serialVersionUID = -3717885770708573548L;
	
	public IncompleteDataException(String msg){

		super(msg);
	}

}
