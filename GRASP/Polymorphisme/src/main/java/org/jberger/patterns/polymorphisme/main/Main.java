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

package org.jberger.patterns.polymorphisme.main;

import org.jberger.patterns.polymorphisme.domaine.taxes.QuebecTaxes;
import org.jberger.patterns.polymorphisme.domaine.taxes.SalesTaxes;
import org.jberger.patterns.polymorphisme.domaine.taxes.TaxTotals;
import org.jberger.patterns.polymorphisme.domaine.taxes.TerritoriesTaxes;
import org.jberger.patters.polymorphisme.domaine.money.Currency;

public class Main {
    
    static public void main(String[] args) {
        SalesTaxes calculator = new QuebecTaxes();
        
        Currency subtotal = Currency.parseFromString("100,00");
        TaxTotals totals = calculator.calculate(subtotal);
        System.out.println("Sous-total : " + totals.getSubtotal());
        System.out.println("Taxes fédérales : " + totals.getFederal());
        System.out.println("Taxes provinciales : " + totals.getProvincial());
        System.out.println("Total : " + totals.getTotal());
    }
}
