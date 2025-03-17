package org.myapp.model;

public enum OperationState{
    /**
     * Статус операции не определён
     */
    OPERATION_STATE_UNSPECIFIED,

    /**
     * Исполнена частично или полностью
     */
    OPERATION_STATE_EXECUTED,

    /**
     * Отменена
     */
    OPERATION_STATE_CANCELED,

    /**
     * Исполняется
     */
    OPERATION_STATE_PROGRESS;
}
