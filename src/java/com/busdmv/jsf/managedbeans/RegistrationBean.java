package com.busdmv.jsf.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean //помечает класс как управляемый бин JSF, переключая первый символ имени класса в нижний регистр
@RequestScoped //бин имеет конкст запроса. Другие варианты SessionScoped | ApplicationScoped | NoneScoped | ViewScoped
public class RegistrationBean {

    public RegistrationBean() {
    }

    private String salutation;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
