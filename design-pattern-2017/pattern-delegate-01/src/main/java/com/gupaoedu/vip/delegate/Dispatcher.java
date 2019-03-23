package com.gupaoedu.vip.delegate;

public class Dispatcher implements IExector {
	IExector exector;
	
	Dispatcher(IExector exector){
		this.exector = exector;
	}
	
	
	//��Ŀ������ȻҲ��ִ�з���
	//�������Ĺ���ְ���ǲ�һ����
	public void doing() {
		this.exector.doing();
	}

}
