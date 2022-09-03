package com.microserviceemail.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microserviceemail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
