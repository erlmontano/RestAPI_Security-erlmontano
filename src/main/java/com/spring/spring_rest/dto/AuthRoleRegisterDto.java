package com.spring.spring_rest.dto;

/**
 * Data Transfer Object carrying role details for role registration requests.
 */
public class AuthRoleRegisterDto {

    private String name;

    /**
     * Constructs an AuthRoleRegisterDto with the specified role name.
     */
    public AuthRoleRegisterDto(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
