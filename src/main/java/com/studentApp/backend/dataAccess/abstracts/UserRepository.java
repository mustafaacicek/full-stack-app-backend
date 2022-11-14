package com.studentApp.backend.dataAccess.abstracts;

import com.studentApp.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
