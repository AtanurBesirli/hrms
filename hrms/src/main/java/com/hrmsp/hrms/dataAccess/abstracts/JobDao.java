package com.hrmsp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrmsp.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}
