package hello;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.RequestLine;

public interface UserClient {
    @RequestLine("GET /hi_getall")
    List<String> getGreetings();
}