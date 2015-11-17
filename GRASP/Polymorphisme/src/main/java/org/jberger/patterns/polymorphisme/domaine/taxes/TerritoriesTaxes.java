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
package org.jberger.patterns.polymorphisme.domaine.taxes;

import org.jberger.patterns.polymorphisme.domaine.money.Currency;

public class TerritoriesTaxes implements SalesTaxes {
    private static final double CANADA_RATE = 0.05;
    
    @Override
    public TaxTotals calculate(Currency subtotal) {
        Currency federal = subtotal.applyPourcentage(CANADA_RATE);
        Currency provincial = new Currency();
        Currency total = subtotal.add(federal);
        return new TaxTotals(subtotal, federal, provincial, total);
    }
}
