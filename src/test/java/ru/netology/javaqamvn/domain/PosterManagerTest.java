package ru.netology.javaqamvn.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqamvn.domain.PosterManager;

public class PosterManagerTest {
    @Test
    public void testAdd() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        manager.addMovie("Операция Фортуна");
        manager.addMovie("Аватар путь воды");
        manager.addMovie("Мстители");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-неведимка", "Тролли", "Номер один", "Операция Фортуна", "Аватар путь воды", "Мстители"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testEqualToTheLimit() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        manager.addMovie("Стажер");
        manager.addMovie("Аватар путь воды");
        manager.addMovie("Мстители");

        manager.findLast();

        String[] expected = {"Мстители", "Аватар путь воды", "Стажер", "Номер один", "Тролли", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOverLimit() {
        PosterManager manager = new PosterManager(15);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");


        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMinLimit() {
        PosterManager manager = new PosterManager(4);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");


        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}