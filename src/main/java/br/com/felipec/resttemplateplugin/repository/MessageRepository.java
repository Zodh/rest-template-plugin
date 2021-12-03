package br.com.felipec.resttemplateplugin.repository;

import br.com.felipec.resttemplateplugin.model.Message;
import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, BigInteger> { }
