package BaseballFeedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {
    BaseballGame baseballGame;

    @BeforeEach
    void setUp() {
        baseballGame  = new BaseballGame();
    }

    @Test
    @DisplayName("새 게임 여부 테스트")
    void wantMoreGameTest() {

        Method me = null;
        try {
            me = baseballGame.getClass().getDeclaredMethod("wantMoreGame", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        me.setAccessible(true);
        try {
            assertThat(me.invoke(baseballGame, "1")).isEqualTo(true);
            assertThat(me.invoke(baseballGame, "2")).isEqualTo(false);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}