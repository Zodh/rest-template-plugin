package br.com.felipec.resttemplateplugin.service;

import br.com.felipec.resttemplateplugin.model.Message;
import br.com.felipec.resttemplateplugin.repository.MessageRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestTemplateService {

  @Autowired
  private MessageRepository messageRepository;

  public String saveMessage(Integer count){
    var message = new Message();
    message.setMessage(UUID.randomUUID() + " - " + count);
    messageRepository.save(message);
    return "Success!";
  }
}
