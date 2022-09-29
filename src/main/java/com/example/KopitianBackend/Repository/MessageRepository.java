package com.example.KopitianBackend.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.KopitianBackend.Model.Message;

public interface MessageRepository extends CrudRepository<Message,Integer> {
}
