package com.hyoseop.feb071.error;

import java.util.List;

public interface ErrorMapper {
	public abstract List<Error> getAllError();
	
	public abstract List<Error> getMyinput(Error e);
}
