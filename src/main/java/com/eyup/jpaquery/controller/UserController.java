package com.eyup.jpaquery.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eyup.jpaquery.dto.UserDto;
import com.eyup.jpaquery.dto.UserDtoByNative;
import com.eyup.jpaquery.entities.User;
import com.eyup.jpaquery.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/findUsersByIdentityNumber/{identityNumber}")
    public ResponseEntity<User> findUsersByIdentityNumber(@PathVariable String identityNumber) {
        return new ResponseEntity<>(userService.findUsersByIdentityNumber(identityNumber), HttpStatus.OK);
    }
    @GetMapping("/getUsersByIdentityNumberQueryHql/{identityNumber}")
    public ResponseEntity<User> getUsersByIdentityNumberQueryHql(@PathVariable String identityNumber){
        return new ResponseEntity<>(userService.getUsersByIdentityNumberQueryHql(identityNumber),HttpStatus.OK);
    }

    @GetMapping("/getUsersByIdentityNumberQueryNavive/{identityNumber}")
    public ResponseEntity<User> getUsersByIdentityNumberQueryNavive(@PathVariable String identityNumber){
        return new ResponseEntity<>(userService.getUsersByIdentityNumberQueryNavive(identityNumber),HttpStatus.OK);
    }

    //dto

    @GetMapping("/getUsersDtoByIdentityNumberQueryHql/{identityNumber}")
    public ResponseEntity<UserDto> getUsersDtoByIdentityNumberQueryHql(@PathVariable String identityNumber){
        return new ResponseEntity<>(userService.getUsersDtoByIdentityNumberQueryHql(identityNumber),HttpStatus.OK);
    }

    @GetMapping("/getUsersDtoByIdentityNumberQueryNavite/{identityNumber}")
    public ResponseEntity<UserDtoByNative> getUsersDtoByIdentityNumberQueryNavite(@PathVariable String identityNumber){
        return new ResponseEntity<>(userService.getUsersDtoByIdentityNumberQueryNavite(identityNumber),HttpStatus.OK);
    }

    //string

    @GetMapping("/getUsersNameByIdentityNumberQueryHql/{identityNumber}")
    public ResponseEntity<String> getUsersNameByIdentityNumberQueryHql(@PathVariable String identityNumber){
        return new ResponseEntity<>(userService.getUsersNameByIdentityNumberQueryHql(identityNumber),HttpStatus.OK);
    }


    @GetMapping("/getUsersNameByIdentityNumberQueryNative/{identityNumber}")
    public ResponseEntity<String> getUsersNameByIdentityNumberQueryNative(@PathVariable String identityNumber){
        return new ResponseEntity<>(userService.getUsersNameByIdentityNumberQueryNative(identityNumber),HttpStatus.OK);
    }

    //List<Account>
    @GetMapping("/findAllByLastName/{lastName}")
    public ResponseEntity<List<User>> findAllByLastName(@PathVariable String lastName){
        return new ResponseEntity<>(userService.findAllByLastName(lastName),HttpStatus.OK);
    }

    @GetMapping("/getAllAccountBySurnameQueryHql/{lastName}")
    public ResponseEntity<List<User>> getAllAccountBySurnameQueryHql(@PathVariable String lastName){
        return new ResponseEntity<>(userService.getAllAccountBySurnameQueryHql(lastName),HttpStatus.OK);
    }

    @GetMapping("/getAllAccountBySurnameQueryNavite/{lastName}")
    public ResponseEntity<List<User>> getAllAccountBySurnameQueryNavite(@PathVariable String lastName){
        return new ResponseEntity<>(userService.getAllAccountBySurnameQueryNavite(lastName),HttpStatus.OK);
    }
	
}
