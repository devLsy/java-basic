package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요.");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] oders = new ProductOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) +"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            oders[i] = createOrder(productName, price, quantity);
        }
        printOrders(oders);
        int totalAmount = getTotalAmount(oders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명:" + order.productName + "가격:" + order.price + "수량:" + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalCount = 0;
        for (ProductOrder order : orders) {
            totalCount += order.price * order.quantity;
        }
        return totalCount;
    }






}
