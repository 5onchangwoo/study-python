package hello.core.order;

public interface OrderService {
    //1.주문 생성(클라이언트 -> 주문 서비스 역할)
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
