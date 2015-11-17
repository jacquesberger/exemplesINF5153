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

package org.jberger.patterns.bridge.bridge;

import org.jberger.patterns.bridge.money.Currency;

public class SeparatedTaxesAlgorithm implements TaxCalculatorImpl {
    private double provincialRate;
    private double federalRate;
    
    public SeparatedTaxesAlgorithm() {
        provincialRate = 0;
        federalRate = 0;
    }
    
    @Override
    public TaxTotals getTotals(Currency subtotal) {
        Currency federal = subtotal.applyPourcentage(federalRate);
        Currency provincial = subtotal.applyPourcentage(provincialRate);
        Currency total = subtotal.add(federal).add(provincial);
        TaxTotals result = new TaxTotals(subtotal, federal, provincial, total);
        return result;
    }

    @Override
    public void setFederalTaxRate(double percent) {
        federalRate = percent;
    }

    @Override
    public void setProvincialTaxRate(double percent) {
        provincialRate = percent;
    }   
}