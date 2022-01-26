package com.hyoseop.unitconvert;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

public class ConvertObj {
	
	private String input;
	private HashMap<String, String> inunit;
	private String output;
	private HashMap<String, String> outunit;
	
	public ConvertObj() {
		// TODO Auto-generated constructor stub
	}

	public ConvertObj(String input, HashMap<String, String> inunit, String output, HashMap<String, String> outunit) {
		super();
		this.input = input;
		this.inunit = inunit;
		this.output = output;
		this.outunit = outunit;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public HashMap<String, String> getInunit() {
		return inunit;
	}

	public void setInunit(HashMap<String, String> inunit) {
		this.inunit = inunit;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public HashMap<String, String> getOutunit() {
		return outunit;
	}

	public void setOutunit(HashMap<String, String> outunit) {
		this.outunit = outunit;
	}
	
	
}	
