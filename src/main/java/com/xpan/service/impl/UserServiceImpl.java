package com.xpan.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpan.builder.UserBuilder;
import com.xpan.domain.UserDTO;
import com.xpan.repository.UserRepository;
import com.xpan.service.UserService;

/**
 * @author rtyagi The UserService Impl class for implementing the basic CRUD
 *         operations
 *
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * The user repository
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 * The user builder
	 */
	@Autowired
	private UserBuilder userBuilder;

	/**
	 * @param {@link UserDTO} method to create the user
	 * @return Boolean
	 */
	@Override
	public Boolean createUser(@Valid final UserDTO userDTO) {
		userRepository.save(userBuilder.toEntity(userDTO));
		return true;
	}

	/**
	 * @param {@link UserDTO} method to retrieve all the users
	 * @return Boolean
	 */
	@Override
	public List<UserDTO> getAllUsers() {
		return userBuilder.listToDTO(userRepository.findAll());
	}

	/**
	 * @param {@link UserDTO} method to update the user
	 * @return Boolean
	 */
	@Override
	public Boolean profileUpdate(@Valid final UserDTO userDTO) {
		userRepository.getOne(userDTO.getId());
		userRepository.save(userBuilder.toEntity(userDTO));
		return true;
	}

	/**
	 * @param id of user method to retrieve the user with the given id
	 * @return {@link UserDTO}
	 */
	@Override
	public UserDTO getUser(final Long id) {
		return userBuilder.toDTO(userRepository.getOne(id));

	}
	public String testhello() {
		return "hello";
	}

	/**
	 * @param id of user method to delete the user
	 * @return Boolean
	 */
	@Override
	public Boolean deleteUser(final Long id) {
		userRepository.deleteById(id);
		return true;
	}

}
