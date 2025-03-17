package org.myapp.client.Broker;

import org.myapp.model.Bond;

/**
 * Интерфейс для торговых операций с API брокера
 * 
 * @author Fonov Aleksandr
 * @since 16-03-2025
 * @version 0.1
 */
public interface TradeClient {
    /**
     * метод для получени первой цены в стакане на момент запроса
     *
     * @param b облигация, по которой нужно получить цену
     * @return цена облигации
     */
    public double getBondPrice(Bond b);

    /**
     * метод продажи облигации по указанной цене.
     *
     * @param b облигация, которую требуется продать
     * @param price желаемая цена продажи
     * @return удалось ли продать облигацию
     */
    public Boolean sellBond(Bond b, double price);
}
