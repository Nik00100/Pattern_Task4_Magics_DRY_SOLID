package command;

import console.ConsoleHelper;

public class InfoCommand implements Command {
    private String info = "Добро пожаловать в онлайн-магазин спортивного инвертаря." +
            "\nВыберите команду: " +
            "\n1. Вывести список доступного спортинвентаря магазина " +
            "\n2. Отфильтровать спортинвентарь магазина по виду спорта (футбол, хоккей, теннис) " +
            "\n3. Отсорировать спортинвентарь магазина по значению (рейтинг, название инвентаря, цена)" +
            "\n4. Добавить спортинвентарь в корзину " +
            "\n5. Убрать спортинвентарь из корзины " +
            "\n6. Показать весь спортинвентарь в корзине " +
            "\n7. Завершить ";

    @Override
    public void execute() {
        ConsoleHelper.writeMessage(info);
    }
}