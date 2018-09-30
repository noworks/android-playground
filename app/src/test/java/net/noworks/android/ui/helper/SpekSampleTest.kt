package net.noworks.android.ui.helper

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object SpekSampleTest : Spek({
 
    describe("SampleCalculatorのテスト") {
        val calculator = SampleCalculatorHelper()
 
        on("足算") {
            val sum = calculator.sum(2, 4)

            it("2+4が6になるテスト") {
                assertEquals(6, sum)
            }
        }
 
        on("引算") {
            val subtract = calculator.subtract(4, 2)

            it("4-2は2になるテスト") {
                println(subtract)
                assertEquals(2, subtract)
            }
        }
    }
 
})