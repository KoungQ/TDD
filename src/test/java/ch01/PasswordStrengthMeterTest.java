package ch01;

import org.junit.jupiter.api.Test;

import static ch01.PasswordStrength.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {

    @Test
    void name() {}

    /**
     * 내가 작성하려는 로직을 테스트 코드에 컴파일 오류로 미리 구현한 후 (RED 단계)
     * 컴파일 오류를 하나씩 제거해감 (GREEN 단계)
     * 수정해야 될 부분이 생기면 또 위와 같은 단계 반복하여 리팩토링 (REFACTOR 단계)
     */

    @Test
    void meetsAllCriteriaThenStrong() {
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!@ABC"); // Expected: STRONG
        assertEquals(STRONG, result);
    }

    @Test
    void meetsOtherCriteriaExpectForLengthThenNormal() {
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!AB");   // Expected: NORMAL
        assertEquals(NORMAL, result);
    }
}
