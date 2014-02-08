package com.mingyu.service;

import java.util.List;

import com.mingyu.domain.Filename;

public interface FilenameService {
	public void addFilename(Filename filename);

	public List<Filename> getFilename();

}
