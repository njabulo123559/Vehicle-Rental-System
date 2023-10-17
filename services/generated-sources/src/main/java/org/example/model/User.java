package org.example.model;

        import io.swagger.annotations.ApiModel;
        import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "A user")
public class User {

    @ApiModelProperty(value = "The unique identifier for the user")
    private String id;

    @ApiModelProperty(value = "First name of the user")
    private String firstName;

    @ApiModelProperty(value = "Last name of the user")
    private String lastName;

    @ApiModelProperty(value = "Date of birth of the user")
    private String dateOfBirth;

    @ApiModelProperty(value = "RSA ID of the user")
    private String rsaId;
}
