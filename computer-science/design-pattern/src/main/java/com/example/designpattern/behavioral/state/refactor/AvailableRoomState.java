package com.example.designpattern.behavioral.state.refactor;

public class AvailableRoomState implements HotelRoomState{

    private final HotelRoom room;

    public AvailableRoomState(HotelRoom room) {
        this.room = room;
    }

    @Override
    public void reserveRoom() {
        System.out.println("객실 예약 완료");
        room.changeState(new ReservedRoomState(room));
    }

    @Override
    public void checkIn() {
        System.out.println("객실 예약이 필요합니다");
    }

    @Override
    public void checkOut() {
        System.out.println("아직 체크인이 완료되지 않았습니다.");
    }

    @Override
    public void cancelReservation() {
        System.out.println("예약된 객실이 없습니다.");
    }
}
