package com.mingyu.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mingyu.domain.Filename;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class FilenameServiceImpl implements FilenameService {

	@Override
	public void addFilename(Filename filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Filename> getFilename() {
		// TODO Auto-generated method stub
		return null;
	}

}
