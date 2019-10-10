#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Status {

    UP("up"), DOWN("down");

    private String value;


    Status(String value) {
        this.value = value;
    }

    @JsonCreator
    public String toValue() {
        return this.value;
    }
}
