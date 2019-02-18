package org.zerock.mapper;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.Member;

public interface TimeMapper {

	@Select("SELECT * FROM openproject.member")
	@ResultType(Member.class)
//	@Select("SELECT SYSDATE() FROM DUAL")
	public String getTime();
	public String getTime2();
}
