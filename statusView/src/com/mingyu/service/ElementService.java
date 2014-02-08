package com.mingyu.service;

import java.util.List;
import com.mingyu.domain.Element;

public interface ElementService {
	public void addElement(Element element);

	public void addElementList(List<Element> elementList);

	public List<Element> getElement();

	public List<Element> getElementbyFilename(String filename);

}