package org.example.entities;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticket {
    @JsonProperty("ticket_id")
    private String ticketId;
    @JsonProperty("user_id")
    private String userId;
    private User user;
    private Integer seatNo;

    private String source;
    private String destination;
    private Date dateOfTravel;
    private Train train;

    public Ticket() {
    }

    public Ticket(String ticketId, String source, String destination, Date dateOfTravel, Train train, User user,
            Integer seatNo) {
        this.ticketId = ticketId;
        this.source = source;
        this.destination = destination;
        this.dateOfTravel = dateOfTravel;
        this.train = train;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getTicketInfo() {
        return String.format("Ticket ID: %s belongs to User %s from %s to %s on %s", ticketId, userId, source,
                destination, dateOfTravel);
    }
}