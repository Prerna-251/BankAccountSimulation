/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountsimulation;

/**
 *
 * @author Prerna
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    String type;
    double amount;
    String date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return date + " - " + type + ": " + amount;
    }
}

