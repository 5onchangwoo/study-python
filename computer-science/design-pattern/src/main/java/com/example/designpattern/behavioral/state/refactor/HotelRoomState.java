package com.example.designpattern.behavioral.state.refactor;

public interface HotelRoomState {
    void reserveRoom();
    void checkIn();
    void checkOut();
    void cancelReservation();
}
