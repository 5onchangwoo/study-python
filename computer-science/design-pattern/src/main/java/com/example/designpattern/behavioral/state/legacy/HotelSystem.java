package com.example.designpattern.behavioral.state.legacy;

public class HotelSystem {

    private HotelState hotelState;

    public HotelSystem(HotelState hotelState) {
        this.hotelState = HotelState.AVAILABLE;
    }

    public void reserveRoom() {
        if(this.hotelState == HotelState.AVAILABLE) {
            System.out.println("객실 예약 완료");
            this.hotelState = HotelState.RESERVED;
        } else if (this.hotelState == HotelState.RESERVED) {
            System.out.println("이미 예약된 객실입니다.");
        } else if (this.hotelState == HotelState.OCCUPIED) {
            System.out.println("이미 체크인 되었습니다.");
        } else {
            System.out.println("잘못된 예약 상태입니다.");
        }
    }

    public void checkIn() {
        if(this.hotelState == HotelState.RESERVED) {
            System.out.println("체크인 완료");
            this.hotelState = HotelState.OCCUPIED;
        } else if (this.hotelState == HotelState.AVAILABLE) {
            System.out.println("먼저 객실 예약이 필요합니다.");
        } else if (this.hotelState == HotelState.OCCUPIED) {
            System.out.println("이미 체크인 되었습니다.");
        } else {
            System.out.println("잘못된 예약 상태입니다.");
        }
    }

    public void checkOut() {
        if(this.hotelState == HotelState.OCCUPIED) {
            System.out.println("체크아웃 완료");
            this.hotelState = HotelState.AVAILABLE;
        } else if (this.hotelState == HotelState.AVAILABLE) {
            System.out.println("아직 체크인이 완료되지 않았습니다.");
        } else if (this.hotelState == HotelState.RESERVED) {
            System.out.println("아직 체크인이 완료되지 않았습니다.");
        } else {
            System.out.println("잘못된 예약 상태입니다.");
        }
    }

    public void cancelReservation() {
        if(this.hotelState == HotelState.RESERVED) {
            System.out.println("객실 예약 취소 완료");
            this.hotelState = HotelState.AVAILABLE;
        } else if (this.hotelState == HotelState.AVAILABLE) {
            System.out.println("예약되어 있지 않습니다.");
        } else if (this.hotelState == HotelState.OCCUPIED) {
            System.out.println("체크인 된 객실은 예약을 취소할 수 없습니다.");
        } else {
            System.out.println("잘못된 예약 상태입니다.");
        }

    }
}
