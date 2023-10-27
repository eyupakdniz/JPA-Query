package com.eyup.jpaquery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eyup.jpaquery.dto.UserDto;
import com.eyup.jpaquery.dto.UserDtoByNative;
import com.eyup.jpaquery.entities.User;
import com.eyup.jpaquery.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User findUsersByIdentityNumber(String identityNumber) {
		return userRepository.findUsersByIdentityNumber(identityNumber).orElse(null);
	}

	public User getUsersByIdentityNumberQueryHql(String identityNumber) {
		return userRepository.getUsersByIdentityNumberQueryHql(identityNumber).orElse(null);
	}

	public User getUsersByIdentityNumberQueryNavive(String identityNumber) {
		return userRepository.getUsersByIdentityNumberQueryNavive(identityNumber).orElse(null);
	}

	public UserDto getUsersDtoByIdentityNumberQueryHql(String identityNumber) {
		return userRepository.getUsersDtoByIdentityNumberQueryHql(identityNumber);
	}

	public UserDtoByNative getUsersDtoByIdentityNumberQueryNavite(String identityNumber) {
		return userRepository.getUsersDtoByIdentityNumberQueryNavite(identityNumber).orElse(null);
	}

	public String getUsersNameByIdentityNumberQueryHql(String identityNumber) {
		return userRepository.getUsersNameByIdentityNumberQueryHql(identityNumber);
	}

	public String getUsersNameByIdentityNumberQueryNative(String identityNumber) {
		return userRepository.getUsersNameByIdentityNumberQueryNative(identityNumber);
	}

	public List<User> findAllByLastName(String lastName) {
		return userRepository.findAllByLastName(lastName);
	}

	public List<User> getAllAccountBySurnameQueryHql(String lastName) {
		return userRepository.getAllAccountBySurnameQueryHql(lastName);
	}

	public List<User> getAllAccountBySurnameQueryNavite(String lastName) {
		return userRepository.getAllAccountBySurnameQueryNavite(lastName);
	}

}













