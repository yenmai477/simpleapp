package me.yenmai.simpleapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server-info")
public class ServerInfo {
  @RequestMapping("/health-check")
  ResponseEntity<String> healthCheck() {
    return ResponseEntity.ok("Response from server!");
  }
}
