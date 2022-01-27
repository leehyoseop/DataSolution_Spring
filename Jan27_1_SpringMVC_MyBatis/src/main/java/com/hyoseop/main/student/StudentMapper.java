package com.hyoseop.main.student;

import java.util.List;

public interface StudentMapper {
	//리턴타입
	//insert/update/delete -> 영향받은 데이터 수 -> int(리턴타입)
	//select
	//	결과가 하나 나온다 : resultType객체
	//	결과가 여러개 나온다 : List<resultType 객체>
	
	//	메소드명 - mapper.xml의 id와 맞추기
	//	파라미터 - mapper.xml의 parameterType과 맞추기
	
	public abstract int regHaha(Student s);
	
	public abstract List<Student> selSt();
}
