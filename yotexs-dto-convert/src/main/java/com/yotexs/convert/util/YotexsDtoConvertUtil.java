package com.yotexs.convert.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;

public class YotexsDtoConvertUtil extends DozerBeanMapper {
	private static DozerBeanMapper instance;

	private YotexsDtoConvertUtil() {
	}

	public static DozerBeanMapper getInstance() {
		if (instance == null) {
			List<String> mpfile = new ArrayList<>();
			mpfile.add("converters.xml");
			DozerBeanMapper mapper = new DozerBeanMapper();
			mapper.setMappingFiles(mpfile);
			return instance = mapper;
		} else {
			return instance;
		}
	}

	/**
	 * 将单体对象转换成目标对象
	 * 
	 * @param s
	 * @param d
	 * @return
	 */
	public static <S, D> D getSingleDestinationObj(S s, Class<D> d) {

		return YotexsDtoConvertUtil.getInstance().map(s, d);
	}

	/**
	 * 将集合对象转换成目标集合对象
	 * 
	 * @param source
	 * @param destination
	 * @return
	 */
	public static <Source, Destination> List<Destination> getCollectionDestinationObj(List<Source> source,
			Class<Destination> destination) {

		return source.parallelStream().map(o -> YotexsDtoConvertUtil.getInstance().map(o, destination))
				.collect(Collectors.toList());
	}

}
