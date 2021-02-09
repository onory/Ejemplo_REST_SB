package academy.digitalalb.demo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController //define que la clase sera un servicio REST
@RequestMapping(value="Greeting") //Define el PAT de nuestro ENDPOINT (se envia valor del Path)
public class GreetingController {

    //Metodo que regresa un saludo

    private final AtomicLong counter = new AtomicLong(); //variable que controla el auto incrementador
    private static final String template="Hello %s"; // valiable para el mensaje


    @GetMapping // se usara el metodo GET para el REST
                             // el valor de name sera recolectado por request con el value de name
    public Greeting greeting(@RequestParam(value="name", defaultValue ="World" ) String name){
                                                      //formato del mensaje que recibe el tempete y lo concatena
                                                     // con la variable que reibe de name
        return new Greeting(counter.incrementAndGet(), String.format(template,name)); //se envia un auto incrementador

    }

}
