package kr.hs.emirim.Sagittta.kotlinsample

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    // Test Annotation임을 알려줌. 유닛테스트 단위는 함수다!.(가장 작은 단위, 개발자가 많이 사용)
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
