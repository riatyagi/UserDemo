package com.xpan.controller;


import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xpan.domain.UserDTO;
import com.xpan.service.UserService;

/**
 * REST controller for managing User.
 */
/**
 * @author rtyagi
 *
 */
@RequestMapping(value = "/api")
@RestController
public class UserResource {

    private final Logger log = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    private UserService userService;

    /**
     * POST /user : Create a new user.
     *
     * @param request the user to create
     * @return the ResponseEntity with status 201 (Created) and with body the new
     *         user
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */

    @PostMapping("/user/registration/init")
    public ResponseEntity<Boolean> createUser(@Valid @RequestBody final  UserDTO userDTO) {
    	log.debug("REST request to create User : {}", userDTO);
        final HttpHeaders httpHeaders = new HttpHeaders();
        final Boolean isUserCreated = userService.createUser(userDTO);
        return new ResponseEntity<>(isUserCreated, httpHeaders, HttpStatus.CREATED);

    }

    /**
     * GET /user : retrieve all users.
     *
     * @return the ResponseEntity with status 200 (ok) and list of users
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        log.debug("REST request to get all Users ");
        final List<UserDTO> listOfUsers = userService.getAllUsers();
        return new ResponseEntity<>(listOfUsers, new HttpHeaders(), HttpStatus.OK);
    }

    /**
     * PUT /user : Create a new user.
     *
     * @param request the user to create
     * @return the ResponseEntity with status 200 (ok)
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/user")
    public ResponseEntity<Boolean> profileUpdate(@Valid @RequestBody final  UserDTO userDTO) {
        log.debug("REST request to update User : {}", userDTO);
        final Boolean isProfileUpdated = userService.profileUpdate(userDTO);
        return new ResponseEntity<>(isProfileUpdated, new HttpHeaders(), HttpStatus.OK);
    }
    
    /**
     * GET /user : retrieve a user.
     *
     * @param id of the requested user
     * @return the ResponseEntity with status 200 (ok) and
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @GetMapping("/user/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("id") final Long id) {
        log.debug("REST request to get a User with id  : {}", id);
        final UserDTO userDTO = userService.getUser(id);
        return new ResponseEntity<>(userDTO, new HttpHeaders(), HttpStatus.OK);
    }

    /**
     * DELETE /user : Deletes a new user.
     *
     * @param request the id to delete
     * @return the ResponseEntity with status 200 (OK) 
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @DeleteMapping("/user/finish/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id") final Long id) {
        log.debug("REST request to delete User with id : {}", id);
        final Boolean isUserDeleted = userService.deleteUser(id);
        return new ResponseEntity<>(isUserDeleted, new HttpHeaders(), HttpStatus.OK);
    }
}
