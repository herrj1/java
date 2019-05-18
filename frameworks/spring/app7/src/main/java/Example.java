import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example{
   @RequestMapping("/")
   String home(){
     return "Hello There, World!";
   }

   public static void main(String[] args) throws Exception{
     SpringApplication.run(Example.class, args);
   }
}
