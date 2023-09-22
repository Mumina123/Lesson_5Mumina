public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss(); // Экземпляр класса
        boss.setHealth(300);
        boss.setDamage(30);
        boss.setTypeOfProtection("Горячая защита");
        System.out.println("Жизнь Босса: " + boss.getHealth());
        System.out.println("Урон босса: "+ boss.getDamage());
        System.out.println("Тип защиты: "+ boss.getTypeOfProtection());
    }
}