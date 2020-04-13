package com.xpan.service;

import java.util.List;

import javax.validation.Valid;

import com.xpan.domain.UserDTO;

/**
 * @author rtyagi
 *
 */
public interface UserService {

	/**
	 * @param {@link UserDTO} method to create the user
	 * @return Boolean
	 */
	public Boolean createUser(@Valid UserDTO userDTO);

	/**
	 * @param {@link UserDTO} method to retrieve all the users
	 * @return Boolean
	 */
	public List<UserDTO> getAllUsers();

	/**
	 * @param {@link UserDTO} method to update the user
	 * @return Boolean
	 */
	public Boolean profileUpdate( @Valid UserDTO userDTO);

	/**
	 * @param id of user method to retrieve the user with the given id
	 * @return {@link UserDTO}
	 */
	public UserDTO getUser(Long id);

	/**
	 * @param id of user method to delete the user
	 * @return Boolean
	 */
	public Boolean deleteUser(Long id);

}
