package v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import v1.car.Avante
import v1.car.K5
import v1.car.Sonata

class RentCompanyTest {
    private val NEWLINE = System.getProperty("line.separator")

    @Test
    @Throws(Exception::class)
    fun report() {
        val company = RentCompany.create() // factory method를 사용해 생성
        company.addCar(Sonata(150))
        company.addCar(K5(260))
        company.addCar(Sonata(120))
        company.addCar(Avante(300))
        company.addCar(K5(390))
        val report = company.generateReport()
        assertThat(report).isEqualTo(
            "Sonata : 15리터" + NEWLINE +
                    "K5 : 20리터" + NEWLINE +
                    "Sonata : 12리터" + NEWLINE +
                    "Avante : 20리터" + NEWLINE +
                    "K5 : 30리터" + NEWLINE
        )
    }
}