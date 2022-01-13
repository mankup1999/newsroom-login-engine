package com.newsroom.login.mysql.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.newsroom.login.mysql.entity.LoginUser;

@Repository
public interface LoginUserRepo extends CrudRepository<LoginUser, String> {

	@Query(value = "select * from login_user_details where mail_id=:mailID and password=:password", nativeQuery = true)
	List<LoginUser> findByMailAndPassword(@Param("mailID") String mailID, @Param("password") String password);

	@Query(value = "from login_user_details where mob_no=:mob and password=:password", nativeQuery = true)
	List<LoginUser> findByMobAndPassword(@Param("mob") String mob, @Param("password") String password);

}
