package solid.lsp;

public class FactoryOrder {

//    private int count = 0;

    public OrderAbstract create(int price, int qnt, boolean isBonus) {
        // Каждый 3-й заказ - бонусный
//        count++;
//        if (count == 3) {
//            count = 0;
//            return new OrderBonus(price, qnt);
//        }

        //Бонусный тот заказ который мы укажем true или false
        if (isBonus) {
            return new OrderBonus(price, qnt);
        }

        return new Order(price, qnt);
    }
}
