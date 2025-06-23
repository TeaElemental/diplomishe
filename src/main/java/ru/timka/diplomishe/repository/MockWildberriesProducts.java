package ru.timka.diplomishe.repository;

import ru.timka.diplomishe.model.Product;
import java.util.ArrayList;
import java.util.List;

public class MockWildberriesProducts {
    public static List<Product> generate() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("wb-001", "Смартфон Xiaomi Redmi Note 12", 24990, "Wildberries", "Электроника"));
        products.add(new Product("wb-002", "Наушники TWS Realme Buds Air 3", 4990, "Wildberries", "Электроника"));
        products.add(new Product("wb-003", "Умные часы Haylou Solar LS05", 3990, "Wildberries", "Электроника"));
        products.add(new Product("wb-004", "Электронная книга PocketBook 616", 12990, "Wildberries", "Электроника"));
        products.add(new Product("wb-005", "Фитнес-браслет Huawei Band 6", 2990, "Wildberries", "Электроника"));
        products.add(new Product("wb-006", "Микроволновая печь LG MS2042V", 12990, "Wildberries", "Бытовая техника"));
        products.add(new Product("wb-007", "Пылесос Thomas DryBOX Amfibia", 19990, "Wildberries", "Бытовая техника"));
        products.add(new Product("wb-008", "Блендер Braun MQ 5045", 7990, "Wildberries", "Бытовая техника"));
        products.add(new Product("wb-009", "Стиральная машина Indesit IWUD 4085", 32990, "Wildberries", "Бытовая техника"));
        products.add(new Product("wb-010", "Тостер CENTEK CT-1432", 2390, "Wildberries", "Бытовая техника"));
        products.add(new Product("wb-011", "Плед флисовый 150x200 см", 1490, "Wildberries", "Товары для дома"));
        products.add(new Product("wb-012", "Набор кастрюль Vitesse Classic", 5990, "Wildberries", "Товары для дома"));
        products.add(new Product("wb-013", "Торшер напольный Eglo 98598", 4990, "Wildberries", "Товары для дома"));
        products.add(new Product("wb-014", "Вешалка для одежды напольная", 1890, "Wildberries", "Товары для дома"));
        products.add(new Product("wb-015", "Очиститель воздуха Philips AC2887", 14990, "Wildberries", "Товары для дома"));
        products.add(new Product("wb-016", "Рюкзак школьный DerDieDas", 2990, "Wildberries", "Канцелярия"));
        products.add(new Product("wb-017", "Набор карандашей Koh-i-Noor", 890, "Wildberries", "Канцелярия"));
        products.add(new Product("wb-018", "Книга '1984' Дж. Оруэлл", 490, "Wildberries", "Книги"));
        products.add(new Product("wb-019", "Папка для документов А4", 290, "Wildberries", "Канцелярия"));
        products.add(new Product("wb-020", "Настольный органайзер", 1290, "Wildberries", "Канцелярия"));

        products.add(new Product("wb-001", "Смартфон Xiaomi 13 Pro 512GB", 84990, "Wildberries", "Электроника"));
        products.add(new Product("wb-002", "Наушники JBL Tune 760NC", 7990, "Wildberries", "Электроника"));
        products.add(new Product("wb-003", "Умные часы Huawei Watch GT 3", 14990, "Wildberries", "Электроника"));
        products.add(new Product("wb-004", "Планшет Samsung Galaxy Tab S8", 74990, "Wildberries", "Электроника"));
        products.add(new Product("wb-005", "Электронная книга PocketBook 740", 18990, "Wildberries", "Электроника"));

        // Бытовая техника
        products.add(new Product("wb-006", "Стиральная машина LG F4J6", 54990, "Wildberries", "Бытовая техника"));
        products.add(new Product("wb-007", "Холодильник Bosch Serie 4", 89990, "Wildberries", "Бытовая техника"));
        products.add(new Product("wb-008", "Микроволновая печь Samsung", 11990, "Wildberries", "Бытовая техника"));
        products.add(new Product("wb-009", "Блендер Philips Daily Collection", 3990, "Wildberries", "Бытовая техника"));
        products.add(new Product("wb-010", "Утюг с парогенератом Tefal", 14990, "Wildberries", "Бытовая техника"));

        // Товары для дома
        products.add(new Product("wb-011", "Комплект штор blackout 2 шт", 5990, "Wildberries", "Товары для дома"));
        products.add(new Product("wb-012", "Пуфик кожаный круглый", 7990, "Wildberries", "Товары для дома"));
        products.add(new Product("wb-013", "Набор постельного белья сатин", 3490, "Wildberries", "Товары для дома"));
        products.add(new Product("wb-014", "Светильник LED потолочный", 4990, "Wildberries", "Товары для дома"));
        products.add(new Product("wb-015", "Умный термометр Xiaomi", 1990, "Wildberries", "Товары для дома"));

        // Канцелярия
        products.add(new Product("wb-016", "Набор гелевых ручек 12 цветов", 490, "Wildberries", "Канцелярия"));
        products.add(new Product("wb-017", "Акварельные краски 24 цвета", 990, "Wildberries", "Канцелярия"));
        products.add(new Product("wb-018", "Скоросшиватель на кольцах", 290, "Wildberries", "Канцелярия"));
        products.add(new Product("wb-019", "Тетрадь 96 листов А4", 190, "Wildberries", "Канцелярия"));
        products.add(new Product("wb-020", "Набор маркеров для текста", 590, "Wildberries", "Канцелярия"));
        // Дополнительные смартфоны
        products.add(new Product("wb-021", "Смартфон Samsung Galaxy A54 128GB", 34990, "Wildberries", "Электроника"));
        products.add(new Product("wb-022", "Смартфон Apple iPhone 13 128GB", 69990, "Wildberries", "Электроника"));
        products.add(new Product("wb-023", "Смартфон Poco X5 Pro 5G", 27990, "Wildberries", "Электроника"));
        products.add(new Product("wb-024", "Смартфон Infinix Note 12 VIP", 22990, "Wildberries", "Электроника"));
        products.add(new Product("wb-025", "Смартфон Tecno Camon 19 Pro", 18990, "Wildberries", "Электроника"));
        products.add(new Product("wb-026", "Смартфон Oppo Reno 8 Pro", 44990, "Wildberries", "Электроника"));
        products.add(new Product("wb-027", "Смартфон Vivo V25 Pro", 37990, "Wildberries", "Электроника"));
        products.add(new Product("wb-028", "Смартфон Realme 10 Pro+", 32990, "Wildberries", "Электроника"));
        products.add(new Product("wb-029", "Смартфон ZTE Nubia Z40 Pro", 59990, "Wildberries", "Электроника"));
        products.add(new Product("wb-030", "Смартфон Black Shark 5 Pro", 64990, "Wildberries", "Электроника"));

// Дополнительные ноутбуки
        products.add(new Product("wb-031", "Ноутбук Acer Predator Helios 300", 129990, "Wildberries", "Электроника"));
        products.add(new Product("wb-032", "Ноутбук Lenovo Legion 5 Pro", 139990, "Wildberries", "Электроника"));
        products.add(new Product("wb-033", "Ноутбук ASUS TUF Gaming F15", 99990, "Wildberries", "Электроника"));
        products.add(new Product("wb-034", "Ноутбук HP Victus 16-d1022ur", 89990, "Wildberries", "Электроника"));
        products.add(new Product("wb-035", "Ноутбук Dell G15 5520", 109990, "Wildberries", "Электроника"));
        products.add(new Product("wb-036", "Ноутбук MSI Stealth GS77", 199990, "Wildberries", "Электроника"));
        products.add(new Product("wb-037", "Ноутбук Razer Blade 15", 189990, "Wildberries", "Электроника"));
        products.add(new Product("wb-038", "Ноутбук Gigabyte AORUS 15 XE4", 159990, "Wildberries", "Электроника"));
        products.add(new Product("wb-039", "Ноутбук Xiaomi RedmiBook Pro 15", 79990, "Wildberries", "Электроника"));
        products.add(new Product("wb-040", "Ноутбук Chuwi CoreBook X", 49990, "Wildberries", "Электроника"));
        return products;
    }
}