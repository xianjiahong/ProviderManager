package dao;

import java.util.List;

import pojo.Provider;


/**
 * 操作数据库的接口
 * @author ASUS
 * @创建时间 2020年3月27日下午6:52:32
 */
public interface ProviderMapper {
	List<Provider> getProviderList();
}
