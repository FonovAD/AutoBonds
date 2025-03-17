package org.myapp.model;

public class MoneyValue {
    /**
     * Строковый ISO-код валюты
     */
    private String currency;
    /**
     * Целая часть суммы, может быть отрицательным числом
     */
    private Integer units;
    /**
     * Дробная часть суммы, может быть отрицательным числом
     */
    private Integer nano;

}
