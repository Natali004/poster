package ru.netology.javaqamvn.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PosterManagerTest{

        @Test
        public void findLast() {
            PosterManager manager = new PosterManager();
            manager.addFilm("Бладшот");
            manager.addFilm("Вперед");
            manager.addFilm("Отель Белград");
            manager.addFilm("Джентельмены");
            manager.addFilm("Человек-неведимка");
            manager.addFilm("Тролли");
            manager.addFilm("Номер один");
            manager.addFilm("Стажер");
            manager.addFilm("Аватар путь воды");
            manager.addFilm("Мстители");

            String[] actual = manager.findLast();
            String[] expected = {"Мстители", "Аватар путь воды", "Стажер", "Номер один", "Тролли", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};

            assertArrayEquals(expected, actual);
        }

        @Test
        public void moreThanTheLimit() {
            PosterManager manager = new PosterManager(11);
            manager.addFilm("Бладшот");
            manager.addFilm("Вперед");
            manager.addFilm("Отель Белград");
            manager.addFilm("Джентельмены");
            manager.addFilm("Человек-неведимка");
            manager.addFilm("Тролли");
            manager.addFilm("Номер один");
            manager.addFilm("Стажер");
            manager.addFilm("Аватар путь воды");
            manager.addFilm("Мстители");

            String[] actual = manager.findLast();
            String[] expected = {"Мстители", "Аватар путь воды", "Стажер", "Номер один", "Тролли", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};

            assertArrayEquals(expected, actual);
        }

        @Test
        public void equalToTheLimit() {
            PosterManager manager = new PosterManager(10);
            manager.addFilm("Бладшот");
            manager.addFilm("Вперед");
            manager.addFilm("Отель Белград");
            manager.addFilm("Джентельмены");
            manager.addFilm("Человек-неведимка");
            manager.addFilm("Тролли");
            manager.addFilm("Номер один");
            manager.addFilm("Стажер");
            manager.addFilm("Аватар путь воды");
            manager.addFilm("Мстители");

            String[] actual = manager.findLast();
            String[] expected = {"Мстители", "Аватар путь воды", "Стажер", "Номер один", "Тролли", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};

            assertArrayEquals(expected, actual);
        }

        @Test
        public void lessThanTheLimit() {
            PosterManager manager = new PosterManager(9);
            manager.addFilm("Бладшот");
            manager.addFilm("Вперед");
            manager.addFilm("Отель Белград");
            manager.addFilm("Джентельмены");
            manager.addFilm("Человек-неведимка");
            manager.addFilm("Тролли");
            manager.addFilm("Номер один");
            manager.addFilm("Стажер");
            manager.addFilm("Аватар путь воды");
            manager.addFilm("Мстители");

            String[] actual = manager.findAll();
            String[] expected = {"Мстители", "Аватар путь воды", "Стажер", "Номер один", "Тролли", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};

            assertArrayEquals(expected, actual);
        }

    }