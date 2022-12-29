package com.example.demo

import com.example.demo.service.CalculatorService
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ExampleTest : FunSpec({
    val calculatorService = CalculatorService()
    test("테스트") {
        calculatorService.add(2, 5) shouldBe 7
    }
    test("테스트2") {
        calculatorService.add(2, 5) shouldBe 7
    }
})
