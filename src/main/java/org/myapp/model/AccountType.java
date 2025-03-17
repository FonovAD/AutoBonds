package org.myapp.model;

public enum AccountType {
    /**
     * 	Тип аккаунта не определён.
     */
    ACCOUNT_TYPE_UNSPECIFIED,

    /**
     * 	Брокерский счёт Т-Инвестиций.
     */
    ACCOUNT_TYPE_TINKOFF,

    /**
     * ИИС.
     */
    ACCOUNT_TYPE_TINKOFF_IIS,

    /**
     * Инвесткопилка.
     */
    ACCOUNT_TYPE_INVEST_BOX,

    /**
     * Фонд денежного рынка.
     */
    ACCOUNT_TYPE_INVEST_FUND,
}
