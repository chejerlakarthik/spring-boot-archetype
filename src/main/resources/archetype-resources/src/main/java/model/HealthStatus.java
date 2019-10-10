#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HealthStatus {

    private String serviceName;
    private Status status;

    public HealthStatus(String serviceName, Status status) {
        this.serviceName = serviceName;
        this.status = status;
    }
}
