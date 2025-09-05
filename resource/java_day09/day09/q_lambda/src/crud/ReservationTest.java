package crud;

public class ReservationTest {
    public static void main(String[] args) {
        ReservationManager manager = new ReservationManager();

        manager.addReservation(new Reservation(1, "해리포터", "김태민", 5));
        manager.addReservation(new Reservation(2, "해리포터", "홍길동", 6));
        manager.addReservation(new Reservation(3, "F1", "이강인", 3));
        manager.addReservation(new Reservation(4, "해리포터", "중복", 5));

        System.out.println("\n[전체 예매 내역]");
        manager.showAllReservations();

        System.out.println("\n[좌석 변경 시도: 중복된 좌석]");
        manager.updateSeat(2, 5);

        System.out.println("\n[좌석 변경 시도: 정상]");
        manager.updateSeat(2, 7); 

        System.out.println("\n[예매 취소]");
        manager.cancelReservation(3); 

        System.out.println("\n[최종 예매 내역]");
        manager.showAllReservations();
    }
}
