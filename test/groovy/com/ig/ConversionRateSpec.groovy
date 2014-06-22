package com.ig

import spock.lang.Specification
import net.webservicex.Currency;

/**
 * Created by sachin on 22/06/14.
 */

class ConversionRateSpec extends Specification {
    ConversionRate cr = new ConversionRate()

    def "same currency should be rate of 1"() {
        when:
        double rate = cr.getConversionRate(Currency.USD, Currency.USD)
        then:
        rate == 1.0
    }

    def "rate from USD to INR is > 1"() {
        expect:
        double rate = cr.getConversionRate(Currency.USD, Currency.INR)
        println ">>>>" +  rate
        assert rate == 60.2455
    }
}