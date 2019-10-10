#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.model.HealthStatus;
import ${package}.model.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping
    public HealthStatus ping() {
        return new HealthStatus("service", Status.UP);
    }

    @GetMapping(path = "/health")
    public HealthStatus health() {
        return ping();
    }
}
