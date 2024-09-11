package com.example.designpattern.behavioral.state.refactor;

public class ReservedRoomState implements HotelRoomState {

    private final HotelRoom room;

    public ReservedRoomState(HotelRoom room) {
        this.room = room;
    }

    @Override
    public void reserveRoom() {
        System.out.println("이미 예약된 객실입니다.");
    }

    @Override
    public void checkIn() {
        System.out.println("체크인 완료");
        room.changeState(new OccupiedRoomState(room));
    }

    @Override
    public void checkOut() {
        System.out.println("아직 체크인이 완료되지 않았습니다.");
    }

    @Override
    public void cancelReservation() {
        System.out.println("객실 예약 취소");
        room.changeState(new AvailableRoomState(room));
    }
}
