public class Ex002_2OCP {
    public static void main(String[] args) {

        System.out.println(new BaseClient().getDiscount(100));
        System.out.println(new SilverPartner().getDiscount(100));
        System.out.println(new VIPPartner().getDiscount(100));
    }
}
// Выделяем отдельную сущность клиент, который по умолчанию будет получать базовую скидочку 5%
class BaseClient {
    public double getDiscount(double price) {
        return price * 0.95;
    }
}
// Выделим сущность Silver, который переопределяет тот функционал, который уже описан в BaseClient
class SilverPartner extends BaseClient {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}
// точно также VIP переопределят Silver
class VIPPartner extends SilverPartner {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}