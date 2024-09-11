package com.example.designpattern.behavioral.state.refactor;

public class HotelRoom {

    private HotelRoomState state;


    public void changeState(HotelRoomState state) {
        this.state = state;
    }

    public void reserveRoom() {
        state.reserveRoom();
    }

    public void checkIn() {
        state.checkIn();
    }

    public void checkOut() {
        state.checkOut();
    }

    public void cancelReservation() {
        state.cancelReservation();
    }

    public String getState() {
        return state.getClass().getSimpleName();
    }
}
