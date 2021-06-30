package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Login;


@Repository("login")
public interface LoginDAO extends JpaRepository<Login, Integer> {

	@Query(value="SELECT m.password from login m where m.email =?1",nativeQuery = true)
	public List<String> findbyemail(String email);
}
