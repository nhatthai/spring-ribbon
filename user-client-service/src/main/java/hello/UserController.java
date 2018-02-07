package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.cloud.netflix.ribbon.RibbonClient;

import feign.Feign;
import feign.Logger;
import feign.Client;
import feign.codec.Decoder;
import feign.codec.Encoder;

import hello.UserClient;

@RestController
class UserController {
    private UserClient userClient;

    @Autowired
	public UserController(
			Decoder decoder, Encoder encoder, Client client) {
        this.userClient = Feign.builder().client(client)
            .encoder(encoder)
            .decoder(decoder)
            .target(UserClient.class, "http://say-hello");

        // .client(RibbonClient.create())
        // .requestInterceptor(new BasicAuthRequestInterceptor("user", "user"))
    }

    @RequestMapping("/getall-hi")
	public List<String> getAllGreetings() {
		List<String> greetings = userClient.getGreetings();
		return greetings;
	}

}