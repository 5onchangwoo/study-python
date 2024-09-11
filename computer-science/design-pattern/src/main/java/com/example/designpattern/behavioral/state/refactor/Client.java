package com.example.designpattern.behavioral.state.refactor;

public class Client {
    public static void main(String[] args) {
        HotelRoom room = new HotelRoom();
        room.changeState(new AvailableRoomState(room));

        room.checkIn(); //객실 예약이 필요합니다
        room.checkOut(); //아직 체크인이 완료되지 않았습니다.

        room.reserveRoom(); //객실 예약 완료
        room.reserveRoom(); //이미 예약된 객실입니다.

        room.checkOut(); //아직 체크인이 완료되지 않았습니다.
        room.checkIn(); //체크인 완료
        room.cancelReservation(); //이미 체크인 되었습니다. 취소할 수 없습니다.

        room.checkOut(); //체크아웃 완료
        System.out.println("현재 상태: " + room.getState()); //현재 상태: AvailableRoomState
    }
}
