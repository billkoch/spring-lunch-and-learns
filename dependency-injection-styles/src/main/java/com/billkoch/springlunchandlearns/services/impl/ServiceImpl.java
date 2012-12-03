package com.billkoch.springlunchandlearns.services.impl;

import com.billkoch.springlunchandlearns.adapters.Adapter;
import com.billkoch.springlunchandlearns.services.Service;

public class ServiceImpl implements Service {

	private Adapter adapter;
	
	public void performSomeService() {
		adapter.adapt();
	}
}
