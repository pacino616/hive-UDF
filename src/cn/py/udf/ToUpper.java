package cn.py.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class ToUpper extends UDF{
	
	/*
	 * 注意：开发hive的UDF，evaluate不要写错，写其他的方法名无法识别；
	 */
	public String evaluate(String str){
		return str.toUpperCase();
	}
}
