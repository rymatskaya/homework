package by.task16;

import java.util.Objects;

/**
 * 1. Создать класс счёт (Account). Поля идентификатор счёта (id), номер счёта, валюта счёт (String),
 *   сумма счёта (Double). Выполнить переопределение equals и hashcode по двум полям (id и номер счёта),
 *   так как логически, эти поля будут уникальными для каждого счёта.*/
public class Account {
    private int id;
    private String accountNum;
    private String currency;
    private Double summa;

    public Account(int id, String accountNum, String currency, Double summa) {
        this.id = id;
        this.accountNum = accountNum;
        this.currency = currency;
        this.summa = summa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getSumma() {
        return summa;
    }

    public void setSumma(Double summa) {
        this.summa = summa;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return getId() == account.getId() && Objects.equals(getAccountNum(), account.getAccountNum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAccountNum());
    }
}
