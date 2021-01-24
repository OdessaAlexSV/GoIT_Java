package main.java;

/**
 * Напиши класс GooSearchResult.
 * У класса должен быть публичный конструктор, принимающий один параметр:
 * url типа String - URL страницы с искомой информацией;
 * Конструктор должен сохранить этот параметр в приватное поле с таким же именем.
 * Создай для этого поля публичный геттер. Сеттер не создавай, это иммутабельный класс.
 * Напиши в этом классе метод parseDomain(), который будет выделять домен из поля url.
 */

import java.net.URI;
import java.net.URISyntaxException;

class GooSearchResult {

    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String domain = uri.getHost();
        return domain;
    }
}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}