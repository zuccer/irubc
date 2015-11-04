package org.zucc.web.util;

public class PageUtil {
	public static Integer size = 8;

	public static Integer getTotalPage(Integer totalCount) {

		if (totalCount % size == 0) {
			return totalCount / size;
		}
		return totalCount / size + 1;
	}

	public static Integer getStart(Integer pageIndex) {
		return (pageIndex - 1) * size;
	}
}
