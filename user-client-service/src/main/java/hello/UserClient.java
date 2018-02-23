package hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.RequestLine;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

// public interface UserClient {
//     @RequestLine("GET /hi_getall")
//     List<String> getGreetings();
// }

@FeignClient(name = "say-hello", fallback = UserClientFallback.class)
public interface UserClient {
    @RequestLine("GET /hi_getall")
    List<String> getGreetings();
}

@Component
class UserClientFallback implements UserClient {
    @Override
    public List<String> getGreetings() {
        return Arrays.asList("Hello", "tryGetGreetingsElse");
    }
}