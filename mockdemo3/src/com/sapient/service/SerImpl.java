package com.sapient.service;

import java.util.Map;

import com.sapient.dao.IProductDao;
import com.sapient.vo.Product;

public class SerImpl implements Iser{
	
	private IProductDao dao;

	
	
	@Override
	public Product getProductInfo(String cat, int pid) throws NotFoundException {
		Map<String,Map<Integer,Product>> catMap=dao.getCatNProds();
		if(!catMap.containsKey(cat)) {
			//System.out.println(catMap.get(cat));
			throw new NotFoundException("id not found");
		}
		Map<Integer,Product> pmap=catMap.get(cat);
		if(!pmap.containsKey(pid))
			throw new NotFoundException("product id not found exception");
        
		Product prod=pmap.get(pid);
		return prod;
	}
	
	

	public void setDao(IProductDao dao) {
		this.dao = dao;
	}
	

}
