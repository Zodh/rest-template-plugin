package br.com.felipec.resttemplateplugin.controller;

import br.com.felipec.resttemplateplugin.api.RestTemplateApi;
import br.com.felipec.resttemplateplugin.model.SuccessResponse;
import br.com.felipec.resttemplateplugin.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class RestTemplateController implements RestTemplateApi {

  @Autowired
  private RestTemplateService restTemplateService;

  @Override
  public ResponseEntity<SuccessResponse> restTemplateCallGet(Integer messagesQuantity){
    return new ResponseEntity<>(
        new SuccessResponse().message(restTemplateService.saveMessage(messagesQuantity)), HttpStatus.OK);
  }
}
