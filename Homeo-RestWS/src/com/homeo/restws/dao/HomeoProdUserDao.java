package com.homeo.restws.dao;

import java.util.Map;

import com.homeo.restws.model.HomeoProdUser;

public interface HomeoProdUserDao {
	Map create(HomeoProdUser homeoProdUser) ;

	Map deleteByUsername(String username);

	Map retrieveByUsername(String username);

	Map retrieveAllHomeoProdUsers();

	Map updateUser(HomeoProdUser homeoProdUser);
}
