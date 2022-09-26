package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Stream;

@Entity
@Table(name = "bandbRooms")
public class BAndBRoom{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @ManyToOne
    @JsonIgnoreProperties({"bandbRoom"})
    @JoinColumn(name = "bandb_id", nullable = false)
    private BAndB bAndB;
    @Column
    protected String name;
    @Column
    protected RoomType roomType;
    @Column
    protected int price;
    @OneToMany(mappedBy = "bandbRoom")
    @JsonIgnoreProperties({"bandbRoom"})
    protected List<Booking> bookings;

    public BAndBRoom(String name, RoomType roomType, int price, BAndB bAndB) {
        this.name = name;
        this.roomType = roomType;
        this.price = price;
        this.bAndB = bAndB;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoomPrice(BAndBRoom bAndBRoom){
        return this.price;
    }

        public boolean isBigEnough(int numberOfGuests){
        if(numberOfGuests < this.roomType.getCapacity()){
            return true;
        } else {
            return false;
        }
    }

    public int getCapacity(){
        return this.roomType.getCapacity();
    }

    public Booking newBooking(int year, int month, int day, int numberOfDays){
        Booking booking = new Booking(year, month, day, numberOfDays, this);
        return booking;
    }

    public boolean checkNotDoubleBooked(Booking possibleBooking){
        boolean doubleBooked = false;
        for(Booking booking : this.bookings){
            for(DayBooked date : possibleBooking.getDaysBooked()){
                doubleBooked = Stream.of(booking.getDaysBooked()).anyMatch(dayBooked -> dayBooked.contains(date));
            }
        }
        return doubleBooked;
    }

    public int makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests){
        Booking possibleBooking = newBooking(year , month , day , numberOfDays );
        if (checkNotDoubleBooked(possibleBooking)){
            return 0;
        } else {
            this.bookings.add(possibleBooking);
            return this.roomType.getCapacity();
        }
    }
}
