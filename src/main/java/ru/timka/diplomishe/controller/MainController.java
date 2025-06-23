package ru.timka.diplomishe.controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import ru.timka.diplomishe.model.Product;
import ru.timka.diplomishe.repository.ProductRepository;

import java.util.HashMap;
import java.util.Map;

public class MainController {
    @FXML private VBox mainContainer;
    @FXML private Button ozonButton;
    @FXML private Button wildberriesButton;
    @FXML private Button yandexMarketButton;
    @FXML private TextField searchField;
    @FXML private Label storeInfoLabel;
    @FXML private ListView<Product> productsListView;
    @FXML private TextField minPriceField;
    @FXML private TextField maxPriceField;
    @FXML private Button applyFilterButton;
    @FXML private Button resetFilterButton;

    private final ProductRepository productRepository = new ProductRepository();
    private final Map<String, Button> storeButtons = new HashMap<>();

    // Цвета для магазинов
    private static final String OZON_COLOR = "#005BFF";
    private static final String OZON_LIGHT_COLOR = "#E6EEFF";
    private static final String WILDBERRIES_COLOR = "#8D44BC";
    private static final String WILDBERRIES_LIGHT_COLOR = "#F1E8F7";
    private static final String YANDEX_MARKET_COLOR = "#FC3F1D";
    private static final String YANDEX_MARKET_LIGHT_COLOR = "#FFE6E2";

    private String currentStore = null;
    private FilteredList<Product> filteredProducts;

    public void initialize() {
        setupStoreButtons();
        setupListView();
        setupSearch();
        setupFiltering();
        Platform.runLater(() -> selectStore("Ozon"));
    }

    private void setupStoreButtons() {
        configureButton(ozonButton, OZON_COLOR, "Ozon");
        configureButton(wildberriesButton, WILDBERRIES_COLOR, "Wildberries");
        configureButton(yandexMarketButton, YANDEX_MARKET_COLOR, "Яндекс.Маркет");

        storeButtons.put("Ozon", ozonButton);
        storeButtons.put("Wildberries", wildberriesButton);
        storeButtons.put("Яндекс.Маркет", yandexMarketButton);
    }

    private void configureButton(Button button, String color, String storeName) {
        button.setStyle(String.format(
                "-fx-background-color: %s; -fx-text-fill: white; -fx-font-weight: bold;",
                color
        ));

        button.setOnAction(e -> selectStore(storeName));

        button.setOnMouseEntered(e -> button.setStyle(String.format(
                "-fx-background-color: derive(%s, -10%%); -fx-text-fill: white; -fx-font-weight: bold;",
                color
        )));

        button.setOnMouseExited(e -> {
            if (!storeName.equals(currentStore)) {
                button.setStyle(String.format(
                        "-fx-background-color: %s; -fx-text-fill: white; -fx-font-weight: bold;",
                        color
                ));
            }
        });
    }

    private void selectStore(String store) {
        if (currentStore != null) {
            Button prevButton = storeButtons.get(currentStore);
            prevButton.setStyle(String.format(
                    "-fx-background-color: %s; -fx-text-fill: white; -fx-font-weight: bold;",
                    getStoreColor(currentStore)
            ));
        }

        currentStore = store;
        Button currentButton = storeButtons.get(store);
        currentButton.setStyle(String.format(
                "-fx-background-color: %s; -fx-text-fill: white; -fx-font-weight: bold;",
                getStoreDarkColor(store)
        ));

        mainContainer.setStyle("-fx-background-color: " + getStoreLightColor(store) + ";");
        storeInfoLabel.setText("Текущий магазин: " + store);
        loadProducts(store);
    }

    private void loadProducts(String store) {
        ObservableList<Product> products = FXCollections.observableArrayList(
                productRepository.getProductsByStore(store)
        );

        filteredProducts = new FilteredList<>(products);
        productsListView.setItems(filteredProducts);
        resetFilter(); // Сброс фильтров при смене магазина
    }

    private void setupListView() {
        productsListView.setCellFactory(param -> new ListCell<Product>() {
            @Override
            protected void updateItem(Product item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(String.format("%s - %.2f руб.", item.getName(), item.getPrice()));
                }
            }
        });
    }

    private void setupSearch() {
        searchField.textProperty().addListener((observable, oldValue, newValue) -> {
            applyFilters();
        });
    }

    private void setupFiltering() {
        applyFilterButton.setOnAction(e -> applyFilters());
        resetFilterButton.setOnAction(e -> resetFilter());

        // Обработка нажатия Enter в полях цены
        minPriceField.setOnAction(e -> applyFilters());
        maxPriceField.setOnAction(e -> applyFilters());
    }

    private void applyFilters() {
        String searchText = searchField.getText().toLowerCase();

        double minPrice;
        double maxPrice;

        try {
            minPrice = minPriceField.getText().isEmpty() ? 0 : Double.parseDouble(minPriceField.getText());
        } catch (NumberFormatException e) {
            showAlert("Ошибка", "Некорректное значение минимальной цены");
            return;
        }

        try {
            maxPrice = maxPriceField.getText().isEmpty() ? Double.MAX_VALUE : Double.parseDouble(maxPriceField.getText());
        } catch (NumberFormatException e) {
            showAlert("Ошибка", "Некорректное значение максимальной цены");
            return;
        }

        if (minPrice > maxPrice) {
            showAlert("Ошибка", "Минимальная цена не может быть больше максимальной");
            return;
        }

        filteredProducts.setPredicate(product -> {
            boolean matchesSearch = product.getName().toLowerCase().contains(searchText);
            boolean matchesPrice = product.getPrice() >= minPrice && product.getPrice() <= maxPrice;
            return matchesSearch && matchesPrice;
        });
    }

    private void resetFilter() {
        minPriceField.clear();
        maxPriceField.clear();
        searchField.clear();
        filteredProducts.setPredicate(null);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private String getStoreColor(String store) {
        return switch (store) {
            case "Ozon" -> OZON_COLOR;
            case "Wildberries" -> WILDBERRIES_COLOR;
            case "Яндекс.Маркет" -> YANDEX_MARKET_COLOR;
            default -> "#CCCCCC";
        };
    }

    private String getStoreDarkColor(String store) {
        return switch (store) {
            case "Ozon" -> deriveColor(OZON_COLOR, -20);
            case "Wildberries" -> deriveColor(WILDBERRIES_COLOR, -20);
            case "Яндекс.Маркет" -> deriveColor(YANDEX_MARKET_COLOR, -20);
            default -> "#999999";
        };
    }

    private String getStoreLightColor(String store) {
        return switch (store) {
            case "Ozon" -> OZON_LIGHT_COLOR;
            case "Wildberries" -> WILDBERRIES_LIGHT_COLOR;
            case "Яндекс.Маркет" -> YANDEX_MARKET_LIGHT_COLOR;
            default -> "#FFFFFF";
        };
    }

    private String deriveColor(String color, int percent) {
        return String.format("derive(%s, %d%%)", color, percent);
    }
}