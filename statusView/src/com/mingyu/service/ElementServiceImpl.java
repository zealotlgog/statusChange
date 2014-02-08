package com.mingyu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mingyu.dao.ElementDao;
import com.mingyu.domain.Element;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ElementServiceImpl implements ElementService {

	@Autowired
	ElementDao elementDao;

	@Override
	public void addElement(Element element) {
		elementDao.saveElement(element);
	}

	@Override
	public List<Element> getElement() {
		return elementDao.getElement();
	}

	@Override
	public List<Element> getElementbyFilename(String filename) {
		List<Element> eleList = elementDao.getElement();
		List<Element> answer = new ArrayList<Element>();
		for (int i = 0; i < eleList.size(); i++) {
			Element tempEle = eleList.get(i);
			if (tempEle.getFilename() == filename) {
				answer.add(tempEle);
			}
		}
		return answer;
	}

	@Override
	public void addElementList(List<Element> elementList) {
		for (int i = 1; i <= elementList.size(); i++) {
			elementDao.saveElement(elementList.get(i));
		}
	}
}