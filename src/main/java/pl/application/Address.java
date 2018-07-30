package pl.application;


import com.sun.istack.internal.NotNull;

import javax.validation.constraints.*;

public class Address {

    @NotBlank
    @Pattern(regexp ="[A-Z]{1}+[a-zA-Z]*")
    private String city;
    @NotBlank
    private String street;
    @NotNull
    @Pattern(regexp = "\\d{2}-\\d{3}")
    private String post_code;
    @NotNull
    @Min(1)
    private int house_number;


    public Address( @NotNull @Pattern(regexp ="[A-Z]{1}+[a-zA-Z]*")String city,
                    @NotNull @Size(min = 1)String street,
                    @NotNull @Pattern(regexp = "\\d{2}-\\d{3}")String post_code,
                    @Min(1)int numer_budynku) {
        this.city = city;
        this.street = street;
        this.post_code = post_code;
        this.house_number = numer_budynku;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public int getHouse_number() {
        return house_number;
    }

    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }

    @Override
    public String toString() {
        return "Adres [" +
                "Miasto ='" + city + '\'' +
                ", ulica ='" + street + '\'' +
                ", Kod pocztowy = '" + post_code + '\'' +
                ", numer domu = " + house_number +
                ']';
    }
}
