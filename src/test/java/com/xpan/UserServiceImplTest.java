package com.xpan;

import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.xpan.builder.UserBuilder;
import com.xpan.domain.UserDTO;
import com.xpan.entity.User;
import com.xpan.repository.UserRepository;
import com.xpan.service.impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public          class UserServiceImplTest {

	/**
	 * The user service impl
	 */
	@InjectMocks
	private UserServiceImpl userServiceImpl;

	/**
	 * The user repository
	 */
	@Mock
	private UserRepository userRepository;

	/**
	 * The user builder
	 */
	@Mock
	private UserBuilder userBuilder;

	UserDTO userDTO;
	User user;

	@Before
	public void initializeBeforeEachTest() {
		MockitoAnnotations.initMocks(this);
		userDTO = new UserDTO();
		userDTO.setId(2L);
		userDTO.setFirstName("sfsdfs");
		userDTO.setLastName("gfgfd");
		userDTO.setEmail("r@gmail.com");
		userDTO.setRole("admin");
		user = new User();
		user.setId(2L);
		user.setFirstName("sfsdfs");
		user.setLastName("gfgfd");
		user.setEmail("r@gmail.com");
		user.setRole("admin");
	}

	/**
	 * method to create a user
	 */
	@Test
	public void testCreateUser() {
		when(userBuilder.toEntity(userDTO)).thenReturn(user);
		when(userRepository.save(user)).thenReturn(user);
		final Boolean actualResult = userServiceImpl.createUser(userDTO);
		assertEquals(true, actualResult);
		verify(userBuilder).toEntity(userDTO);
		verify(userRepository).save(user);
	}
	
	@Test
	public void testh() {
		final String actualResult = userServiceImpl.testhello();
		assertEquals("hello", actualResult);
		
		
	}

}
