package ru.timka.diplomishe.repository;

import ru.timka.diplomishe.model.Product;
import java.util.ArrayList;
import java.util.List;

public class MockYandexMarketProducts {
    public static List<Product> generate() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("ym-001", "Смартфон Apple iPhone 14 128GB", 89990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-002", "Наушники Sony WH-1000XM5", 34990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-003", "Умные часы Samsung Galaxy Watch5", 19990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-004", "Ноутбук Acer Nitro 5 AN515-57", 79990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-005", "Фитнес-браслет Honor Band 6", 2990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-006", "Хлебопечка Redmond RBM-M1912", 12990, "Яндекс.Маркет", "Бытовая техника"));
        products.add(new Product("ym-007", "Посудомоечная машина Bosch SMS44GI01R", 54990, "Яндекс.Маркет", "Бытовая техника"));
        products.add(new Product("ym-008", "Электрическая плитка Kitfort KT-105", 2990, "Яндекс.Маркет", "Бытовая техника"));
        products.add(new Product("ym-009", "Утюг Philips GC4565/20", 4990, "Яндекс.Маркет", "Бытовая техника"));
        products.add(new Product("ym-010", "Мясорубка Moulinex ME 208139", 7990, "Яндекс.Маркет", "Бытовая техника"));
        products.add(new Product("ym-011", "Шторы блэкаут 150x250 см", 3990, "Яндекс.Маркет", "Товары для дома"));
        products.add(new Product("ym-012", "Ковер 160x230 см шерстяной", 8990, "Яндекс.Маркет", "Товары для дома"));
        products.add(new Product("ym-013", "Настольная лампа Uniel TLD-09", 1990, "Яндекс.Маркет", "Товары для дома"));
        products.add(new Product("ym-014", "Зеркало в ванную 60x80 см", 4990, "Яндекс.Маркет", "Товары для дома"));
        products.add(new Product("ym-015", "Умная розетка Xiaomi Mi Smart", 1490, "Яндекс.Маркет", "Товары для дома"));
        products.add(new Product("ym-016", "Набор маркеров для досок", 790, "Яндекс.Маркет", "Канцелярия"));
        products.add(new Product("ym-017", "Степлер металлический 24/6", 490, "Яндекс.Маркет", "Канцелярия"));
        products.add(new Product("ym-018", "Книга 'Война и мир' Л. Толстой", 690, "Яндекс.Маркет", "Книги"));
        products.add(new Product("ym-019", "Тетрадь 96л А5 в клетку", 390, "Яндекс.Маркет", "Канцелярия"));
        products.add(new Product("ym-020", "Набор линеек 4 предмета", 590, "Яндекс.Маркет", "Канцелярия"));

        products.add(new Product("ym-001", "Смартфон Apple iPhone 14 128GB", 89990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-002", "Наушники Sony WH-1000XM5", 34990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-003", "Умные часы Samsung Galaxy Watch5", 19990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-004", "Ноутбук Acer Nitro 5 AN515-57", 79990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-005", "Фитнес-браслет Honor Band 6", 2990, "Яндекс.Маркет", "Электроника"));

        // Бытовая техника
        products.add(new Product("ym-006", "Хлебопечка Redmond RBM-M1912", 12990, "Яндекс.Маркет", "Бытовая техника"));
        products.add(new Product("ym-007", "Посудомоечная машина Bosch SMS44GI01R", 54990, "Яндекс.Маркет", "Бытовая техника"));
        products.add(new Product("ym-008", "Электрическая плитка Kitfort KT-105", 2990, "Яндекс.Маркет", "Бытовая техника"));
        products.add(new Product("ym-009", "Утюг Philips GC4565/20", 4990, "Яндекс.Маркет", "Бытовая техника"));
        products.add(new Product("ym-010", "Мясорубка Moulinex ME 208139", 7990, "Яндекс.Маркет", "Бытовая техника"));

        // Товары для дома
        products.add(new Product("ym-011", "Шторы блэкаут 150x250 см", 3990, "Яндекс.Маркет", "Товары для дома"));
        products.add(new Product("ym-012", "Ковер 160x230 см шерстяной", 8990, "Яндекс.Маркет", "Товары для дома"));
        products.add(new Product("ym-013", "Настольная лампа Uniel TLD-09", 1990, "Яндекс.Маркет", "Товары для дома"));
        products.add(new Product("ym-014", "Зеркало в ванную 60x80 см", 4990, "Яндекс.Маркет", "Товары для дома"));
        products.add(new Product("ym-015", "Умная розетка Xiaomi Mi Smart", 1490, "Яндекс.Маркет", "Товары для дома"));

        // Канцелярия
        products.add(new Product("ym-016", "Набор маркеров для досок", 790, "Яндекс.Маркет", "Канцелярия"));
        products.add(new Product("ym-017", "Степлер металлический 24/6", 490, "Яндекс.Маркет", "Канцелярия"));
        products.add(new Product("ym-018", "Книга 'Война и мир' Л. Толстой", 690, "Яндекс.Маркет", "Книги"));
        products.add(new Product("ym-019", "Тетрадь 96л А5 в клетку", 390, "Яндекс.Маркет", "Канцелярия"));
        products.add(new Product("ym-020", "Набор линеек 4 предмета", 590, "Яндекс.Маркет", "Канцелярия"));

        // Дополнительные смартфоны
        products.add(new Product("ym-021", "Смартфон Samsung Galaxy S23 Ultra", 129990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-022", "Смартфон Apple iPhone 14 Pro Max", 134990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-023", "Смартфон Xiaomi 13 Lite", 39990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-024", "Смартфон Nothing Phone (1)", 42990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-025", "Смартфон Sony Xperia 1 IV", 99990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-026", "Смартфон Motorola Edge 30 Fusion", 54990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-027", "Смартфон Huawei P60 Pro", 89990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-028", "Смартфон Oppo Find X5 Pro", 79990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-029", "Смартфон Google Pixel 7a", 49990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-030", "Смартфон CAT S62 Pro", 59990, "Яндекс.Маркет", "Электроника"));

// Дополнительные ноутбуки
        products.add(new Product("ym-031", "Ноутбук Apple MacBook Air M2", 119990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-032", "Ноутбук Dell Alienware x17 R2", 249990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-033", "Ноутбук ASUS ZenBook Pro Duo", 199990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-034", "Ноутбук Lenovo Yoga Slim 7 Pro", 99990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-035", "Ноутбук HP Spectre x360 14", 149990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-036", "Ноутбук Acer ConceptD 7", 189990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-037", "Ноутбук Microsoft Surface Pro 9", 159990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-038", "Ноутбук Razer Blade 14", 179990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-039", "Ноутбук Gigabyte AERO 16 OLED", 219990, "Яндекс.Маркет", "Электроника"));
        products.add(new Product("ym-040", "Ноутбук LG Gram 17", 139990, "Яндекс.Маркет", "Электроника"));

        return products;
    }
}