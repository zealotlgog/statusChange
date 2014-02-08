package com.mingyu.dao;

import java.util.List;

import com.mingyu.domain.Filename;

public interface FilenameDao {
	public void saveFilename(Filename filename);

	public List<Filename> getFilename();

}
