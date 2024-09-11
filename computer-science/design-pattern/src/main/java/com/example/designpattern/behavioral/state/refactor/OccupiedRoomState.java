package com.example.designpattern.behavioral.state.refactor;

public class OccupiedRoomState implements HotelRoomState{
    private final HotelRoom room;

    public OccupiedRoomState(HotelRoom room) {
        this.room = room;
    }

    @Override
    public void reserveRoom() {
        System.out.println("체크인 상태의 객실입니다.");
    }

    @Override
    public void checkIn() {
        System.out.println("이미 체크인 되었습니다.");
    }

    @Override
    public void checkOut() {
        System.out.println("체크아웃 완료");
        room.changeState(new AvailableRoomState(room));
    }

    @Override
    public void cancelReservation() {
        System.out.println("이미 체크인 되었습니다. 취소할 수 없습니다.");
    }
}
