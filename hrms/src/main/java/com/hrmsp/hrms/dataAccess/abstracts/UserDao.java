package com.hrmsp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrmsp.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer> {

}
