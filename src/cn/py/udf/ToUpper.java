package cn.py.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class ToUpper extends UDF{
	
	/*
	 * ע�⣺����hive��UDF��evaluate��Ҫд��д�����ķ������޷�ʶ��
	 */
	public String evaluate(String str){
		return str.toUpperCase();
	}
}
