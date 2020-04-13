package com.xpan.builder;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xpan.domain.UserDTO;
import com.xpan.entity.User;

/**
 * @author rtyagi --the user builder class
 *
 */
@Service
public class UserBuilder {

	/**
	 * 
	 * @param {@link UserDTO}-convert userdto to user
	 * @return {@link User}
	 */
	public User toEntity(@Valid UserDTO userDTO) {
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		return user;
	}

	/**
	 * 
	 * @param {@link UserDTO}--convert listof users to dto
	 * @return {@link User}
	 */
	public List<UserDTO> listToDTO(List<User> listOfUser) {
		List<UserDTO> listOfUsers = new ArrayList<>();
		for (User user : listOfUser) {
			listOfUsers.add(toDTO(user));
		}

		return listOfUsers;
	}

	/**
	 * 
	 * @param {@link UserDTO}- convert user to userdto
	 * @return {@link User}
	 */
	public UserDTO toDTO(User user) {
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}
}
