package com.telusko.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends CrudRepository<VaccineDetails, Long> {

}
