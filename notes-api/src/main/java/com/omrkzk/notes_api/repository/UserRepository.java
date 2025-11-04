package com.omrkzk.notes_api.repository;


import com.omrkzk.notes_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}
