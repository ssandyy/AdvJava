package com.DAO;

import java.util.List;

import com.entities.Results;

public interface ResultDao {
	public boolean AddResultMarks(Results results);
	public List<Results> getAllStudentResults();
	public String getStudentResult(String rsl);
}