package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        assertThat(DummyBot.answer("Привет, бот."), is("Привет, умник."));
    }

    @Test
    public void whenBayBot() {
        assertThat(DummyBot.answer("Пока."), is("До скорой встречи."));
    }

    @Test
    public void whenUnknowBot() {
        assertThat(DummyBot.answer("test"), is("Это ставит меня в тупик. Задайте другой вопрос."));
    }
}