package com.example.demo.repo;

import com.example.demo.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    // The JPA repo is server, long because the primary key is Long
    Server findByIpAddress(String ipAddress);

}
