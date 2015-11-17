/* Copyright 2015 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.jberger.patterns.bridge.main;

import org.jberger.patterns.bridge.bridge.ModifiableTaxCalculator;
import org.jberger.patterns.bridge.bridge.SeparatedTaxesAlgorithm;
import org.jberger.patterns.bridge.bridge.TaxTotals;
import org.jberger.patterns.bridge.money.Currency;

public class Main {
    public static void main(String[] args) {
        ModifiableTaxCalculator calculator = new ModifiableTaxCalculator(new SeparatedTaxesAlgorithm());
        
        calculator.setRates(0.05, 0.09975);
        Currency subtotal = Currency.parseFromString("100,00");
        TaxTotals totals = calculator.calculate(subtotal);
        
        System.out.println("Sous-total : " + totals.getSubtotal());
        System.out.println("Taxe fédérale : " + totals.getFederal());
        System.out.println("Taxe provinciale : " + totals.getProvincial());
        System.out.println("Total : " + totals.getTotal());
    }
}