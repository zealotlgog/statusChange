package com.mingyu.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mingyu.domain.Filename;

public class FilenameDaoImpl implements FilenameDao {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	@Transactional
	public void saveFilename(Filename filename) {
		sessionfactory.getCurrentSession().saveOrUpdate(filename);
	}

	@Override
	@Transactional
	public List<Filename> getFilename() {

		@SuppressWarnings("unchecked")
		List<Filename> filenameList = sessionfactory.getCurrentSession()
				.createCriteria(Filename.class).list();
		return filenameList;
	}

}
