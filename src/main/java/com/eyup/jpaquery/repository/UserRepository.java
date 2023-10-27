package com.eyup.jpaquery.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eyup.jpaquery.dto.UserDto;
import com.eyup.jpaquery.dto.UserDtoByNative;
import com.eyup.jpaquery.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findUsersByIdentityNumber(String identityNumber);

    @Query("from users where identityNumber=?1")
    Optional<User> getUsersByIdentityNumberQueryHql(String identityNumber);

    @Query(value = "select * from users where identity_number=?", nativeQuery = true)
    Optional<User> getUsersByIdentityNumberQueryNavive(String identityNumber);
    
   
    //dto
    @Query("select new com.eyup.jpaquery.dto.UserDto(a.firstName,a.lastName) from users a where a.identityNumber=?1")
    UserDto getUsersDtoByIdentityNumberQueryHql(String identityNumber);

    @Query(value = "select a.FIRSTNAME, a.LASTNAME from users a where a.identitiy_number=?", nativeQuery = true)
    Optional<UserDtoByNative> getUsersDtoByIdentityNumberQueryNavite(String identityNumber);


    // Tek Bir String Değer Dönen
    @Query("select a.firstName from users a where a.identityNumber=?1")
    String getUsersNameByIdentityNumberQueryHql(String identityNumber);

    @Query(value = "select first_name from users where identity_number=?",nativeQuery = true)
    String getUsersNameByIdentityNumberQueryNative(String identityNumber);

    // List<Account>

    List<User> findAllByLastName(String lastName);

    @Query("FROM users a where a.lastName=?1")
    List<User> getAllAccountBySurnameQueryHql(String lastName);

    @Query(value = "select * from users where last_name=?",nativeQuery = true)
    List<User> getAllAccountBySurnameQueryNavite(String lastName);
}

















