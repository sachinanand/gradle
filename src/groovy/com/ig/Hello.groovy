package com.ig

import net.webservicex.Currency


class Hello {

    public static void main(String[] s){
        ConversionRate conversionRate = new ConversionRate()
        println(conversionRate.getConversionRate(Currency.USD, Currency.INR))

    }
}
