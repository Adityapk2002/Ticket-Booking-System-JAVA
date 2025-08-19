package org.example.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String name;
    private String password;
    private String hashedPassword;
    @JsonProperty("tickets_booked")
    private List<Ticket> ticketBooked;
    @JsonProperty("user_id")
    private String userId;

    public User(String name, String password, String hashedPassword, List<Ticket> ticketBooked, String userId) {
        this.name = name;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.ticketBooked = ticketBooked;
        this.userId = userId;
    }

    public User() {
    } // default constructor if we dont pass anything it wont show anything

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public List<Ticket> getTicketBooked() {
        return ticketBooked;
    }

    public void printTickets() {
        for (int i = 0; i < ticketBooked.size(); i++) {
            System.out.println(ticketBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setPassword(String passsword) {
        this.password = passsword;
    }

    public void setTicketBooked(List<Ticket> ticketsBooked) {
        this.ticketBooked = ticketsBooked;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}