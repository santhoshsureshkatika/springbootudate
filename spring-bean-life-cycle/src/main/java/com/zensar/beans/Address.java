package com.zensar.beans;

public class Address {
private String city;
private String state;
private int pin;
private Address() {
super();
}
private Address(String city, String state, int pin) {
super();
this.city = city;
this.state = state;
this.pin = pin;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}
public int getPin() {
return pin;
}
public void setPin(int pin) {
this.pin = pin;
}
@Override
public String toString() {
return "Address [city=" + city + ", state=" + state + ", pin=" + pin + "]";
}

}