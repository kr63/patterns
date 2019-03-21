package org.example.networks;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Network {
    String userName;
    String password;

    /**
     * Публикация данных в любой сети.
     */
    public boolean post(String message) {
        // Проверка данных пользователя перед постом в соцсеть. Каждая сеть для
        // проверки использует разные методы.
        if (logIn(this.userName, this.password)) {
            // Отправка данных.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logOut();
}
