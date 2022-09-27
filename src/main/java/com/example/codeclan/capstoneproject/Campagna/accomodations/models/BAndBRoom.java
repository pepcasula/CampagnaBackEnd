package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.example.codeclan.capstoneproject.Campagna.repositories.BookingRepository;
import com.example.codeclan.capstoneproject.Campagna.repositories.DayBookedRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
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
    @JsonIgnoreProperties({"bandbRooms"})
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
        this.bookings = new ArrayList<>();
    }

    public BAndBRoom() {
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
            for(LocalDate date : possibleBooking.getDaysBooked()){
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

//    public List<LocalDate> getBookedDays(){
//        List<LocalDate> daysRoomIsBooked = new ArrayList<>();
//        for(Booking booking : this.bookings){
//            daysRoomIsBooked.addAll(booking.getDaysBooked());
//        }
//        return daysRoomIsBooked;
//    }

    public BAndB getbAndB() {
        return bAndB;
    }

    public void setbAndB(BAndB bAndB) {
        this.bAndB = bAndB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Booking> getBookings() {
        return this.bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
